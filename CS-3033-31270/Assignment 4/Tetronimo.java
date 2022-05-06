abstract class Tetronimo {
	public enum Color {
		BLUE, RED, GREEN, ORANGE, YELLOW;
	}

	protected int[][] shape;
	private Color color;

	protected Tetronimo(Color color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		String colorString;
		switch (color) {
			case BLUE:
				colorString = "Blue";
				break;
			case RED:
				colorString = "Red";
				break;
			case GREEN:
				colorString = "Green";
				break;
			case ORANGE:
				colorString = "Orange";
				break;
			case YELLOW:
				colorString = "Yellow";
				break;
			default:
				colorString = "ERROR";
				break;
		}

		String asciiShape = "";
		for (int i=0; i<shape.length; i++) {
			for (int j=0; j<shape[i].length; j++) {
				if (shape[i][j] == 0) asciiShape += " ";
				else asciiShape += "*";
			}
			if (i<shape.length-1) asciiShape += "\n";
		}

		return (colorString + ", " + getShape() + "\n" + asciiShape);
	}

	abstract String getShape();
}

class TetronimoL extends Tetronimo {
	String getShape() {
		return "L";
	}
	TetronimoL() {
		super(Color.BLUE);
		shape = new int[][] { 
								{1,0,0,0},
								{1,0,0,0},
								{1,1,0,0},
								{0,0,0,0}
							};
	}
}

class TetronimoI extends Tetronimo {
	String getShape() {
		return "I";
	}
	TetronimoI() {
		super(Color.RED);
		shape = new int[][] { 
								{0,0,0,0},
								{1,1,1,1},
								{0,0,0,0},
								{0,0,0,0}
							};
	}
}

class TetronimoZ extends Tetronimo {
	String getShape() {
		return "Z";
	}
	TetronimoZ() {
		super(Color.GREEN);
		shape = new int[][] { 
								{0,0,0,0},
								{1,1,0,0},
								{0,1,1,0},
								{0,0,0,0}
							};
	}
}

class TetronimoO extends Tetronimo {
	String getShape() {
		return "O";
	}
	TetronimoO() {
		super(Color.ORANGE);
		shape = new int[][] { 
								{0,0,0,0},
								{1,1,0,0},
								{1,1,0,0},
								{0,0,0,0}
							};
	}
}

class TetronimoT extends Tetronimo {
	String getShape() {
		return "T";
	}
	TetronimoT() {
		super(Color.YELLOW);
		shape = new int[][] { 
								{0,0,0,0},
								{1,1,1,0},
								{0,1,0,0},
								{0,0,0,0}
							};
	}
}