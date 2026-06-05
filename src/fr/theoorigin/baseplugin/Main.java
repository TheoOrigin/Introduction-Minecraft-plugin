package fr.theoorigin.baseplugin;

import org.bukkit.plugin.java.JavaPlugin;

import fr.theoorigin.baseplugin.commands.CommandTest;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		System.out.println("theooriginplugin load");
		getCommand("discord").setExecutor(new CommandTest());
		getCommand("alert").setExecutor(new CommandTest());
	}

	@Override
	public void onDisable() {
		System.out.println("theooriginplugin unload");
	}
}
