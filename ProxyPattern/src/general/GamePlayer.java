package general;
public class GamePlayer implements IGamePlayer {
	private String name;
	public GamePlayer(IGamePlayer player,String name) throws Exception{
		if(player == null){
			throw new Exception("不能创建真实角色");
		}else{
			this.name = name;
		}
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

}
