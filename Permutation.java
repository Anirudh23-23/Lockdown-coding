import java.util.*;
import java.io.*;
public class Permute {
	public int fact(int n) {
		if(n==0)
			return 1;
		else
			return n*fact(n-1);
	}
	public static void main(String[] args) {
		int n,r,t,p;
		Permute pe=new Permute();
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of testcases : ");
		t=s.nextInt();
		while(t>0) {
			System.out.print("Enter the values of n and r : ");
			n=s.nextInt();
			r=s.nextInt();
			p=pe.fact(n)/pe.fact(n-r);
			System.out.print("nPr (n = "+n+" and r = "+r+") = "+p+"\n");
			t--;
		}
		s.close();
	}

}
