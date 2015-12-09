
public class DeletePageCommand extends Command {

	@Override
	public void excute() {
		super.pg.find();
		super.pg.delete();
		super.pg.plan();
	}

}
