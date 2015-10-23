import java.util.ArrayList;
import java.util.List;


public class Director {
	private List<String> sequence;
	private BenzBuilder benzBuilder;
	private BMWBuilder bmwBuilder;
	public Director(){
		sequence = new ArrayList<String>();
		benzBuilder = new BenzBuilder();
		bmwBuilder = new BMWBuilder();
	}
	/**
	 * A类型奔驰车，只执行start和stop方法
	 * @return
	 */
	public BenzModel getABenzModel() {
		sequence.clear();
		sequence.add("start");
		sequence.add("stop");
		benzBuilder.setSequence(sequence);
		return benzBuilder.getCardModel();
	}
	/**
	 * B类型奔驰车，执行start，engineBoom，stop
	 * @return
	 */
	public BenzModel getBBenzModel() {
		sequence.clear();
		sequence.add("start");
		sequence.add("engineBoom");
		sequence.add("stop");
		benzBuilder.setSequence(sequence);
		return benzBuilder.getCardModel();
	}
	
	/**
	 * A类型宝马车，只执行start，engineBoom，stop方法
	 * @return
	 */
	public BMWModel getABMWModel() {
		sequence.clear();
		sequence.add("start");
		sequence.add("engineBoom");
		sequence.add("stop");
		bmwBuilder.setSequence(sequence);
		return bmwBuilder.getCardModel();
	}
	/**
	 * B类型宝马车，执行start，alarm，stop
	 * @return
	 */
	public BMWModel getBBMWModel() {
		sequence.clear();
		sequence.add("start");
		sequence.add("alarm");
		sequence.add("stop");
		bmwBuilder.setSequence(sequence);
		return bmwBuilder.getCardModel();
	}
}
