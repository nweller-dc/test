import java.io.FileReader;
import java.io.BufferedReader;

public class test {
	public static void main(String [] args) {
		try {
		new BufferedReader(new FileReader("gnu"));
		} catch (Exception e) {}
		try {
		new BufferedReader(new FileReader("gnu"));
		} catch (Exception e) {}
	}
}
//26
