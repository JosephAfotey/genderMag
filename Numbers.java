import java.util.*;

class Numbers {
	public static void main (String[] args) {
	    int[] nums= new int[5];
	    Scanner in=new Scanner(System.in);
	    for(int i=0;i<nums.length;i++)
	        nums[i]=in.nextInt();

	    for(int i=0;i<nums.length;i++)
		    System.out.print(nums[i]+" ");
	}
}