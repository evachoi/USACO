import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class CSES1094 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input = in.readLine();
		long size = Integer.parseInt(input);
		String string = in.readLine();
		StringTokenizer st = new StringTokenizer(string);
		long previous = long.parseLong(st.nextToken());
		long current = 0;
		for (int i = 0; i < ) {
			
		}
		
		long count = 0;
		
		if (current < previous) {
			count += previous - current;
		} else {
			previous = current;
		}
		
	}

}