import java.util.List;


public class BWMBuilder extends CarBuilder {
	private BWMModel bwm;
	
	public BWMBuilder(){
		bwm = new BWMModel();
	}
	
	@Override
	public void setSequence(List<String> sequence) {
		bwm.setSequence(sequence);
	}

	@Override
	public BWMModel getCardModel() {
		return bwm;
	}

}
