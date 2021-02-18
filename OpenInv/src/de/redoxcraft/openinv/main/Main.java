package de.redoxcraft.openinv.main;

import org.bukkit.plugin.java.JavaPlugin;

import de.redoxcraft.openinv.commands.OpenInventoryCommand;

public class Main extends JavaPlugin {

	public void onEnable() {
		System.out.println(this.getDescription().getName() + " " + this.getDescription().getVersion() + " geladen.");
		
		getCommand("inventar").setExecutor(new OpenInventoryCommand());
	}
	
}
