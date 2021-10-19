import java.util.*;
public class CSES1072 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		long input = sc.nextInt();
		long answer = 0;
		for (long i = 1; i <= input; i++) {
			answer = ((i*i) * ((i*i) - 1)) / 2;
			answer -= ((i-2) * (i-1)) * 4;
			System.out.println(answer);
		}
	}

}
