/**
 * 库存管理
 * @author chiemy
 *
 */
public class Stock {
	// 库存原有100台电脑
	private static int COMPUTER_NUMBER = 100;
	
	/**
	 * 增加库存
	 * @param number
	 */
	public void increase(int number){
		COMPUTER_NUMBER += number;
		System.out.println("库存数量为" + COMPUTER_NUMBER);
	}
	/**
	 * 减少库存
	 * @param number
	 */
	public void decrease(int number){
		COMPUTER_NUMBER -= number;
		System.out.println("库存数量为" + COMPUTER_NUMBER);
	}
	/**
	 * 获取库存数量
	 * @return
	 */
	public int getStockNumber(){
		return COMPUTER_NUMBER;
	}
	/**
	 * 库存压力较大
	 */
	public void clearStock(){
		Purchase purchase = new Purchase();
		Sale sale = new Sale();
		System.out.println("清理库存数量为:" + COMPUTER_NUMBER);
		sale.offSale();
		purchase.refuseBuyIBM();
	}
	
}
