package cn.codetector.minecraftplugins.gamemode4.damagingSnowballs;

import org.bukkit.plugin.java.JavaPlugin;

public class damagingSnowballsMain extends JavaPlugin{
    @Override
    public void onDisable() {
        super.onDisable();
    }

    @Override
    public void onEnable() {
        super.onEnable();
        getServer().getPluginManager().registerEvents(new EventListener(),this);
    }
}
