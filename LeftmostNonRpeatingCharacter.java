package String;

public class LeftmostNonRpeatingCharacter {

//    public int leftmostMostNonRepeatingCharachter(String s){
//
//        for(int i=0;i<s.length();i++)
//        {
//            int flag=0;
//            for(int j=1;j<s.length();j++)
//            {
//                if(s.charAt(i)==s.charAt(j))
//                    flag=1;
//            }
//            if(flag==0)
//                return i;
//        }
//        return -1;
//    }

    static final  int CHAR=256;
    public int leftmostMostNonRepeatingCharachter(String s) {

        int[] count = new int[CHAR];

        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)]++;
        }

        for(int i=0;i<s.length();i++)
        {
            if(count[s.charAt(i)]==1)
                return i;
        }

        return -1;
    }




    public static void main(String args[])
    {
       LeftmostNonRpeatingCharacter l = new LeftmostNonRpeatingCharacter();
        String s="JavaDevloper";
        System.out.println(s.charAt(l.leftmostMostNonRepeatingCharachter(s)));
    }
}
