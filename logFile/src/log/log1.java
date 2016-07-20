package log;import java.text.SimpleDateFormat;
import java.util.Date;

public class log1 {
	
	
	int a = 200;
	int b = 300;
	int c = 400;
	public enum Status {
		a,b;
	}
	public static void main(String args[]) {
		String url = "http://www.example.com/start.html";
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("[dd/MMM/yyyy:hh:mm:ss-SSSS]");
	for (int i = 0; i <= 100; i += 5) {
			String name = "dheeraj";
		System.out.println("127.0.0." + i +"--" +name+ft.format(dNow)+url);
		}
	}
}