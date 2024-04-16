
public class Runner
	{

		public static void main(String[] args)
			{
				Bird x = new Penguin();
				System.out.println(x.numOfBirds);
				System.out.println(((Penguin)x).numOfBirds);
				x.Beak();
				x.Wings();
				
				
			}

	}
