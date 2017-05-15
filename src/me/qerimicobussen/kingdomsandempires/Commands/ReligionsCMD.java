package me.qerimicobussen.kingdomsandempires.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.qerimicobussen.kingdomsandempires.Managers.ErrorManager;
import me.qerimicobussen.kingdomsandempires.Managers.ErrorTypes;
import me.qerimicobussen.kingdomsandempires.Menus.ReligionsMenu;

public class ReligionsCMD implements CommandExecutor {

	private ReligionsMenu Rmenu = new ReligionsMenu();

	@Override
	public boolean onCommand(CommandSender CS, Command cmd, String label, String[] args) {
		Player p = (Player) CS;

		if (cmd.getName().equalsIgnoreCase("Religions")) {
			if (!(CS instanceof Player)) {
				CS.sendMessage(ErrorManager.getErrorMessage(ErrorTypes.PLAYER_ONLY_COMMAND));
			} else {
				Rmenu.ShowReligions(p);
				return true;
			}

		}
		return true;
	}

}
