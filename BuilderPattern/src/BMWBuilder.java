import java.util.List;


public class BMWBuilder extends CarBuilder {
	private BMWModel bwm;
	
	public BMWBuilder(){
		bwm = new BMWModel();
	}
	
	@Override
	public void setSequence(List<String> sequence) {
		bwm.setSequence(sequence);
	}

	@Override
	public BMWModel getCardModel() {
		return bwm;
	}

}
