package fr.stalagtik.baseplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


//choses a savoir :
//récupérer le nom d'un joueur : player.getName()   NE PAS OUBLIER D'IMPORTER LA CLASSE





public class CommandTest implements CommandExecutor {

	//la ou il y a les commandes
	@Override 
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		
		if(sender instanceof Player) {
			//defini player qui envoie la commande
			Player player = (Player)sender;
			
			//si la commande c'est "discord" (ne pas oublier de mettre dans plugin.yml)
			if(cmd.getName().equalsIgnoreCase("discord")) {
				player.sendMessage("§6Rejoint le discord ! §9https://discord.gg/nmKfJeRndv");
				return true;
			}
			
			//si la commande c'est "alert" (ne pas oublier de mettre dans plugin.yml)
			//broadcast c'est pour afficher sur tout le serveur (visible par tout le monde)
			if(cmd.getName().equalsIgnoreCase("alert")) {
				//on affiche le joueur qui a tapé la commande
				//Bukkit.broadcastMessage("["+ player.getName() + "] §6Trop bien le broadcast");
				
				//alert si pas d'arguments :
				if(args.length == 0) {
					player.sendMessage("/alert <message>");
				}
				
				//avec des argument :
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
