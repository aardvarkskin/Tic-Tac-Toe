import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;

public class Game {
JFrame frame;
GridLayout layout;
TwoPlayer player;
JPanel[] panels;
PieceInfo piece = new PieceInfo();
TwoPlayer tp = new TwoPlayer(); 
	public Game()
	{
		frame = new JFrame("Tic-Tac-Toe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(400,400);
		player = new TwoPlayer();
		panels = new JPanel[9];
		playGame();

	}
	

	public void setUp()
	{
		for (int i =0; i < 9; i++)
		{
			panels[i]= new JPanel();
		}
		setUpGridLayout();
		frame.setLayout(layout);
		for (int i = 0; i < 9; i++)
		{
			piece.setBorder(panels[i], i);
			frame.add(panels[i]);
		}
	}
	public void playGame()
	{
		setUp();
		userInput();
	}
	public void userInput()
	{
		for (int i = 0; i < 9; i++)
		{
			panels[i].addMouseListener(new MouseListener(){
				public void mouseClicked(MouseEvent e)
				{
					 Object source = e.getSource();
					 for(int i  = 0; i < 9; i++)
					 {
						 if(((JPanel)source).equals(panels[i]))
						 {
							 player.userPlay(i);
							 redraw();
						 }
					 } 
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub	
				}
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub	
				}
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub	
				}
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub	
					}
			});
		}
	}
	public void redraw()
	{
		for (int i = 0; i < 9; i++)
		{
			piece.setBorder(panels[i], i);
			if (player.returnArray()[i] == 0)
			{
				piece.setImage(panels[i], 0, i);
			}
			else if (player.returnArray()[i] == 1)
			{
				piece.setImage(panels[i], 1, i);
			}
			else if (player.returnArray()[i] == 2)
			{
				piece.setImage(panels[i], 2, i);
			}

			
		}
		if(player.getWinState()!=-1)
		{
			if(player.getWinState() != 0)
			{
			JOptionPane.showMessageDialog(null,"Player " + player.getWinState() + " wins");
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Its a draw");
			}
			System.exit(0);
		}
	}
	public void setUpGridLayout()
	{
		layout = new GridLayout(3,3);
	}	

}