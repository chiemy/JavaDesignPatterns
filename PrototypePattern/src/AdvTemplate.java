/**
 * 广告信模板<br>
 * 一般从数据库获取
 * @author chiemy
 *
 */
public class AdvTemplate {
	private String advSubject = "双11来啦";
	private String advContext = "双11来啦，百万商品低至5折，赶快来抢购";
	/**
	 * 广告邮件内容
	 * @return
	 */
	public String getAdvContext() {
		return advContext;
	}
	/**
	 * 广告邮件名称
	 * @return
	 */
	public String getAdvSubject() {
		return advSubject;
	}
}
