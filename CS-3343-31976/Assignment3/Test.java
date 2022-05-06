public class Test
{
	public static void main(String[] args) {
		Channel<String> mailBox = new MessageQueue<String>();
		mailBox.send("Hello World");

		String mailString = mailBox.receive();
		System.out.println(mailString);
	}
}
