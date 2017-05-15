package me.qerimicobussen.kingdomsandempires.Managers;

public class ErrorManager {

	public static String getErrorMessage(ErrorTypes type) {
		String msg = "";
		if(type == ErrorTypes.PLAYER_ONLY_COMMAND) {
			msg = ChatColorManager.CCM("&4&lThis Command Can Only Be Used By Players!");
		} else if(type == ErrorTypes.DOES_NOT_HAVE_PERMISSION) {
			msg = ChatColorManager.CCM("&4&lYou Don't Have Permission To Use This Command!");
		} else if(type == ErrorTypes.WRONG_ARGS){
			msg = ChatColorManager.CCM("&4&lWrong Arguments!");
		} else if (type == ErrorTypes.NATION_ALREADY_EXIST) {
			msg = ChatColorManager.CCM("&4&lThis Nation ALready Exist");
		}
		return msg;
	}
	
}
