package fr.stalagtik.baseplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


// Things to know:
// get player name: player.getName()  DON'T FORGET TO IMPORT THE CLASS





public class CommandTest implements CommandExecutor {

	// where commands are handled
	@Override 
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		
		if(sender instanceof Player) {
			// define the player who sent the command
			Player player = (Player)sender;
			
			// if the command is "discord" (don't forget to add it to plugin.yml)
			if(cmd.getName().equalsIgnoreCase("discord")) {
				player.sendMessage("§6Join our discord! §9https://discord.gg/nmKfJeRndv");
				return true;
			}
			
			// if the command is "alert" (don't forget to add it to plugin.yml)
			// broadcast is used to display a message to the entire server (visible to everyone)
			if(cmd.getName().equalsIgnoreCase("alert")) {
				// display the player who typed the command
				//Bukkit.broadcastMessage("["+ player.getName() + "] §6Very cool broadcast");
				
				// alert if no arguments:
				if(args.length == 0) {
					player.sendMessage("/alert <message>");
				}
				
				// with arguments:
				if(args.length >= 1) {
					StringBuilder message = new StringBuilder();
					for(String part : args) {
						message.append(part + " ");
						
					}
					Bukkit.broadcastMessage("§6" + message.toString());
				}
				
				return true;
			}
			
		}
		
		return false;
	}
	
	

}
