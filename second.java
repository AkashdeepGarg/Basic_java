import java.util.*;

class status
{
	int i, extra, score[] = new int[11];
	Random r = new Random();
	Scanner s = new Scanner(System.in);
	
	status(){
		for(i = 0; i < 11; i++)
		{
			System.out.print("Player " + (i + 1) + ": ");
			score[i] = s.nextInt();
		}
	}
	
	void addScore(int modScore[])
	{
		System.out.print("{");
		for(i = 0; i < 11; i++)
		{
			extra = r.nextInt(110);
			modScore[i] += extra;
			if(i == 10)
				System.out.print(modScore[i] + "}");
			else
				System.out.print(modScore[i] + ",");
			
		}
		
		System.out.println("\n");
		System.out.println("Status of the scores: ");
		for(i = 0; i < 11; i++)
		{
			if(modScore[i] >= 0 && modScore[i] < 10)
				System.out.println("a[" + i + "] = bad");
			else if(modScore[i] >= 10 && modScore[i] < 100)
				System.out.println("a[" + i + "] = good");
			else if(modScore[i] >= 100)
				System.out.println("a[" + i + "] = very good");
		}
	}
}

class cricketScores 
{
	public static void main(String args[])
	{
		System.out.println("Enter the scores of the 11 players: \n");
		status c1 = new status();
		System.out.println("\nArray after adding a random score from 0 to 110 is:");
		c1.addScore(c1.score);
	}
}