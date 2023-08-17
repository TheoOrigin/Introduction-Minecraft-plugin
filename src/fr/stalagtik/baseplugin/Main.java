package fr.stalagtik.baseplugin;

import org.bukkit.plugin.java.JavaPlugin;

import fr.stalagtik.baseplugin.commands.CommandTest;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		System.out.println("stalaplugin load");
		getCommand("discord").setExecutor(new CommandTest());
		getCommand("alert").setExecutor(new CommandTest());
	}

	@Override
	public void onDisable() {
		System.out.println("stalaplugin unload");
	}
}
