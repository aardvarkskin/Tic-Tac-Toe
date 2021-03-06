public class TwoPlayer {

	private int[] arr = new int[9];
	private int counter = 0;
	private int stopper = 0;
	private int winState = -1;
	public int winner = -1;
	public int n;

	public TwoPlayer()
	{
		for(int i = 0; i < 9; i++)
		{
			arr[i] = 0;
		}
	}
	
	
	 public void printArray()
	 {
		 int counter = 0; 

		 for(int i =0; i <9; i++)
		 {
			 if(counter == 3)
			 {
				 System.out.println(); 
				 counter = 0; 
			 }
			 System.out.print(arr[i] + "\t");
			 counter++; 
		 }
	 }

	public void  userPlay(int n)
	{
		{
			placePiece(n);
			if(arr[0]!=0 && arr[0]==arr[1] && arr[1]==arr[2] || 
					arr[0]!=0 && arr[0]==arr[3] && arr[3]==arr[6] || 
					arr[0]!=0 && arr[0]==arr[4] && arr[4]==arr[8] || 
					arr[4]!=0 && arr[4]==arr[1] && arr[1]==arr[7] || 
					arr[4]!=0 && arr[4]==arr[3] && arr[3]==arr[5] || 
					arr[4]!=0 && arr[4]==arr[2] && arr[2]==arr[6] || 
					arr[8]!=0 && arr[8]==arr[5] && arr[5]==arr[2] || 
					arr[8]!=0 && arr[8]==arr[7] && arr[7]==arr[6])
			{
				winState = counter;
			}
		}
		if(winState%2==0 && winState > 0)
		{
			winner = 1;

		}
		else if(winState%2==1 && winState > 0)
		{
			winner = 2;
		}
		else if(counter == 9)
		{
			winner = 0;
		} 
	}
	public int getWinState()
	{
		return winner; 
	}
	public void placePiece(int i)
	{

		if(arr[i]==0)
		{
			if(counter%2==1)
			{
				arr[i] = 1;
			}
			else
			{
				arr[i] = 2;
			}
			counter++;
		}
	}

	public int[] returnArray()
	{
		return arr;
	}
}