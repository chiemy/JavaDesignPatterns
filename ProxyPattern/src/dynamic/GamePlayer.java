package dynamic;

import force.IGamePlayer;


public class GamePlayer implements IGamePlayer {
	private String name;
	public GamePlayer(String name){
		this.name = name;
	}
	
	@Override
	public void login(String name, String password) {
		System.out.println(">>>登陆成功");
	}

	@Override
	public void killBoss() {
		System.out.println(">>>" + this.name + "杀怪");
	}

	@Override
	public void upgrade() {
		System.out.println(">>>" + this.name + "升级了");
	}

	@Override
	public IGamePlayer getProxy() {
		// TODO Auto-generated method stub
		return null;
	}

}
