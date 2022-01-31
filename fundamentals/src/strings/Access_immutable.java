package strings;

import java.util.ArrayList;
import java.util.List;

public class Access_immutable {

	public static void main(String[] args) {
		List<String> hi = new ArrayList<String>();
		hi.add("Swimming");
		hi.add("Playing");
		hi.add("Gaming");

		Check_Immute obj = new Check_Immute(31, "Raman", hi);
		System.out.println(
				"AGE IS:: " + obj.getterAge() + " Name is:: " + obj.getter() + " Hobbies are:: " + obj.getHobby());
		hi.add("Sleeping");
		System.out.println("Hobbies are:: " + obj.getHobby());
		
		Check_Immute obj2 = new Check_Immute(31, "Raman", hi);
		System.out.println("Hobbies are:: " + obj2.getHobby());

	}

}
