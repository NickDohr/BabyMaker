
public class BabyMaker
	{

		public static void main(String[] args)
			{
				Baby myB1 = new Baby("Benjamin", 7.7, false);
				Baby myB2 = new Baby("Alfred", 9, false);
				Baby myB3 = new Baby("Johnny", 10, false);
				Baby myB4 = new Baby("Alfred II", 3.5, false);
				Baby myB5 = new Baby("Daughter", 9.4, true);
				Baby myB6 = new Baby("Sarah", 9.2, true);
				//Baby myB7 = new Baby("Alvin", 6.3, false);
				
				
				System.out.println(myB1.getName() + " was his name!");
				myB1.setName("Jeffrey The Third");
				System.out.println(myB1.getName() + " was his name!");
				myB1.barf();
			}

	}
