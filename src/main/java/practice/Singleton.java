package practice;

public class Singleton {

	private static Singleton singleton_instance = null;
	private String str;
	
	private Singleton() {
		str = "I got intialized by Singleton Constructor - Inside Singleton Constructor";
	}
	
	public static Singleton getInstance() {
		
		if(singleton_instance == null) 
			singleton_instance = new Singleton();
			
		return singleton_instance;
	
	}
	
	
	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
	}
	
}
