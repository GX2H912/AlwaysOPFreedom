package me.totalfreedom.totalfreedommod.command;

import me.totalfreedom.totalfreedommod.rank.Rank;
import me.totalfreedom.totalfreedommod.util.FUtil;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

@CommandPermissions(level = Rank.SUPER_ADMIN, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "The one and only Pusheen", usage = "/<command>")
public class Command_pusheen extends FreedomCommand
{
    
    @Override
    public boolean run(CommandSender sender, Player playerSender, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        String name = sender.getName();
        
        if (args.length > 1)
        {
            msg(ChatColor.RED + "Incorrect args!");
            return false;
        }
        
        switch(name)
        {
            case "Enderbreeze672":
                FUtil.adminAction(name, "Summoning PUSHEEN!!!!", true);
                for (Player player : server.getOnlinePlayers())
                {
                    ItemStack pusheen = new ItemStack(Material.CAKE, 1);
                    ItemMeta meta = pusheen.getItemMeta();
                    meta.setDisplayName(ChatColor.BLUE + "Pusheen");
                    pusheen.setItemMeta(meta);
                    player.getInventory().addItem(pusheen);
                }
            case "FireCrystal12":
                FUtil.adminAction(name, "Sending Obvivion over Pusheen! (Use )", true):
                for (Player player : server.getOnlinePlayers())
                {
                    ItemStack pusheen = new ItemStack(Material.SWORD, 1):
                }
            break;
        default:
                msg(ChatColor.RED + "Well, anyways Enderbreeze672 owns this command aka FireCrystal12's sister");
                break;
        }
        return true;
    }
}
