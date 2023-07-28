import java.util.*;

public class repeatelement {
	
	public static int firstRepeatingElement(int[] arr, int n) {
		
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				
				if (arr[i] == arr[j]) {
					return i;
				}
			}
		}
		return -1;
	}

		public static void main(String[] args) {
		
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.println("enter the how many element do you want in array");
        n = scn.nextInt();
        System.out.println("enter element in arr");
        int arr[] = new int[10];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
	
		int index = firstRepeatingElement(arr, n);

		
		if (index == -1) {
			System.out.println("No repeating element found!");
		}
		else {
			
			System.out.println("First repeating element is " + arr[index]);
		}
	}
}
