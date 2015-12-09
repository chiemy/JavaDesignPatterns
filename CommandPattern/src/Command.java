
public abstract class Command {
	
	public Command(){
		rg = new RequirementGroup();
		pg = new PageGroup();
		cg = new CodeGroup();
	}
	
	protected RequirementGroup rg;
	protected PageGroup pg;
	protected CodeGroup cg;
	
	public abstract void excute();
}
