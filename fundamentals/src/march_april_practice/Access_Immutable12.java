package march_april_practice;

import java.util.ArrayList;
import java.util.List;

public class Access_Immutable12 {

	public static void main(String[] args) {
		List<String> allLists = new ArrayList<String>();
		allLists.add("Playing");
		allLists.add("Gaming");
		allLists.add("Swiming");
		
		Immutable_Class11 obj=new Immutable_Class11("DEMO", 235, allLists);
		System.out.println("Name is:: "+obj.getName()+" age is:: "+obj.getAge()+" List of hobbies:: "+obj.getAllHobby());
		
		allLists.add("Studying");
		System.out.println("Hobbies:: "+obj.getAllHobby());
		
		
	}

}
