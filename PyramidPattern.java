package week1;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		int n=6;
		 
        // outer loop to handle number of rows
        //  n in this case
        for(i=0; i<n; i++)
        {
 
            //  inner loop to handle number of columns
            //  values changing acc. to outer loop   
            for(j=0; j<=i; j++)
            {
                // printing numbers
                System.out.print("1");
            }
	   System.out.println();
        }
	}
}   
	
