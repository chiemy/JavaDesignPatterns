import java.util.List;


public class BenzBuilder extends CarBuilder {
	private BenzModel model;
	public BenzBuilder(){
		model = new BenzModel();
	}
	@Override
	public void setSequence(List<String> sequence) {
		model.setSequence(sequence);
	}

	@Override
	public BenzModel getCardModel() {
		return model;
	}

}
