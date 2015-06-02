package subside.plugins.spleef;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;

import subside.frameworks.gameframework.framework.RunningGame;

public class RunningGameSpleef extends RunningGame<SpleefPlayer, GameSpleef> {
	private Area snow;
	private Area arena;
	private Location start;

	public RunningGameSpleef(Class<SpleefPlayer> c, GameSpleef game) {
		super(c, game);
	}
	
	public void setAreas(Area snow, Area arena, Location start){
		this.snow = snow;
		this.arena = arena;
		this.start = start;
		
	}
	
	public Area getSnowArea(){
		return snow;
	}
	
	public Area getArena(){
		return arena;
	}
	
	@Override
	public void onStart(){
		setAreas(new Area(new Location(Bukkit.getWorld("world"), 10, 130, 10), new Location(Bukkit.getWorld("world"), 20, 130, 20)),
				new Area(new Location(Bukkit.getWorld("world"), 30, 120, 30), new Location(Bukkit.getWorld("world"), 0, 140, 0)),
				new Location(Bukkit.getWorld("world"), 15, 131, 15));

		for(int x = snow.getMin().getBlockX(); x <= snow.getMax().getBlockX(); x++){
			for(int y = snow.getMin().getBlockY(); y <= snow.getMax().getBlockY(); y++){
				for(int z = snow.getMin().getBlockZ(); z <= snow.getMax().getBlockZ(); z++){
					Bukkit.getWorld("world").getBlockAt(x,y,z).setType(Material.SNOW_BLOCK);
				}
			}
		}
		
		for(SpleefPlayer pl : getPlayers()){
			pl.getPlayer().teleport(start);
		}
	}
	
	@Override
	public void onTick(){
		if(getPlayers().size() < 2){
			end();
		}
	}
	
	@Override
	public void onEnd(){
		String msg = "Game ended, no winner!";
		if(getPlayers().size() == 1){
			msg = "Game ended, winner: "+getPlayers().get(0).getPlayer().getDisplayName()+"!";
		}
		
		broadcast(msg);
		
		remove();
	}

}
