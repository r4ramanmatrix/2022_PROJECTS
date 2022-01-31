package arrays_pkg;

public class Array_2D {
	
	//static int[][] arr= {{1,1},{2,0},{3,4}};
	
	
	
	public static void main(String[] args) {
		/*for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				System.out.println(arr[i][j]);
			}
		}*/
		
		int number[][] = new int[2][2];
		number[0][0]=10;
		number[0][1]=20;
		number[1][0]=30;
		number[1][1]=40;
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(number[i][j] + " ");
			}
			
			System.out.println();
		}
	}
}
