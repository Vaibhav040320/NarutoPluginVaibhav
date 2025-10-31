package com.vaibhav.naruto;

import org.bukkit.plugin.java.JavaPlugin;

public class NarutoUniversePlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Naruto Plugin Vaibhav Enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Naruto Plugin Vaibhav Disabled!");
    }
}
