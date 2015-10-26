package general;
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IGamePlayer player = new GamePlayerProxy("chiemy");
		player.login("张三", "123");
		player.killBoss();
		player.upgrade();
	}

}
