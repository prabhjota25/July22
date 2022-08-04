package jul22.week1.day1;

public class LearnObjectAndMethod {
	
	
	//AccessSpecifier returnType methodName()
	public void applyBrake()
	{
		System.out.println("This is applyBrake method");
	}
	
	
	public static void main(String[] args) {
		
		//ClassName objectName = new ClassName();
		LearnObjectAndMethod objectName = new LearnObjectAndMethod();
		objectName.applyBrake();
	}

}
