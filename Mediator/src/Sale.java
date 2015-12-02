import java.util.Random;

/**
 * 销售管理
 * @author chiemy
 *
 */
public class Sale extends AbstractColleague{

	public Sale(AbstractMediator mediator) {
		super(mediator);
	}
	/**
	 * 销售电脑
	 * @param number
	 */
	public void sellIBMComputer(int number) {
		super.mediator.execute("sale.sell", number);
		System.out.println("销售IBM电脑" + number + "台");
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
		super.mediator.execute("sale.offsale");
	}
}
