import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 随机挑选几个女性
		Random rand = new Random();
		List<IWomen> womens = new ArrayList<IWomen>();
		for (int i = 0; i < 5; i++) {
			womens.add(new Woemn(rand.nextInt(4), "我要去逛街"));
		}
		// 定义三个请示对象
		IHandler father = new Father();
		IHandler husband = new Husband();
		IHandler son = new Son();
		for(int i = 0 ; i < womens.size() ; i++){
			IWomen women = womens.get(i);
			System.out.println("第" + i + "个女性");
			if(women.getType() == 1){
				System.out.println("女儿向父亲请示");
				father.handleMessage(women);
			}else if(women.getType() == 2){
				System.out.println("妻子向丈夫请示");
				husband.handleMessage(women);
			}else if(women.getType() == 3){
				System.out.println("母亲向儿子请示");
				son.handleMessage(women);
			}else{
				//
				System.out.println("不用请示");
			}
		}
	}

}
