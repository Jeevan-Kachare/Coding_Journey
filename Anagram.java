package String;

import java.util.Arrays;

public class Anagram {

    public boolean ana(String s, String s1)
    {
        if(s.length()!= s1.length())
            return false;

        char c[]=s.toCharArray();
        char c1[]=s1.toCharArray();

        Arrays.sort(c);
        s= new String(c);

        Arrays.sort(c1);
        s1= new String(c1);

        return s.equals(s1);
    }

    public boolean Ana2(String s1, String s2){

        if(s1.length()!= s2.length())
            return false;

        int temp[]=new int[256];

        for(int i=0;i<s1.length();i++)
        {
            temp[s1.charAt(i)]++;
            temp[s2.charAt(i)]--;
        }

        for(int i=0;i<temp.length;i++)
        {
            if(temp[i]==0)
            return false;
        }

        return true;
    }

    public static void main(String args[])
    {
        Anagram a = new Anagram();
        String s="jeevan";
        String s1="vnaeee";
        System.out.println(a.ana(s,s1));
        System.out.println(a.Ana2(s,s1));

    }
}
