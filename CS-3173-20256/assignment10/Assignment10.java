public class Assignment10 {

	public static void main(String[] args) {
		int ax = 0;
		int bx = 0;
		int cx = 0;
		int dx = 0;

		boolean comparison = false;

		System.out.println(""); //add blank line for prettiness

		ax = 15;
		System.out.println("Set AX to " + ax);

		bx = 30;
		System.out.println("Set BX to " + bx);

		ax = move(ax, bx);
		System.out.println("Moved BX into AX");
		System.out.println("AX is equal to " + ax);

		ax = add(ax, bx);
		System.out.println("Called add function for AX and BX");
		System.out.println("AX is equal to " + ax);

		cx = move(cx, 100);
		System.out.println("Moved 100 into CX");
		System.out.println("CX is equal to " + cx);

		ax = increment(ax);
		System.out.println("Called increment function for AX");
		System.out.println("AX is equal to " + ax);

		comparison = compare(ax, bx);
		System.out.println("Called compare function for AX and BX");
		System.out.println("Result of comparison: " + comparison);

		dx = move(dx, ax);
		System.out.println("Moved AX into DX");
		System.out.println("DX is equal to " + dx);

		comparison = compare(ax, dx);
		System.out.println("Called compare function for AX and DX");
		System.out.println("Result of comparison: " + comparison);

		System.out.println(""); //add blank line for prettiness
	}

	public static int move(int ax, int bx) {
		ax = bx;
		return bx;
	}

	public static int add(int ax, int bx) {
		ax += bx;
		return ax;
	}

	public static int decrement(int ax) {
		ax -= 1;
		return ax;
	}

	public static int increment(int ax) {
		ax += 1;
		return ax;
	}

	public static boolean compare(int ax, int bx) {
		return (ax == bx);
	}
	
}