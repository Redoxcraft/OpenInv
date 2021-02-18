package de.redoxcraft.openinv.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class OpenInventoryCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			Player p = (Player) sender;
			if(args.length == 1) {
				if(p.isOp()) {
					Player target = Bukkit.getPlayer(args[0]);
					if(target == null) {
						p.sendMessage(ChatColor.WHITE + "Der Spieler " + args[0] + " ist nicht Online." + ChatColor.LIGHT_PURPLE + "" + ChatColor.ITALIC + " *Leider trägt er alle Wertsachen bei sich*");
						return true;
					}else {
						p.openInventory(target.getInventory());
						p.sendMessage(ChatColor.WHITE + "Inventar von " + target.getName() + "." + ChatColor.LIGHT_PURPLE + "" + ChatColor.ITALIC + " *Du durchsuchst jede noch so kleine Hosentasche*");
						return true;
					}
				}return false;
			}return false;
		}return false;
	}

	
	
}
