package general;
public class GamePlayerProxy implements IGamePlayer {
	private GamePlayer player;
	public GamePlayerProxy(String name){
		try {
			player = new GamePlayer(this, name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void login(String name, String password) {
		player.login(name, password);
	}

	@Override
	public void killBoss() {
		player.killBoss();
	}

	@Override
	public void upgrade() {
		player.upgrade();
	}
}
