import java.util.ArrayList;
import java.util.List;


public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CarBuilder builder1 = new BenzBuilder();
		List<String> sequence1 = new ArrayList<String>();
		sequence1.add("enginBoom");
		sequence1.add("start");
		sequence1.add("stop");
		builder1.setSequence(sequence1);
		CarModel benz = builder1.getCardModel();
		benz.run();
		
		CarBuilder builder2 = new BWMBuilder();
		List<String> sequence2 = new ArrayList<String>();
		sequence2.add("start");
		sequence2.add("enginBoom");
		sequence2.add("stop");
		builder2.setSequence(sequence2);
		CarModel bwm = builder2.getCardModel();
		bwm.run();
	}

}
