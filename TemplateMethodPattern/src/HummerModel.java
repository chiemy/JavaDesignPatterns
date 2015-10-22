
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
		if(this.isAlarm()){
			this.alarm();
		}
		this.stop();
	}
	// 钩子方法
	protected boolean isAlarm(){
		return true;
	}
}
