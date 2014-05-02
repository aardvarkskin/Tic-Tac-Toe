
public class oneplayer {

	int board[];
	int mcounter; 
	int winState; 
	
	public oneplayer()
	{
		winState = -1; 
		board = new int[9]; 
		for(int i = 0; i<9; i++)
		{
			board[i]=0; 
		}
	}
	
	public int[] returnArray()
	{
		return board; 
	}
	
	public int userPlay(int n)
	{
		playerMove(n);
		return getWinState(); 
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
			 System.out.print(board[i] + "\t");
			 counter++; 
		 }
	 }
	
	public int getWinState()
	{
		
		if(board[0]!=0 && board[0]==board[1] && board[1]==board[2] || 
				board[0]!=0 && board[0]==board[3] && board[3]==board[6] || 
				board[0]!=0 && board[0]==board[4] && board[4]==board[8] || 
				board[4]!=0 && board[4]==board[1] && board[1]==board[7] || 
				board[4]!=0 && board[4]==board[3] && board[3]==board[5] || 
				board[4]!=0 && board[4]==board[2] && board[2]==board[6] || 
				board[8]!=0 && board[8]==board[5] && board[5]==board[2] || 
				board[8]!=0 && board[8]==board[7] && board[7]==board[6])
		{
			if(mcounter%2==0)
			{
				winState = 1 ; 
			}
			else if(mcounter%2 ==1)
			{
				winState = 2; 
			}
			else if(mcounter ==9)
			{
				winState = 0; 
			}
		
		}
		
		
		return winState; 
	}
	
	public int playerMove(int n)
	{
		
		if(board[n]==0)
		{
			if(mcounter%2==0)
			{
				board[n] = 1; 
				//mcounter++; 
			}
			
			else if(mcounter%2!=0)
			{
				board[n] = 2; 
				//mcounter++; 
			}
			
		}
		int i = getWinState(); 
		mcounter++; 
		return i; 
		
		
	}
	
	public int compMove()
	{
		//int win = 0; 
		for(int i = 0; i < 9; i++)
		{
			if (board[i]==0)
			{
				board[i]=2; 
				//if(checkState()==1) board[i]=0; 
				if(getWinState()==2) 
				{
					break;
				}
				else if(getWinState()==0) 
				{
					if(compMove()==1)
					{
						board[i] = 0; 
						break;
					}
					else if(compMove()==0)
					{
						break; 
					}
				}
				else break;
					
			}
			
		}		
		mcounter++; 
		int k = getWinState(); 
		return k; 
		}
	
	
}
