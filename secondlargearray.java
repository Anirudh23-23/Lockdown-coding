import java.util.Arrays;  
public class SecondLargestInArray{  
public static int getSecondLargest(int[] a, int total){  
Arrays.sort(a);  
return a[total-2];  
}  
public static void main(String args[]){  
int a[]={100,200,3,4,500,1000};  
System.out.println("Second Largest: "+getSecondLargest(a,6));  
}}  
