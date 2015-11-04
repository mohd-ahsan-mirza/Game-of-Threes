import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Game {
	
	public static int GameOfThrees(int no){
		
		if(no<1){
			
			System.out.println("Invalid number");
			return no;
		}
		
		if(no==1)
		{
			System.out.println(no);
			return no;
		}
		
		else{
			
			System.out.print(no+" ");
			
			if(no%3==0){
				
				System.out.print(0+"\n");
				return GameOfThrees(no/3);
			}
			else{
				
				if((no+1)%3==0){
					System.out.print(1+"\n");
					return GameOfThrees((no+1)/3);
				}
				else{
					System.out.print(-1+"\n");
					return GameOfThrees((no-1)/3);
				}
			}
			
		}
		
	}
	
	
	public static class TestgameOfThrees{
		
		//Test GameOfThrees
		@Test
		public static void test(int noOfTestCases,int start){
			
			
			
			for(int run=start;run<noOfTestCases;run++)
			{
				try{
					assertEquals("Failed at '"+run+"':",1,Game.GameOfThrees(run));
					System.out.println("------------");
				}
				catch(java.lang.AssertionError e){
					System.out.println(e.getMessage());
				}
			}
		}
		
		
	}
	
	public static void main(String[] args){
		
		TestgameOfThrees.test(10,-1);
		
	}
	
}
