
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Group group = new RequirementGroup();
		group.find();
		group.add();
		group.plan();
		
		Invoker invoker = new Invoker();
		invoker.setCommand(new DeletePageCommand());
		invoker.action();
	}

}
