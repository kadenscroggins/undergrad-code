import java.util.ArrayList;

public class Well
{
	public static void main(String[] args)
	{
		ArrayList<Tetronimo> well = new ArrayList<Tetronimo>();
		well.add(new TetronimoL());
		well.add(new TetronimoI());
		well.add(new TetronimoZ());
		well.add(new TetronimoO());
		well.add(new TetronimoT());
		for (Tetronimo t : well)
		System.out.println(t);
	}
}