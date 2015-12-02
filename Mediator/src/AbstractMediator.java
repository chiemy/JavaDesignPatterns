
public abstract class AbstractMediator {
	protected Purchase purchase;
	protected Sale sale;
	protected Stock stock;
	public AbstractMediator(){
		purchase = new Purchase(this);
		sale = new Sale(this);
		stock = new Stock(this);
	}
	/**
	 * 事件方法
	 * @param str
	 * @param objects
	 */
	public abstract void execute(String str, Object...objects);
}
