import javax.swing.JOptionPane;


public class Driver {
String s = "";
	public Driver()
	{
		s =JOptionPane.showInputDialog("Would you like play one player or two player? Answer 'one' or 'two' ");
		
		if (s.equals("one"))
		{
			GameOne g1 = new GameOne();
			//g1.playGame();
		}
		else if (s.equals("two"))
		{
			Game g2 = new Game();
			//g2.playGame();
		}
	}
	public static void main(String[] args)
	{
		Driver d = new Driver();
	}
}
