import java.util.List;

public abstract class CarModel {
	private List<String> sequence;

	// 基本方法
	protected abstract void start();

	protected abstract void stop();

	protected abstract void alarm();

	protected abstract void engineBoom();

	// 模板方法
	public final void run() {
		if (sequence != null) {
			int size = sequence.size();
			for (int i = 0; i < size; i++) {
				String type = sequence.get(i);
				if (type.equalsIgnoreCase("start")) {
					this.start();
				} else if (type.equalsIgnoreCase("engineBoom")) {
					this.engineBoom();
				} else if (type.equalsIgnoreCase("alarm")) {
					this.alarm();
				} else if (type.equalsIgnoreCase("stop")) {
					this.stop();
				}
			}
		} else {
			this.start();
			this.engineBoom();
			this.alarm();
			this.stop();
		}
	}

	public final void setSequence(List<String> sequence) {
		this.sequence = sequence;
	}
}
