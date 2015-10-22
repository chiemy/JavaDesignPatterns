
public abstract class HummerModel {
	// 基本方法
	protected abstract void start();
	protected abstract void stop();
	protected abstract void alarm();
	protected abstract void enginBoom();
	// 模板方法
	public final void run(){
		this.start();
		this.enginBoom();
		this.alarm();
		this.stop();
	}
}
