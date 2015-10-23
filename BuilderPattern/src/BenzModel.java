
public class BenzModel extends CarModel {

	@Override
	protected void start() {
		System.out.println("宝马 start");
	}

	@Override
	protected void stop() {
		System.out.println("宝马 stop");
	}

	@Override
	protected void alarm() {
		System.out.println("宝马 alarm");
	}

	@Override
	protected void enginBoom() {
		System.out.println("宝马 enginBoom");
	}

}
