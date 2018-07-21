package com.ausminersunited;

import com.ausminersunited.commands.Cursecraft;
import com.ausminersunited.eventlisteners.BlockBreak;
import com.ausminersunited.eventlisteners.PlayerDeath;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    // Run on plugin start
    @Override
    public void onEnable() {
        // Event Listeners
        // Listen to BlockBreakEvent
        getServer().getPluginManager().registerEvents(new BlockBreak(), this);
        // Listen to PlayerDeathEvent
        getServer().getPluginManager().registerEvents(new PlayerDeath(), this);

        // Register commands
        // /cursecraft
        this.getCommand("cursecraft").setExecutor(new Cursecraft(this));

        // Output that the plugin is ready
        System.out.println("== Cursecraft Enabled ==");
    }

    // Run on plugin shutdown
    @Override
    public void onDisable() {
        System.out.println("==  Cursecraft Disabled ==");
    }

}
