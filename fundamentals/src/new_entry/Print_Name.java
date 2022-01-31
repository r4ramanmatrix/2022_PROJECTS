package new_entry;

public class Print_Name {

	public void m1(String name, int times) {
		System.out.println(times + ":" + name);

		if (times > 1) {
			m1(name, times - 1);
		}
	}
	
	public static void main(String[] args) {
		Print_Name obj1=new Print_Name();
		obj1.m1("Raman", 20);
	}

}
