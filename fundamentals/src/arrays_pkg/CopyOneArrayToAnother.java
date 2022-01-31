package arrays_pkg;

public class CopyOneArrayToAnother {
	
	static String[] name= {"ABC", "DEF", "GHI" , "JKL", "MNO", "PQR"}; 
	String[] names=new String[name.length]; 
	
	public static void main(String[] args) {
		
		CopyOneArrayToAnother copy=new CopyOneArrayToAnother();
		for(int i=0;i<name.length;i++) {
			//name[i]=copy.names[i];
			copy.names[i]=name[i];
			System.out.println(copy.names[i]);
		}
	}

}
