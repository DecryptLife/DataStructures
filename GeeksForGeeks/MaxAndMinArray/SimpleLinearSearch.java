package MaxAndMinArray;


class SimpleLinearSearch {
    static class Pair{
        int max;
        int min;
    }
    
    static Pair getMinMax(int[] arr)
    {
        Pair minmax = new Pair();
        if(arr.length == 1)
        {
            minmax.max = arr[0];
            minmax.min = arr[0];
            return minmax;
        }
        if(arr[0]>arr[1])
        {
            minmax.max = arr[0];
            minmax.min = arr[1];
        }
        else
        {
            minmax.min = arr[0];
            minmax.max = arr[1];
        }
            
        for(int i=2;i<arr.length;i++)
        {
            if(arr[i]>minmax.max)
                minmax.max = arr[i];
            else if(arr[i] < minmax.min)
                minmax.min = arr[i];
        }
        return minmax;
    }
    
	public static void main (String[] args) {
		int[] arr= {500,4,3,5,6,8,9,7};
		Pair values = getMinMax(arr);
		
		System.out.println("Minimum value: "+values.min);
		System.out.println("Maximum value: "+values.max);
		
	}
}