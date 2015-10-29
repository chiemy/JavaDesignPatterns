import java.util.Random;


public class Client {
	private static int MAIL_COUNT = 5;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("xx网上商城");
		for (int i = 0; i < MAIL_COUNT; i++) {
			mail.setAppellation(getRandomString(5) + "先生/女士");
			mail.setReceiver(getRandomString(5) + "@" + getRandomString(3) + ".com");
			sendMail(mail);
		}
	}
	
	private static void sendMail(Mail mail){
		System.out.println("---------------------" +
							"\n标题：" + mail.getSubject() +
							"\n收件人：" + mail.getReceiver()+
							"\n内容：" + mail.getContext() + 
							"\n已发送");
	}

	public static String getRandomString(int len){
		String source = "abcdefghijklmnopqrst";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < len; i++) {
			sb.append(source.charAt(random.nextInt(source.length())));
		}
		return sb.toString();
	}
}
