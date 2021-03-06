import javax.swing.*;

import java.awt.*;
import java.util.*;

public class PieceInfo 
{
JLabel[] labels;
	public PieceInfo()
	{
		labels = new JLabel[9];
		for (int i = 0; i < 9; i++)
		{
			labels[i] = new JLabel();
		}
	}
	public void setBorder(JPanel label, int n)
	{
		if (n==0)
		{
		label.setBorder(BorderFactory.createMatteBorder(0,0,5,5, Color.black));
		}
		else if (n==1)
		{
			label.setBorder(BorderFactory.createMatteBorder(0,0,5,0, Color.black));
		}
		else if (n==2)
		{
			label.setBorder(BorderFactory.createMatteBorder(0,5,5,0, Color.black));
		}
		else if (n==3)
		{
			label.setBorder(BorderFactory.createMatteBorder(0,0,5,5, Color.black));
		}
		else if (n==4)
		{
			label.setBorder(BorderFactory.createMatteBorder(0,0,5,0, Color.black));
		}
		else if (n==5)
		{
			label.setBorder(BorderFactory.createMatteBorder(0,5,5,0, Color.black));
		}
		else if (n==6)
		{
			label.setBorder(BorderFactory.createMatteBorder(0,0,0,5, Color.black));
		}
		else if (n==7)
		{
			label.setBorder(BorderFactory.createMatteBorder(0,0,0,0, Color.black));
		}
		else if (n==8)
		{
			label.setBorder(BorderFactory.createMatteBorder(0,5,0,0, Color.black));
		}
	}
	public void setImage(JPanel panel, int n, int k)
	{	

		panel.add(labels[k]);	
		if (labels[k].getText().equals(""))
		{
		if (n == 0)
		{
			labels[k].setText("");
			labels[k].setFont(new Font("Verdana", Font.PLAIN, 50));
		}
		else if (n == 1)
		{
			labels[k].setText("X");
			labels[k].setFont(new Font("Verdana", Font.PLAIN, 50));

		}
		else if (n == 2)
		{
			 labels[k].setText("O");
				labels[k].setFont(new Font("Verdana", Font.PLAIN, 50));

		}
		}
	}

}