package com.ausminersunited.commands;

import com.ausminersunited.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Cursecraft implements CommandExecutor {

    Main main;

    public Cursecraft(Main plugin) {
        main = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        String returnMessage = ChatColor.GOLD + "== " + main.getDescription().getName() + ChatColor.DARK_AQUA + " v" + main.getDescription().getVersion() + ChatColor.GOLD + "==\n" + ChatColor.DARK_AQUA + "Description: " + ChatColor.WHITE + main.getDescription().getDescription() + ChatColor.DARK_AQUA + "\nAuthor: " + ChatColor.WHITE + main.getDescription().getAuthors();
            if (sender.hasPermission(main.getDescription().getCommands().get("cursecraft").get("permission").toString())) {
                sender.sendMessage(returnMessage);
                return true;
            } else {
                //sender.sendMessage(ChatColor.DARK_RED + main.getDescription().getCommands().get("cursecraft").get("permission-message").toString());
                return false;
            }
    }

}
