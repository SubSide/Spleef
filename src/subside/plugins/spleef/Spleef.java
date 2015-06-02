package subside.plugins.spleef;

import org.bukkit.plugin.java.JavaPlugin;

public class Spleef extends JavaPlugin {
	private static Spleef plugin;
	public GameSpleef spleef;
	
	@Override
	public void onEnable(){
		plugin = this;
		
		spleef = new GameSpleef();
		getCommand("spleef").setExecutor(new CommandHandler());
		
	}
	
	public static Spleef getPlugin(){
		return plugin;
	}
}
