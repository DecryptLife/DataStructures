public class tower_of_hanoi {
    static void moveDisc(int discs, String a,String b,String c)
    {
        if(discs == 1)
        {
            System.out.println("Moving "+1+" from "+a+" to tower "+c);
            return;
        }

        moveDisc(discs-1,a,c,b);
        System.out.println("Moving "+discs+" from "+a+" to tower "+c);
        moveDisc(discs-1,b,a,c);

    }

    public static void main(String[] args) {

        moveDisc(3,"A","B","C");
    }
}
