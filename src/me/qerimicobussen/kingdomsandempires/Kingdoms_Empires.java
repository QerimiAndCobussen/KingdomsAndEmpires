package me.qerimicobussen.kingdomsandempires;

import org.bukkit.plugin.java.JavaPlugin;

import me.qerimicobussen.kingdomsandempires.Commands.ReligionsCMD;
import me.qerimicobussen.kingdomsandempires.Commands.jobs.JobCheckCMD;
import me.qerimicobussen.kingdomsandempires.Commands.jobs.JobsCMD;
import me.qerimicobussen.kingdomsandempires.Events.onInvClickEvents;
import me.qerimicobussen.kingdomsandempires.Menus.ReligionsMenu;
import net.milkbowl.vault.economy.Economy;

public class Kingdoms_Empires extends JavaPlugin {

	public static Economy econ = null;

	@Override
	public void onEnable() {

		System.out.println("=={ Kingdoms & Empires }==");
		System.out.println("=={ Version: 0.1.5.2   }==");
		System.out.println("=={ ©Qerimi & Cobussen }==");
		System.out.println("=={ For Real Fun Games }==");

		getConfig().options().copyDefaults(true);
		saveConfig();

		KECmds();
		KEEvents();

		super.onEnable();
	}

	@Override
	public void onDisable() {

		super.onDisable();
	}

	public void KECmds() {
		getCommand("Jobs").setExecutor(new JobsCMD());
		getCommand("Religions").setExecutor(new ReligionsCMD());
		getCommand("Job").setExecutor(new JobCheckCMD());

	}

	public void KEEvents() {
		getServer().getPluginManager().registerEvents(new onInvClickEvents(), this);
		getServer().getPluginManager().registerEvents(new ReligionsMenu(), this);
	}

}
