package String;

public class StringsInJava {

    public static void main(String args[])
    {
        String s="jeevan";

        System.out.println(s.length());
        System.out.println(s.charAt(2));
        System.out.println(s.substring(2));
        System.out.println(s.substring(2,5));


        String s1="jeevan";
        String s2="jeevan";

        if(s1== s2)
            System.out.println("Yes");
        else
            System.out.println("No");

        String s3=new String("jeevan");

        if(s1==s3)
            System.out.println("yes");
        else
            System.out.println("No");

        String s4="jeevan";
        String s5="jeev";

        // return true if present if not then false
        System.out.println(s4.contains(s5));

        String s6="jeevan";

        // return true if equals
        System.out.println(s4.equals(s6));

        String s7 ="for";

        //return lexigraphical vale
        // if same then 0
        // if grater then +ve
        // if lesser then -ve

        int res=s7.compareTo(s4);

        if(res==0)
        System.out.println("same");

        if(res >0)
            System.out.println("S7 greate");

        if(res  <0 )
            System.out.println(" s7 smaller");

        String s8="geeksforgeeks";
        String s9="for";

        // return -ve if not present
        System.out.println(s8.indexOf(s9));
        System.out.println(s8.indexOf(s9,1));

        String s10="jeev";
        String s11="an";

        System.out.println(s10.concat(s11));



    }

}
