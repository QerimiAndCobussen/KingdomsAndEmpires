package me.qerimicobussen.kingdomsandempires.Managers;

public class ChatColorManager {
	
	public static String CCM(String msg)
    {
        String coloredMsg = "";
        for(int i = 0; i < msg.length(); i++)
        {
            if(msg.charAt(i) == '&')
                coloredMsg += '�';
            else
                coloredMsg += msg.charAt(i);
        }
        return coloredMsg;
    }

}
