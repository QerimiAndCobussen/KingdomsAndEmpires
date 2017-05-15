package me.qerimicobussen.kingdomsandempires.Menus;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.qerimicobussen.kingdomsandempires.Managers.ChatColorManager;
import me.qerimicobussen.kingdomsandempires.Managers.MenuManager;

public class ReligionsMenu implements Listener {
	
	public HashMap<String, String> relig = new HashMap<String, String>();

	public Inventory RMInv;
	private ItemStack a, b;

	public ReligionsMenu() {
		RMInv = Bukkit.getServer().createInventory(null, 18,
				ChatColorManager.CCM("                   &3&l~~{&6&lReligionMenu&3&l}~~"));

		a = MenuManager.createItem(Material.NETHER_STAR, "Herobrine");
		b = MenuManager.createItem(Material.GOLDEN_APPLE, "Notch");

		RMInv.setItem(3, a);
		RMInv.setItem(5, b);
	}

	public void ShowReligions(Player p) {
		p.openInventory(RMInv);
	}
	
	@EventHandler
	public void onInvClickRM(InventoryClickEvent e) {
		if (!e.getInventory().equals(RMInv))
			return;
		
		if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Herobrine")) {
			e.getWhoClicked().sendMessage(ChatColorManager.CCM("&6&lYour Faith Is Now: &5&lHerobrine&r"));
			relig.put(e.getWhoClicked().getName(), "Herobrine");
			e.setCancelled(true);
			e.getWhoClicked().closeInventory();
		} else if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Notch")) {
			e.getWhoClicked().sendMessage(ChatColorManager.CCM("&6&lYour Faith Is Now: &e&lNotch&r"));
			relig.put(e.getWhoClicked().getName(), "Notch");
			e.setCancelled(true);
			e.getWhoClicked().closeInventory();
		}
	}
}