import java.util.Random;

/**
 * 销售管理
 * @author chiemy
 *
 */
public class Sale {

	/**
	 * 销售电脑
	 * @param number
	 */
	public void sellIBMComputer(int number) {
		Stock stock = new Stock();
		Purchase purchase = new Purchase();
		if(stock.getStockNumber() < number){ // 库存不足
			purchase.buyIBMComputer(number);
		}
		stock.decrease(number);
		System.out.println("销售IBM电脑" + number +"台");
	}
	/**
	 * 获取销售状况
	 * @return 0~100,越大代表销售情况越好
	 */
	public int getSellStatus(){
		Random random = new Random(System.currentTimeMillis());
		int status = random.nextInt(100);
		System.out.println("电脑的销售情况为" + status);
		return status;
	}
	/**
	 * 打折处理
	 */
	public void offSale() {
		Stock stock = new Stock();
		System.out.println("打折销售IBM电脑" + stock.getStockNumber() + "台");
	}
}
