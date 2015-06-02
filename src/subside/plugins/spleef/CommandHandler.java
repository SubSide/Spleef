package subside.plugins.spleef;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHandler implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String alias, String[] args) {

		if (!(sender instanceof Player))
			return false;

		if (args.length > 0) {

		}
		return false;
	}
}
