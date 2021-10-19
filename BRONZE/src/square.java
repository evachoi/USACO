import java.util.*;
import java.io.*;

public class square {
	
	static Scanner in;
	static PrintWriter out;
	static int x1, y1, x2, y2, x3, y3, x4, y4, ans;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		in = new Scanner(new File("square.in"));
		out = new PrintWriter(new File("square.out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() {
		x1 = in.nextInt();
		y1 = in.nextInt();
		x2 = in.nextInt();
		y2 = in.nextInt();
		x3 = in.nextInt();
		y3 = in.nextInt();
		x4 = in.nextInt();
		y4 = in.nextInt();
	}
	
	static void solve() {
		int minX = Math.min(x1, x2);
		minX = Math.min(minX, x3);
		minX = Math.min(minX, x4);
		
		int maxX = Math.max(x1, x2);
		maxX = Math.max(maxX, x3);
		maxX = Math.max(maxX, x4);
		
		int maxY = Math.max(y1,  y2);
		maxY = Math.max(maxY, y3);
		maxY = Math.max(maxY, y4);
		
		int minY = Math.min(y1,  y2);
		minY = Math.min(minY, y3);
		minY = Math.min(minY, y4);
		
		int x = maxX - minX;
		int y = maxY - minY;
		
		ans = Math.max(x, y);
		ans = ans * ans;
		out.println(ans);
	}

}
