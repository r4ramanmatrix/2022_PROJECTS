package march_april_practice;

import java.util.ArrayList;
import java.util.List;

public class Access_Immutable_Class8 {

	public static void main(String... rama) {
		List<String> lists = new ArrayList<String>();
		lists.add("Playing");
		lists.add("Music");
		lists.add("Coding");

		Immutable_Class8 obj1 = new Immutable_Class8("Raman", 33, lists);
		System.out.println("Name is:: "+obj1.getName()+ " age is:: "+obj1.getAge()+" List is:: "+obj1.getList());
		
		lists.add("Swimming");
		
		System.out.println(obj1.getList());
	}

}
