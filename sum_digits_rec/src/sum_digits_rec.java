public class sum_digits_rec {

    static int findSumDigits(int n)
    {
        if(n/10 == 0)
            return n;

        return n%10 + findSumDigits(n/10);
    }


    public static void main(String[] args) {
        int num = 4379;

        System.out.println(findSumDigits(num));
    }
}
