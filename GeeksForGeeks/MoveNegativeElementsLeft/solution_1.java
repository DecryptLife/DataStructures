package MoveNegativeElementsLeft;

public class solution_1 {
    static void moveLeft(int[] arr, int n)
    {
        int temp = 0;
        int pos = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                if(i != pos)
                {
                    temp = arr[pos];
                    arr[pos] = arr[i];
                    arr[i] = temp;
                }
                pos++;
            }
        }
    }
    
	public static void main (String[] args) {
		int n = 9;
		int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		
		moveLeft(arr,n);
		
		for(int i=0;i<n;i++)
		    System.out.print(arr[i]+" ");
		System.out.println();
	}
}
