import java.io.*;
import java.util.*;
public class CSES1069 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input = in.readLine();
		int count = 1;
		int max = 0;
		for (int i = 0; i < input.length()-1; i++) {
			if (input.charAt(i) == input.charAt(i+1)) {
				count++;
			} else {
				if (count >= max) {
					max = count;
				}
				count = 1;
			}
		}
		if (count >= max) {
			max = count;
		}
		System.out.println(max);
	}

}