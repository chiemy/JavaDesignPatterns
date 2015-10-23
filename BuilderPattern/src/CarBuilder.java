import java.util.List;


public abstract class CarBuilder {
	// 设置组装顺序
	public abstract void setSequence(List<String> sequence);
	// 获取给定顺序的车辆模型
	public abstract CarModel getCardModel();
}
