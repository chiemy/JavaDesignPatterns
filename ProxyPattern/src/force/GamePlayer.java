package force;


public class GamePlayer implements IGamePlayer {
	private String name ="";
	private IGamePlayer proxy;
	
	public GamePlayer(String name){
		this.name = name;
	}
	
	@Override
	public void login(String user, String password) {
		if(isProxy()){
			System.out.println(">>" + this.name  + "登陆");
		}else{
			System.out.println("请使用代理访问");
		}
	}

	@Override
	public void killBoss() {
		if(isProxy()){
			System.out.println(">>" + this.name  + "打怪");
		}else{
			System.out.println("请使用代理访问");
		}
	}

	@Override
	public void upgrade() {
		if(isProxy()){
			System.out.println(">>" + this.name  + "升级");
		}else{
			System.out.println("请使用代理访问");
		}
	}

	@Override
	public IGamePlayer getProxy() {
		proxy = new GameProxy(this);
		return proxy;
	}
	
	private boolean isProxy() {
		return proxy != null;
	}
}
