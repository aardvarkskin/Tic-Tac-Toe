import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Play {
	JFrame frame;
	GridLayout layout;
	JPanel[] panels = new JPanel[9];
	PieceInfo info;

	public Play()
	{
		frame = new JFrame("Tic-Tac-Toe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(400,400);
		info = new PieceInfo();
	}
	public static void main(String[] args)
	{
		Play play = new Play();
		play.initGame();
	}
	public void initGame()
	{
		setUpGridLayout();
		frame.setLayout(layout);
		for( int i = 0; i <= 9; i++)
		{
			
			info.setBorder(panels[i], i);
			frame.add(panels[i]);
		}
	}
	public void setUpGridLayout()
	{
		layout = new GridLayout(3,3);
	}
}
