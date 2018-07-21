package com.ausminersunited.eventlisteners;

import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class PlayerDeath implements Listener {
    @EventHandler
    public void OnPlayerDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        if(player.isDead()) {
            if (player.getKiller() instanceof Player) {
                // Drop skull on player death (when killed)
                ItemStack skullItem = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
                SkullMeta metaSkull = (SkullMeta) skullItem.getItemMeta();
                metaSkull.setOwningPlayer(player);
                player.getWorld().dropItemNaturally(player.getLocation(), skullItem);
            }
        }
    }
}
