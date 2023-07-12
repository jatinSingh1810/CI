package calcproj;

public class Caculator {

	public Caculator()
	{
		System.out.println("calling constructor");
	}
	
	
		public void add()
		{
			
			System.out.println("Add some number");
		}
		
		public void sub()
		{
			
			System.out.println("sub some number");
			
		}
		public void div()
		{
			
			System.out.println("div some number");
		}
		public static void main(String[] args) {

			Caculator calc=new Caculator();
		
		calc.add();
		calc.sub();
		calc.div();
		
		
	}

}
