
public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	        System.out.println((A + B).length());
	        if(A.length() > B.length()){
	            System.out.println("Yes");
	           // else 
	             //   System.out.println("No");
	        }
	        A = A.substring(0,1).toUpperCase() + A.substring(1);
	        B = B.substring(0,1).toUpperCase() + B.substring(1);
	//firstLetter=firstLetter.toUppercase();
	  //      return (firstLetter+lastPart);
	        System.out.println(A+ " " +B);
	    }
	}


