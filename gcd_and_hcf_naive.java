public class gcd_and_hcf_naive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 50;
        int b = 435;

        int min = Math.min(a,b);

        System.out.println("GCD: "+findGCD(a,b));
    }

    static int findGCD(int a,b)
    {
        while(min > 0)
        {
            if(a%min == 0 && b%min == 0)
            {
                return min;
            }
            min--;
        }
    }
}
