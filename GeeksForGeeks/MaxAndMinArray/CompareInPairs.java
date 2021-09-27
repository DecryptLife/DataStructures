package MaxAndMinArray;

public class CompareInPairs {

    static class Pair{
        int min;
        int max;
    }
    static Pair getMinMax(int[] arr, int size)
    {
        Pair minmax = new Pair();
        int i;
        if(size == 1)
        {
            minmax.min = arr[0];
            minmax.max = arr[0];
            return minmax;
        }
        // if even elements assign min and max as the first two elements
        if(size%2==0)
        {
            minmax.min = arr[0];
            minmax.max = arr[1];
            i = 2;
        }
        // if odd assign min and max as the first element
        else{
            minmax.min = arr[0];
            minmax.max = arr[0];
            i = 1;
        }
        while(i<size-1)
        {
            if(arr[i] > arr[i+1])
            {
                if(arr[i] >minmax.max)
                    minmax.max = arr[i];
                else if(arr[i+1] < minmax.min)
                    minmax.min = arr[i+1];
            }
            else
            {
                if(arr[i] < minmax.min) 
                    minmax.min = arr[i];
                else if(arr[i+1] > minmax.max)
                    minmax.max = arr[i+1];
            }
            // since we are comparing in pairs jump by 2
            i+=2;
        }
        return minmax;
    }
    public static void main(String[] args)
    {
        int[] arr = {90,23,45,9,4,99,203,401};

        Pair values = getMinMax(arr,arr.length);
        System.out.println("Min: "+values.min);
        System.out.println("Max: "+values.max);
    }
}
