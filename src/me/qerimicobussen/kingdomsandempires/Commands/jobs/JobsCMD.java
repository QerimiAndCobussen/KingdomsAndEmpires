package me.qerimicobussen.kingdomsandempires.Commands.jobs;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.qerimicobussen.kingdomsandempires.Managers.ErrorManager;
import me.qerimicobussen.kingdomsandempires.Managers.ErrorTypes;
import me.qerimicobussen.kingdomsandempires.Menus.JobsMenu;

public class JobsCMD implements CommandExecutor {
	
	private JobsMenu menu = new JobsMenu();
	
	@Override
	public boolean onCommand(CommandSender CS, Command cmd, String label, String[] args) {
		Player p = (Player) CS;

		if (cmd.getName().equalsIgnoreCase("Jobs")) {
			if (!(CS instanceof Player)) {
				CS.sendMessage(ErrorManager.getErrorMessage(ErrorTypes.PLAYER_ONLY_COMMAND));
			} else {
				menu.ShowJobs(p);
				return true;
			}

		}
		return true;
	}

}
