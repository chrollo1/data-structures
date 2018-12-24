package ds;

public class FirstMissingPositive {
	public static int small(int[] a) {		
		int i = 0;
		int num = 1;
		int len = a.length;
		
		while (i < len) {
			if (a[i] == num) {
				System.out.println(num);
				num++;
				i = 0;
			} else {
				i++;
			}
		}
		
		return num;		
	}
	
	public static void main(String[] args) {		
        	int a[] = {1,2,3,4,7};
        	System.out.println(small(a));		
	}
}
