import java.util.*;
public class CSES1092 {
	
	static long input;
	static long sum;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		input = sc.nextLong();
		sum = input * (input+1) / 2;
		if (sum % 2 == 0) {
			System.out.println("YES");
			sum /= 2;
			solve();
		}
		else {
			System.out.println("NO");
		}
	}
	
	static void solve() {
		HashSet <Integer> g1 = new HashSet<Integer>();
		HashSet <Integer> g2 = new HashSet<Integer>();
		
		int yes = (int)input;
		
		for (int i = 1; i <= yes; i++) {
			g1.add(i);
		}
		
		while (sum > 0) {
			if (sum - yes < 0) {
				g1.remove((int)sum);
				g2.add((int)sum);
				break;
			}
		else {
			sum -= yes;
			g1.remove(yes);
			g2.add(yes);
			yes--;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(g1.size()).append("\n");
		for (int s : g1) {
			sb.append(s).append(" ");
		}
		
		sb.append("\n").append(g2.size()).append("\n");
		for (int s : g2) {
			sb.append(s).append(" ");
		}
		
		System.out.println(sb.toString());
	}
}