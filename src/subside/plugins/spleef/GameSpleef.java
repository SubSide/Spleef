package subside.plugins.spleef;

import subside.frameworks.gameframework.framework.Game;
import subside.frameworks.gameframework.lobby.LobbyManager;

public class GameSpleef extends Game<RunningGameSpleef, SpleefPlayer> {
	public GameSpleef() {
		super(RunningGameSpleef.class, SpleefPlayer.class, GameSpleef.class);
		this.setDisableCommands(true);
		this.addWhitelistedCommand("spleef");
		this.setName("Spleef");
		LobbyManager.getManager().registerSign("spleef", this);
		this.setPrivateChat(true);
	}

}
