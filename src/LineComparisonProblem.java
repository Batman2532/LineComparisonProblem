import java.util.*;
import java.lang.*;
public class LineComparisonProblem {

	public static void main(String[] args) {
		System.out.println("Welcome to line comparasion problem ");
		Scanner s = new Scanner(System.in);
		
		int x1,x2,y1,y2;
		System.out.println("enter details for line 1");
		
		x1=s.nextInt();
		x2=s.nextInt();
		y1=s.nextInt();
		y2=s.nextInt();
		 double len1 = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		 System.out.println("length of line 1 is " + len1);
	
		 System.out.println("enter details for line 2");
			
		x1=s.nextInt();
		x2=s.nextInt();
		y1=s.nextInt();
		y2=s.nextInt();
		 double len2 = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		 System.out.println("length of line 2 is " + len2);
		 
		 String strlen1 = String.valueOf(len1);
	  	    String strlen2 = String.valueOf(len2);
		 
		if(strlen1.equals(strlen2))
			 System.out.println("the line are equal");
			 else
				 System.out.println("the line are not equal");
		
		int length=strlen1.compareTo(strlen2);
		    if(length<0)
			System.out.println("line 2 is greater than line 1");
			else if(length>0)
			System.out.println("line 1 is greater then line 2");
			else			
				System.out.println("Lines are equal");
	}

}
