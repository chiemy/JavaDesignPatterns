
public class Woemn implements IWomen {
	/**
	 * 通过int类型的参数来描述妇女的个人状况
	 * 1--未出嫁
	 * 2--出嫁
	 * 3--夫死
	 */
	private int type = 0;
	private String request = "";
	
	public Woemn(int type, String request){
		this.type = type;
		this.request = request;
	}

	@Override
	public int getType() {
		return type;
	}

	@Override
	public String getRequest() {
		return request;
	}

}
