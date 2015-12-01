/**
 * 采购管理
 * @author chiemy
 *
 */
public class Purchase {
	/**
	 * 采购IBM电脑
	 * @param number
	 */
	public void buyIBMComputer(int number){
		Stock stock = new Stock();
		Sale sale = new Sale();
		if(sale.getSellStatus() > 80){
			System.out.println("采购IBM电脑:" + number);
			stock.increase(number);
		}else {
			System.out.println("折半采购IBM电脑:" + number/2);
			stock.increase(number / 2);
		}
	}
	/**
	 * 不再采购IBM电脑
	 */
	public void refuseBuyIBM() {
		System.out.println("不再采购IBM电脑");
	}
}
