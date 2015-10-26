package force;


public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IGamePlayer player = new GamePlayer("chiemy");
		player = player.getProxy();
		player.login("a", "b");
		player.killBoss();
		player.upgrade();
	}

}
