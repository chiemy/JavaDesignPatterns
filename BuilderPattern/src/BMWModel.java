
public class BMWModel extends CarModel {

	@Override
	protected void start() {
		System.out.println("奔驰 start");
	}

	@Override
	protected void stop() {
		System.out.println("奔驰 stop");
	}

	@Override
	protected void alarm() {
		System.out.println("奔驰 alarm");
	}

	@Override
	protected void engineBoom() {
		System.out.println("奔驰 enginBoom");
	}

}
