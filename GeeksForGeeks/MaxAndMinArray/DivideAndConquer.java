package MaxAndMinArray;

public class DivideAndConquer {
    static class Pair{
        int min;
        int max;
    }
    static Pair getMinMax(int[] arr, int low, int high)
    {
        System.out.println("Start");
        System.out.println("Low: "+low+" High: "+high);
        Pair minmax = new Pair();
        Pair mml = new Pair();
        Pair mmr = new Pair();

        if(high == low)
        {
            minmax.min = arr[low];
            minmax.max = arr[low];
            return minmax;
        }
        // if only two elements
        if(high == low+1)
        {
            if(arr[low] > arr[high])
            {
                minmax.min = arr[high];
                minmax.max = arr[low];
            }
            else{
                minmax.min = arr[low];
                minmax.max = arr[high];
            }
        }

        // if there are more than 2 elements
        int mid = (high+low)/2;
        System.out.println("MML");
        mml = getMinMax(arr, low, mid);
        System.out.println("MMR");
        mmr = getMinMax(arr, mid+1, high);
        System.out.println("Mid: "+mid);
        System.out.println("Recursion over");

        if(mml.min <  mmr.min)
        {
                System.out.println("Min comparison"); 
                minmax.min = mml.min;
        }
        else    
        {
            System.out.println("Min comparison");
            minmax.min = mmr.min;
        }
        if(mml.max > mmr.max)
            minmax.max = mml.max;
        else
            minmax.max = mmr.max;
        
        System.out.println("Min: "+minmax.min+" Max: "+minmax.max);

        return minmax;
    }
    public static void main(String[] args)
    {
        int[] arr = {100,2,90,88,5,8};

        Pair values = getMinMax(arr,0,arr.length - 1);

        System.out.println(values.min);
        System.out.println(values.max);
    }
}
