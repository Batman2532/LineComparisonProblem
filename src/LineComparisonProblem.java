import java.util.*;
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
	}

}
