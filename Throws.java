/*Write java program to implement throws keyword.*/
class Throws{
	void checkAge(int age)throws ArithmeticException{
		if(age<18){
				throw new ArithmeticException("Lessthan 18");
		}
		else
		{
			System.out.println("Valid Age");
		}
	}
	public static void main(String [] args)
	{
		Main1 r1 = new Main1();
		r1.checkAge(19);
	}
}
	