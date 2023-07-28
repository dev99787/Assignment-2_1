import java.util.*;

public class subarrayzero {

public static boolean subzero(int arr[], int n)
{
	for (int i = 0; i < n; i++) {
		int sum = arr[i];
		if (sum == 0)
			return true;
		for (int j = i + 1; j < n; j++) {
			sum += arr[j];
			if (sum == 0)
				return true;
		}
	}
	return false;
}

public static void main(String[] args)
{
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.println("enter the how many element do you want in array");
        n = scn.nextInt();
        System.out.println("enter element in arr");
        int arr[] = new int[10];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

	// Function call
	if (subzero(arr, n))
		System.out.println("Found a subarray with 0 sum");
	else
		System.out.println("No Such Sub Array Exists!");

}
}