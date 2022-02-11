package comp3021;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World.\nThe time now is:");
		test();
	}

	private static void test(){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
	}
}
