package subside.plugins.spleef;

import org.bukkit.entity.Player;

import subside.frameworks.gameframework.framework.GamePlayer;

public class SpleefPlayer extends GamePlayer<RunningGameSpleef> {


	public SpleefPlayer(Player player, RunningGameSpleef game) {
		super(player, game);
	}

	@Override
	public void update() {
		if(!getGame().getArena().isInArea(getPlayer())){
			getGame().moveToSpectator(this);
			getGame().broadcast(getPlayer().getDisplayName()+" fell down!");
		}
	}

}
