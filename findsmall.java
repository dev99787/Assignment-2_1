import java.util.*;

class findsmall
{
    int findSmallest(int arr[], int n)
	{
		int res = 1; 

		
		// Arrays.sort(arr);
	    for (int i = 0; i < n; i++)
		{
		if(arr[i] > res){
			return res;
		}
		else{
			res+=arr[i];
		}
		}
			
		return res;
	}

	
	public static void main(String[] args)
	{
		findsmall small = new findsmall();
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.println("enter the how many element do you want in array");
        n = scn.nextInt();
        System.out.println("enter element in arr");
        int arr[] = new int[10];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println(small.findSmallest(arr, n));
		
	}
}

