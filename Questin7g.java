package cfc_question;
import java.util.*;
public class Question7g {
    public static void pattern7g(int n) {
    	
      int nst1=1;
      int nst2=1;
      int nsp=n-1;
      int row=1;
      while(row<=n) {
    	 int cst1=1;
    	 while(cst1<=nst1) {
    		 System.out.print("*");
    		 cst1++;
    	 }
    	 int csp=1;
    	 while(csp<=nsp) {
    		 System.out.print(" ");
    		 csp++;
    	 }
    	 int cst2=1;
    	 while(cst2<=nst2) {
    		 System.out.print("*");
    		 cst2++;
    	 }
    	 if( row<=n/2) {
    		nst1++;
    		nst2++;
    		nsp-=2;
    	 }else {
    		 nst1--;
    		 nst2--;
    		 nsp+=2;
    	 }
    	 System.out.println();
    	 row++;
    	 
    	 
      }
    }
	public static void main(String[] args) {
	
	 Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		pattern7g(9);

	}

}
