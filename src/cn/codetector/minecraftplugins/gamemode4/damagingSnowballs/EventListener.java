package cn.codetector.minecraftplugins.gamemode4.damagingSnowballs;

import org.bukkit.Bukkit;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import java.util.Random;

public class EventListener implements Listener{
    @EventHandler
    public void OnSnowHit(EntityDamageByEntityEvent event){
        if(event.getDamager() instanceof Snowball){
            Random rnd = new Random();
            if(event.getEntity() instanceof LivingEntity){
                LivingEntity entity = (LivingEntity)event.getEntity();
                if(rnd.nextInt()%5==0){
                    entity.damage(3);
                }else {
                    entity.damage(2);
                }
            }
        }
    }
}
