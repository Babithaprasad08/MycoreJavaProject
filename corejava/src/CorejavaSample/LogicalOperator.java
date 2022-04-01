package CorejavaSample;

public class LogicalOperator {

	public static void main(String[] args) {
		int x = 390;
		int y = 70;
		int z = 180;
		
		if (x > y && y > z){ 
		System.out.println("If  block has executed");
		}
		else
		{
			System.out.println(" else block has executed");
		}
		
		if (x > y || y > z)
			{
			System.out.println("if bloack has executed");}
			else 
			{ System.out.println("else block has executed");}
		}
				

	}


