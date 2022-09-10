import java.util.*;

public class Movie_Sorter {

	public static void main(String[] args) {
		// System.out.println("Hello Java");

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			int x1 = 100;
			int x2 = 0;
			int x3 = 90;
			int x4 = 21;

			int y1 = 0;
			int y2 = 100;
			int y3 = 17;
			int y4 = 80;

			int dist1 = (int) Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));
			int dist2 = (int) Math.sqrt((x2 - x) * (x2 - x) + (y2 - y) * (y2 - y));
			int dist3 = (int) Math.sqrt((x3 - x) * (x3 - x) + (y3 - y) * (y3 - y));
			int dist4 = (int) Math.sqrt((x4 - x) * (x4 - x) + (y4 - y) * (y4 - y));

			int a = Math.min(dist1, dist2);
			int b = Math.min(a, dist3);
			int c = Math.min(b, dist4);

			if (dist1 == c) {
				System.out.println("Action Film");
			} else if (dist2 == c) {
				System.out.println("Comedy Film");
			} else if (dist3 == c) {
				System.out.println("Action Film");
			} else {
				System.out.println("Comedy Film");
			}
		}
	}

}