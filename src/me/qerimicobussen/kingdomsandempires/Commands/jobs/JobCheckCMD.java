package me.qerimicobussen.kingdomsandempires.Commands.jobs;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.qerimicobussen.kingdomsandempires.Managers.ChatColorManager;
import me.qerimicobussen.kingdomsandempires.Managers.ErrorManager;
import me.qerimicobussen.kingdomsandempires.Managers.ErrorTypes;
import me.qerimicobussen.kingdomsandempires.Managers.HashMapsManager;

public class JobCheckCMD extends HashMapsManager implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;

		if (cmd.getName().equalsIgnoreCase("Job")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage(ErrorManager.getErrorMessage(ErrorTypes.PLAYER_ONLY_COMMAND));
			} else {
				if (jobs.get(p.getName()) != null) {
					p.sendMessage(ChatColorManager.CCM("&6&lYour Job Is:&r " + jobs.get(p.getName())));
				} else {
					p.sendMessage(ChatColorManager.CCM("&6&lYou Do Not Have A Job Selected, Do /Jobs To Set A Job"));
				
				}
			}
		}
		return false;
	}

}
