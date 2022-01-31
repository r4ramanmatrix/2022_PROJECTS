package basics;

public class Access_Singleton {

	public static void main(String[] args) {
		Singleton_Class t1 = Singleton_Class.getSingle();
		Singleton_Class t2 = Singleton_Class.getSingle();
		System.out.println(t2.hashCode());
		System.out.println(t1.hashCode());
		System.out.println(t1.equals(t2));
		System.out.println(t1==t2);
		System.out.println(t1);
		
	}

}
