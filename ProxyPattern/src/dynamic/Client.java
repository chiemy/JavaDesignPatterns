package dynamic;

import java.lang.reflect.InvocationHandler;

import force.IGamePlayer;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Throwable{
		IGamePlayer player = new GamePlayer("chiemy");
		InvocationHandler handler = new DynamicProxy(player);
		String [] str = {"chiemy","123456"};
		Class [] type = {String.class,String.class};
		handler.invoke(null, player.getClass().getMethod("login", type), str);
		handler.invoke(null, player.getClass().getMethod("killBoss", null), null);
		handler.invoke(null, player.getClass().getMethod("upgrade", null), null);
	}

}
