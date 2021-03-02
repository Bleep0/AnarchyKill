package dev.bleepo.anarchykill.commands;

import dev.bleepo.anarchykill.AnarchyKill;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Kill implements CommandExecutor {
    private final AnarchyKill plugin;

    public Kill(AnarchyKill plugin) {
        this.plugin = plugin;
    }
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equals("kill")) {
            Player player = (Player) sender;
            String killMessage = plugin.getConfig().getString("killmessage");
            player.setHealth(0);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', killMessage.replace("{player}", player.getDisplayName())));

        }
        return true;
    }
}
