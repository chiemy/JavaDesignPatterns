
public class HummerModel1 extends HummerModel {

	@Override
	protected void start() {
		System.out.println("h1启动");
	}

	@Override
	protected void stop() {
		System.out.println("h1停止");
	}

	@Override
	protected void alarm() {
		System.out.println("h1鸣笛");
	}

	@Override
	protected void enginBoom() {
		System.out.println("h1的引擎声音");
	}
	

	@Override
	protected boolean isAlarm() {
		return false;
	}
	
}
