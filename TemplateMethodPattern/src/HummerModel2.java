
public class HummerModel2 extends HummerModel {

	@Override
	protected void start() {
		System.out.println("h2启动");
	}

	@Override
	protected void stop() {
		System.out.println("h2停止");
	}

	@Override
	protected void alarm() {
		System.out.println("h2鸣笛");
	}

	@Override
	protected void enginBoom() {
		System.out.println("h2的引擎声音");
	}

}
