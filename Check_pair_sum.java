import java.util.Scanner;

public class Cech_pair_sum {
	static boolean pairsum(int[]arr,int size ,int sum) {
		for(int i =0;i<size-1;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]+arr[j]==sum) {
					return true;
				}  
			}
		}
		return false;
	}

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your size of the array: ");
		int size = input.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter your array elements: ");
		for(int i=0;i<size;i++) {
			arr[i]=input.nextInt();
		}
		System.out.print("Enter your sum value: ");
		int sum=input.nextInt();
		if(pairsum(arr,size,sum)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		input.close();

	} 
}