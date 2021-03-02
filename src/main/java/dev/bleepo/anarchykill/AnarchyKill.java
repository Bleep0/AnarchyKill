package dev.bleepo.anarchykill;

import dev.bleepo.anarchykill.commands.Kill;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class AnarchyKill extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info(ChatColor.DARK_GREEN + "Loading Config...");
        //config loading
        saveDefaultConfig();
        getConfig().options().copyDefaults(true);
        saveConfig();

        getLogger().info(ChatColor.DARK_GREEN + "Loading Commands...");
        //command loading
        Server server = getServer();
        PluginCommand kill = server.getPluginCommand("kill");
        kill.setExecutor(new Kill(this));

        getLogger().info(ChatColor.DARK_GREEN + "AnarchyKill by Bleepo has been loaded and enabled!");

    }

    @Override
    public void onDisable() {
        getLogger().info(ChatColor.DARK_GREEN + "Goodbye!");
        getLogger().info(ChatColor.DARK_GREEN + "AnarchyKill by Bleepo has been unloaded and disabled!");
    }


}
