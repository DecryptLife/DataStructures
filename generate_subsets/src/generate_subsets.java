public class generate_subsets {
    static void findSubsets(String s,String curr, int i)
    {
        if(i == s.length())
        {
            System.out.println(curr);
            return;
        }

        findSubsets(s,curr,i+1);
        findSubsets(s,curr+s.charAt(i),i+1);
    }
    public static void main(String[] args) {
        String s = "ABC";

        findSubsets(s,"",0);
    }
}
