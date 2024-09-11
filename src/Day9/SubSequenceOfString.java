package Day9;

public class SubSequenceOfString {
    public static void sequence(String str, int index, String current) {

    if(index==str.length())

    {
        System.out.println(current);
        return;
    }
       // System.out.println(current);
    sequence(str, index+1, current+str.charAt(index));
    sequence(str, index+1, current);
}

    public static void main(String[] args) {
        String s="abc";
        sequence(s,0," ");
    }
}
