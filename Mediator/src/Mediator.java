
public class Mediator extends AbstractMediator {

	@Override
	public void execute(String str, Object... objects) {
		if(str.equals("purchase.buy")){
			this.buyComputer((Integer)objects[0]);
		}else if(str.equals("sale.sell")){
			this.sellComputer((Integer)objects[0]);
		}else if(str.equals("sale.offsale")){
			this.offSale();
		}else if(str.equals("stock.clear")){
			this.clearStock();
		}
	}

	private void buyComputer(int number){
		if(super.sale.getSellStatus() > 80){
			System.out.println("采购IBM电脑:" + number);
			stock.increase(number);
		}else {
			System.out.println("折半采购IBM电脑:" + number/2);
			stock.increase(number / 2);
		}
	}
	
	private void sellComputer(int number){
		if(super.stock.getStockNumber() < number){ // 库存不足
			super.purchase.buyIBMComputer(number);
		}
		super.stock.decrease(number);
	}
	
	private void offSale(){
		System.out.println("打折销售IBM电脑" + super.stock.getStockNumber() + "台");
	}
	
	private void clearStock(){
		super.sale.offSale();
		super.purchase.refuseBuyIBM();
	}
}
