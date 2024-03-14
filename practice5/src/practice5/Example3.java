package practice5;

import java.util.StringTokenizer;

public class Example3{
    public static void main(String[] args){
		int i;
		int[] data = {50, 320, 97, 12, 2000};
	
	    for (i=0; i < data.length; i++){
	    	System.out.println(data[i]);
	    }
	    System.out.println("Done");
	    
	    
	    
	    StringTokenizer str1=new StringTokenizer("hello my fellas how are you"," ",true);
	    while(str1.hasMoreTokens()) {
	    	System.out.print(str1.nextToken());
	    }
		    
    }
}
