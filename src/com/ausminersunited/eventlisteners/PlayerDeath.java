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
            if (player.getKiller() != null) { // Check if player was killed by another player, rather than other means
                // Drop player's skull on player death (when killed)
                ItemStack skullItem = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
                SkullMeta skullMeta = (SkullMeta) skullItem.getItemMeta();
                skullMeta.setOwningPlayer(player);
                skullItem.setItemMeta(skullMeta);
                player.getWorld().dropItemNaturally(player.getLocation(), skullItem);
            }
        }
    }
}
