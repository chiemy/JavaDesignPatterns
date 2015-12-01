
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(">>>>采购人员采购电脑<<<<<");
		Purchase purchase = new Purchase();
		purchase.buyIBMComputer(100);
		
		System.out.println(">>>>销售人员销售电脑<<<<");
		Sale sale = new Sale();
		sale.sellIBMComputer(10);
		
		System.out.println(">>>>库存人员清理库存<<<<");
		Stock stock = new Stock();
		stock.clearStock();
	}

}
