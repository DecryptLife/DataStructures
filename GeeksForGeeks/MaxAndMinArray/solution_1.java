package MaxAndMinArray;

public class solution_1 {
    
	public static void main (String[] args) {
		int[] arr= {1,4,3,5,6,8,9,7};
		int largest = arr[0];
		int smallest = arr[0];
		for(int i=1;i<arr.length;i++)
		{
		    if(largest<arr[i])
		        largest = arr[i];
		    else if(smallest > arr[i])
		        smallest = arr[i];
		}
		
		System.out.println("Smallest "+smallest);
		System.out.println("Largest "+largest);
		
	}
}

