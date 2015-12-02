/**
 * 采购管理
 * @author chiemy
 *
 */
public class Purchase extends AbstractColleague{
	public Purchase(AbstractMediator mediator) {
		super(mediator);
	}
	/**
	 * 采购IBM电脑
	 * @param number
	 */
	public void buyIBMComputer(int number){
		this.mediator.execute("purchase.buy", number);
	}
	/**
	 * 不再采购IBM电脑
	 */
	public void refuseBuyIBM() {
		System.out.println("不再采购IBM电脑");
	}
}
