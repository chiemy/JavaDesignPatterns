/**
 * 父亲类
 * @author chiemy
 *
 */
public class Father implements IHandler{
	/**
	 * 未出嫁的女儿请求父亲
	 */
	@Override
	public void handleMessage(IWomen women) {
		System.out.println("女儿的请求是：" + women.getRequest());
		System.out.println("父亲的答复是：同意");
	}

}
