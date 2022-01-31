package just_practice;

public class ReverseASentenceWordByWord {
	
	//static String sentence ="Selenium WebDriver Architecture";
	
	  public static String reverseTheSentence(String inputString)
	    {
	        String[] words = inputString.split("\\s");
	         
	        String outputString = "";
	         
	        for (int i = words.length-1; i >= 0; i--)
	        {
	            outputString = outputString + words[i] + " ";
	        }
	         
	        return outputString;
	    }
	     
	    public static void main(String[] args) 
	    {
	        /*Scanner sc = new Scanner(System.in);
	         
	        System.out.println("Enter Input String :");*/
	    	
	    	String name="Raman Kumar sharma";
	         
	        String inputString = name;
	         
	        String outputString = reverseTheSentence(inputString);
	         	
	        System.out.println("Input String : "+inputString);
	         
	        System.out.println("Output String : "+outputString);
	         
	    }
	


}
