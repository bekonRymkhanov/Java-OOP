package practice5;
import java.util.*;

public class Example4{
    public static void main(String[] args){
       double leftOperand, result, rightOperand;
       String leftString, operator, rightString;
       StringTokenizer tokenizer;
       Scanner in = new Scanner(System.in);
       StringTokenizer string = new StringTokenizer(in.nextLine()," ");

       while(string.hasMoreTokens()) {
    	   tokenizer = new StringTokenizer(string.nextToken(), "+|*|-|/", true);
           try{
              leftString   = tokenizer.nextToken();
              operator     = tokenizer.nextToken();
              rightString  = tokenizer.nextToken();
              try {
            	  leftOperand  = Double.parseDouble(leftString);
            	  try {
                      rightOperand = Double.parseDouble(rightString); 
                      if (operator.equals("+"))
                         result = leftOperand + rightOperand;
                      else if(operator.equals("-"))
                    	  result = leftOperand - rightOperand;
                      else if(operator.equals("*"))
                    	  result = leftOperand * rightOperand;
                      else if(operator.equals("/"))
                    	  result = leftOperand / rightOperand;
                      else
                         result = 0.0;

                      System.out.println("Result: " + result);
            	  }catch (NumberFormatException nfe){
                      System.out.println("second operands is not a number");
                      rightOperand=0;
                  }
              }catch (NumberFormatException nfe){
                  System.out.println("first operands is not a number");
                  leftOperand=0;
              }
           }catch (NoSuchElementException nsee){
              System.out.println("Invalid syntax");
           }

       }
     

    }
}
