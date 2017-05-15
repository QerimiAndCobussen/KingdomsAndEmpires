package me.qerimicobussen.kingdomsandempires.Menus;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.qerimicobussen.kingdomsandempires.Managers.ChatColorManager;
import me.qerimicobussen.kingdomsandempires.Managers.MenuManager;

public class JobsMenu {

	public Inventory JBInv;
	private ItemStack a1, b1, c1, d1, e1, f1, g1;
	private ItemStack a2, b2, c2, d2, e2;

	public JobsMenu() {
		JBInv = Bukkit.getServer().createInventory(null, 18,
				ChatColorManager.CCM("                   &3&l~~{&6&lJobMenu&3&l}~~"));

		// Inv Line 1
		a1 = MenuManager.createItem(Material.IRON_HOE, "Farmer");
		b1 = MenuManager.createItem(Material.IRON_PICKAXE, "Miner");
		c1 = MenuManager.createItem(Material.WOOD_SWORD, "Hunter");
		d1 = MenuManager.createItem(Material.BRICK, "Builder");
		e1 = MenuManager.createItem(Material.STONE_AXE, "Lumberjack");
		f1 = MenuManager.createItem(Material.FISHING_ROD, "Fisher");
		g1 = MenuManager.createItem(Material.CHEST, "Merchant");

		JBInv.setItem(1, a1);
		JBInv.setItem(2, b1);
		JBInv.setItem(3, c1);
		JBInv.setItem(4, d1);
		JBInv.setItem(5, e1);
		JBInv.setItem(6, f1);
		JBInv.setItem(7, g1);

		// Inv Line 2
		a2 = MenuManager.createItem(Material.STONE_SWORD, "Swordman");
		b2 = MenuManager.createItem(Material.BOW, "Archer");
		c2 = MenuManager.createItem(Material.IRON_SWORD, "Knight");
		d2 = MenuManager.createItem(Material.SHIELD, "Guard");
		e2 = MenuManager.createItem(Material.IRON_AXE, "Axeman");

		JBInv.setItem(10, a2);
		JBInv.setItem(11, b2);
		JBInv.setItem(12, c2);
		JBInv.setItem(13, d2);
		JBInv.setItem(14, e2);
	}

	public void ShowJobs(Player p) {
		p.openInventory(JBInv);
	}
}