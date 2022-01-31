package method_type;

public class ReturnAnArrayFromMethod {
	
	public static void main(String[] args) {
		
		ReturnAnArrayFromMethod obj=new ReturnAnArrayFromMethod();
		String sName[]=obj.name();
		for(int i=0;i<sName.length;i++) {
			System.out.println(sName[i]);
		}
	}
	
	public String[] name(){
		String names[]= {"Raman","Kumar","Java"};
		return names;
	}

}
