package final_finally_finalize;

public class Understanding_finalizeMethod {

	public static void main(String[] args) {
		//finalize method - is a method that the Garbage Collector always call before destroying/deleting the object which is eligible for Garbage Collection
		//Garbage collection does clean up activity
		//finalize is a method at is not a reserved keyword
		//finalize method is present inside the Object Class
		
		String s = new String("Hello Java");
		s = null;
		
		Understanding_finalizeMethod ref = new Understanding_finalizeMethod();
		ref=null;
		
		System.gc();// request JVM send to calls Garbage Collector method
		System.out.println("This is where I think my main logic restes");

	}
	
	public void finalize() {
		System.out.println("This is my finalize method");
	}

}
