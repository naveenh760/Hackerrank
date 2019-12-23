package advanced;

public class Singleton {

	public String str;
	public static Singleton instance = new Singleton();
	private Singleton() {
	}
	
	public static Singleton getSingleInstance() {
		return instance;
	}
	
	
	
	
	public static void main(String[] args) {
		Singleton s1 = Singleton.getSingleInstance();
		s1.str = "Sairam";
		System.out.println(s1.str);
		Singleton s2 = Singleton.getSingleInstance();
		s2.str = "Sairam1";   
		System.out.println(s1.str);
		System.out.println(s1 == s2);  // s1 and s2 point to same object.

	}

}
