package week1.day2.Assignment2;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int range = 8;
         int fNum = 0;
         int sNum = 1;
         System.out.println(fNum);
         for(int i=1;i< range;i++) {
        	 int sum = fNum + sNum;
        	 fNum = sNum;
        	 sNum = sum;
        	 System.out.println(fNum);
        	 
         }

	}

}
