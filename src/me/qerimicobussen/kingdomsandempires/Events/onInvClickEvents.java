package me.qerimicobussen.kingdomsandempires.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import me.qerimicobussen.kingdomsandempires.Managers.ChatColorManager;
import me.qerimicobussen.kingdomsandempires.Managers.HashMapsManager;
import me.qerimicobussen.kingdomsandempires.Menus.JobsMenu;

public class onInvClickEvents extends HashMapsManager implements Listener {
	
	private JobsMenu JBInv = new JobsMenu();
	
	@EventHandler
	public void onInvClickJM(InventoryClickEvent e) {
		if (!e.getInventory().equals(JBInv))
			return;

		// Inv Line 1
		if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Farmer")) {
			e.getWhoClicked().sendMessage(ChatColorManager.CCM("&6&lYour Job Is Now: &2&lFarmer&r"));
			jobs.put(e.getWhoClicked().getName(), "Farmer");
			e.setCancelled(true);
			e.getWhoClicked().closeInventory();
		} else if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Miner")) {
			e.getWhoClicked().sendMessage(ChatColorManager.CCM("&6&lYour Job Is Now: &7&lMiner&r"));
			jobs.put(e.getWhoClicked().getName(), "Miner");
			e.setCancelled(true);
			e.getWhoClicked().closeInventory();
		} else if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Hunter")) {
			e.getWhoClicked().sendMessage(ChatColorManager.CCM("&6&lYour Job Is Now: &4&lHunter&r"));
			jobs.put(e.getWhoClicked().getName(), "Hunter");
			e.setCancelled(true);
			e.getWhoClicked().closeInventory();
		} else if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Builder")) {
			e.getWhoClicked().sendMessage(ChatColorManager.CCM("&6&lYour Job Is Now: &e&lBuilder&r"));
			jobs.put(e.getWhoClicked().getName(), "Builder");
			e.setCancelled(true);
			e.getWhoClicked().closeInventory();
		} else if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Lumberjack")) {
			e.getWhoClicked().sendMessage(ChatColorManager.CCM("&6&lYour Job Is Now: &a&lLumberjack&r"));
			jobs.put(e.getWhoClicked().getName(), "Lumberjack");
			e.setCancelled(true);
			e.getWhoClicked().closeInventory();
		} else if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Fisher")) {
			e.getWhoClicked().sendMessage(ChatColorManager.CCM("&6&lYour Job Is Now: &9&lFisher&r"));
			jobs.put(e.getWhoClicked().getName(), "Fisher");
			e.setCancelled(true);
			e.getWhoClicked().closeInventory();
		} else if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Merchant")) {
			e.getWhoClicked().sendMessage(ChatColorManager.CCM("&6&lYour Job Is Now: &5&lMerchant&r"));
			jobs.put(e.getWhoClicked().getName(), "Merchant");
			e.setCancelled(true);
			e.getWhoClicked().closeInventory();

			// Inv Line 2
		} else if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Swordman")) {
			e.getWhoClicked().sendMessage(ChatColorManager.CCM("&6&lYour Job Is Now: &8&lSwordman&r"));
			jobs.put(e.getWhoClicked().getName(), "Swordsman");
			e.setCancelled(true);
			e.getWhoClicked().closeInventory();
		} else if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Archer")) {
			e.getWhoClicked().sendMessage(ChatColorManager.CCM("&6&lYour Job Is Now: &8&lArcher&r"));
			jobs.put(e.getWhoClicked().getName(), "Archer");
			e.setCancelled(true);
			e.getWhoClicked().closeInventory();
		} else if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Knight")) {
			e.getWhoClicked().sendMessage(ChatColorManager.CCM("&6&lYour Job Is Now: &8&lKnight&r"));
			jobs.put(e.getWhoClicked().getName(), "Knight");
			e.setCancelled(true);
			e.getWhoClicked().closeInventory();
		} else if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Guard")) {
			e.getWhoClicked().sendMessage(ChatColorManager.CCM("&6&lYour Job Is Now: &8&lGuard&r"));
			jobs.put(e.getWhoClicked().getName(), "Guard");
			e.setCancelled(true);
			e.getWhoClicked().closeInventory();
		} else if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Axeman")) {
			e.getWhoClicked().sendMessage(ChatColorManager.CCM("&6&lYour Job Is Now: &8&lAxeman&r"));
			jobs.put(e.getWhoClicked().getName(), "Axeman");
			e.setCancelled(true);
			e.getWhoClicked().closeInventory();
		}
	}

}
