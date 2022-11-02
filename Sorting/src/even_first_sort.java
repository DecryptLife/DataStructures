import java.util.Arrays;
import java.util.Comparator;

class MyComp implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1%2 - o2%2;
    }
}

public class even_first_sort {
    public static void main(String[] args) {
        Integer arr[] = {6,5,20,15,3,12};

        Arrays.sort(arr,new MyComp());

        System.out.println(Arrays.toString(arr));
    }
}
