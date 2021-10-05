import java.util.*;
public class CSES1068 {
	static Scanner in;
	static long n;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		n = in.nextLong();
				
		StringBuilder sb = new StringBuilder();
		sb.append(n);
		while (n != 1) {
			if (n % 2 == 0) n /= 2;
			else n = (n * 3) + 1;
			sb.append(" ").append(n);
		}
		System.out.println(sb.toString());
	}

}