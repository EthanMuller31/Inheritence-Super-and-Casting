
public class Penguin extends Bird
	{
		int numOfBirds = 250;
		
		public Penguin() {
			System.out.println("Hello I am a Penguin");
		}
		
		public void CantFly() {
			System.out.println("I am a penguin I can't fly");
		}
		
		public void Wings() {
			super.Wings();
			System.out.println("Flap flap but can't fly away");
		}
	}
