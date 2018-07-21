package com.ausminersunited.eventlisteners;

        import com.ausminersunited.Mathf;
        import org.bukkit.Bukkit;
        import org.bukkit.GameMode;
        import org.bukkit.entity.Player;
        import org.bukkit.event.EventHandler;
        import org.bukkit.event.Listener;
        import org.bukkit.Material;
        import org.bukkit.event.block.BlockBreakEvent;
        import org.bukkit.inventory.ItemStack;

public class BlockBreak implements Listener {

    @EventHandler
    public void OnBlockBreak(BlockBreakEvent event) {
        if(event.getBlock().getType() == Material.NETHERRACK) {
            Player player = event.getPlayer();
            if((player.getGameMode() == GameMode.SURVIVAL) && (player.getInventory().getItemInMainHand().getType().toString().contains("PICKAXE"))) {
                if (Mathf.ChanceCheck(7)) {
                    event.setCancelled(true);
                    event.getBlock().setType(Material.AIR);
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.GOLD_NUGGET));
                }
            }
        }
    }

}
