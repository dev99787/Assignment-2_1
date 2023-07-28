import java.util.Scanner;
class FindCommon {
	
	void findCommon()
	{
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.println("enter the how many element do you want in array");
        n = scn.nextInt();

        System.out.println("enter element in ar1");
        int ar1[] = new int[20];
        for(int i=0;i<n;i++){
            ar1[i]=scn.nextInt();
        }

        System.out.println("enter element in ar2");
        int ar2[] = new int[20];
        for(int i=0;i<n;i++){
            ar2[i]=scn.nextInt();
        }

        System.out.println("enter element in ar3");
        int ar3[] = new int[20];
        for(int i=0;i<n;i++){
            ar3[i]=scn.nextInt();
        }
        
        
		int i = 0, j = 0, k = 0;


		while (i < ar1.length && j < ar2.length && k < ar3.length) {

			if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
				System.out.print(ar1[i] + " ");
				i++;
				j++;
				k++;
			}

			else if (ar1[i] < ar2[j]){
				i++;
            }


			else if (ar2[j] < ar3[k]){
				j++;
            }


			else{
				k++;
            }
		}
	}


	public static void main(String args[])
	{
		FindCommon ob = new FindCommon();
        ob.findCommon();
        System.out.print("Common elements are ");

		// int ar1[] = { 1, 5, 10, 20, 40, 80 };
		// int ar2[] = { 6, 7, 20, 80, 100 };
		// int ar3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };

		

	}
}

