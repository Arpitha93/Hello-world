package stringCompare;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String A = sc.next();
        int n = sc.nextInt();
        String max = A.substring(0,n);
        String min = A.substring(0,n);
        for(int i=0; i+n<=A.length(); i++)
            {
           if(A.substring(i,i+n).compareTo(min)<0) min=A.substring(i,i+n);
           if(A.substring(i,i+n).compareTo(max)>0) max=A.substring(i,i+n);
        }
            
                System.out.println(min);
                System.out.println(max);
            
	}

}
