package week1.day2.Assignment2;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int input=13;
		boolean flag=false;
	    int reminder;
	    
	       for(int i=2;i<=input/2;i++) {
	    	  reminder=input%i;
	    	   if(reminder==0) {
	    		  flag=true;
	    		   break;
	    	   }
	       }
	       if(flag==true) {
	    	   System.out.println("The given number "+ input+ " is not prime");
	       }
	       else {
	    	   System.out.println("The given number "+input + " is  prime");
	       
		
	    }

	}

}
