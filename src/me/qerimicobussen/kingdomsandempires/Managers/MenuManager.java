package me.qerimicobussen.kingdomsandempires.Managers;

import java.util.Arrays;

import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.Wool;

public class MenuManager {
	
	public static ItemStack createItem(Material M, String name) {
		ItemStack i = new ItemStack(M);
		ItemMeta im = i.getItemMeta();
		im.setDisplayName(name);
		im.setLore(Arrays.asList("Set your Job to: " + name.toLowerCase()));
		i.setItemMeta(im);
		return i;
	}
	
	public static ItemStack createWool(DyeColor D, String name) {
		ItemStack i = new ItemStack(new Wool(D).toItemStack(1));
		ItemMeta im = i.getItemMeta();
		im.setLore(Arrays.asList("Set your Job to: " + name.toLowerCase()));
		return i;		
	}
}