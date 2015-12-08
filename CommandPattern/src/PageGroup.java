/**
 * 美工组
 * @author chiemy
 *
 */
public class PageGroup extends Group {

	@Override
	public void find() {
		System.out.println("找到美工组");
	}

	@Override
	public void add() {
		System.out.println("增加一个界面");
	}

	@Override
	public void delete() {
		System.out.println("删除一个界面");
	}

	@Override
	public void change() {
		System.out.println("修改一个界面");
	}

	@Override
	public void plan() {
		System.out.println("界面变更计划");
	}

}
