package force;


public class GameProxy implements IGamePlayer {
	private IGamePlayer player;
	public GameProxy(IGamePlayer player){
		this.player = player;
	}

	@Override
	public void login(String user, String password) {
		System.out.println(">>使用代理");
		player.login(user, password);
	}

	@Override
	public void killBoss() {
		System.out.println(">>使用代理");
		player.killBoss();
	}

	@Override
	public void upgrade() {
		System.out.println(">>使用代理");
		player.upgrade();
	}

	@Override
	public IGamePlayer getProxy() {
		return this;
	}
}
