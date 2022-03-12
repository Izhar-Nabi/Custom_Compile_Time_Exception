package CustomException;

public class CompileTime extends Exception{

	CompileTime(){
		super("You are underAge");
	}
	CompileTime(String Msg){ // here this is Overriding constructor
		super(Msg);
	}
}

