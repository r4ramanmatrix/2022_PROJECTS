package variables;

public class DataType_Access extends DataType{
	char c;
	
	public static void main(String[] args) {
		
		DataType_Access obj=new DataType_Access();
		datatype=new DataType();
		System.out.println(datatype.b1=false);
		System.out.println(datatype.bite);
		System.out.println(datatype.r);
		datatype.m1();
		System.out.println(datatype.l1);
		System.out.println(datatype.floating);
		System.out.println(datatype.sNumber);
		System.out.println(datatype.d1);
		
		int[] num= {22,3,4,5,6};
		datatype.number=num;
		System.out.println(datatype.s1);
		
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		System.out.println(obj.c);
		
	}

}
