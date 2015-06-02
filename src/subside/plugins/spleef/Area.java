package subside.plugins.spleef;


import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

public class Area {
	private Location min;
	private Location max;
	
	public Area(Location min, Location max){
		this.min = min;
		this.max = max;
	}
	
	private boolean isInAABB(Location pos, Location pos2, Location pos3){
		if(min.getBlockX() <= pos.getBlockX() && max.getBlockX() >= pos.getBlockX() && min.getBlockY() <= pos.getBlockY() && max.getBlockY() >= pos.getBlockY() && min.getBlockZ() <= pos.getBlockZ() && max.getBlockZ() >= pos.getBlockZ()){
			return true;
		}
		return false;
	}
	
	public boolean isInArea(OfflinePlayer oPlayer){
		if(!oPlayer.isOnline()){
			return false;
		}
		Player player = oPlayer.getPlayer();
		
		if(player.getWorld() == min.getWorld()){
			Location loc = player.getLocation();
			if(isInAABB(loc, min, max)){
				return true;
			}
		}
		return false;
	}
	
	public Location getMin(){
		return min;
	}
	
	public Location getMax(){
		return max;
	}
}
