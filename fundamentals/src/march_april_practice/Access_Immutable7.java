package march_april_practice;

import java.util.ArrayList;
import java.util.List;

public class Access_Immutable7 {

	public static void main(String[] args) {
		List<String> lists = new ArrayList<String>();
		lists.add("English");
		lists.add("Java");
		lists.add("Hindi");
		lists.add("Python");
		lists.add("Punjabi");
		lists.add("C++");

		Immutable_Class7 obj1 = new Immutable_Class7("Raman", 33, lists);
		System.out.println(
				"Name is:: " + obj1.getName() + " Age is:: " + obj1.getAge() + " Languages are:: " + obj1.getList());
		
		lists.add("Bhojpuri");
		
		System.out.println("List is:: "+obj1.getList());
		
		Immutable_Class7 obj2=new Immutable_Class7("Rama", 32, lists);
		System.out.println("List is:: "+obj2.getList());
	}

}
