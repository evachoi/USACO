import java.util.*;
import java.io.*;
public class CSES1071 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input = in.readLine();
		long tests = Integer.parseInt(input);
		for (long i = 0; i < tests; i++) {
			String yes = in.readLine();
			long y = Integer.parseInt(yes.substring(0, yes.indexOf(" ")));
			long x = Integer.parseInt(yes.substring(yes.indexOf(" ") + 1));
			
			if (y == x) {
				System.out.println(x * (x-1) + 1);
			}
			else if (y < x) {
				if (x % 2 == 0) {
					long base = ((x-1) * (x-1)) + 1;
					System.out.println(base + (y-1));
				} 
				else if (x % 2 == 1) {
					long base = x * x;
					System.out.println(base - (y-1));
				}
			}
			else if (y > x) {
				if (y % 2 == 0) {
					long base = y*y;
					System.out.println(base - (x-1));
				}
				else if (y % 2 == 1) {
					long base = ((y-1) * (y-1)) + 1;
					System.out.println(base + (x-1));
				}
			}
		}
	}

}
