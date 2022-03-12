package CustomException;

public class Demo {
	public static void main(String []args) throws Exception //here we commit here Then we must use the Try and Catch block to resolve the Exception
	{
		//try {
		int age=17;
		if(age<18) {
			throw new CompileTime("You are Under Age");
		}
		else {
			System.out.println("Successfuly Run");
		}
		//}
		//catch(Exception e) {
		//	System.out.println(e); // or we write the e.printStackTrace(); method
		//}
		System.out.println("Program Work Normally");
	}
}
