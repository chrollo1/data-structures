package ds;

public class FirstMissingPositive {
	public static int small(int[] a) {		
		int l = 0;
		int num = 1;
		int r = a.length;
		
		while (i < r) {
			if (a[i] == num) {
				System.out.println(num);
				num++;
				l = 0;
			} else {
				l++;
			}
		}
		
		return num;		
	}
	
	public static void main(String[] args) {		
        	int a[] = {1,2,3,4,7};
        	System.out.println(small(a));		
	}
}
