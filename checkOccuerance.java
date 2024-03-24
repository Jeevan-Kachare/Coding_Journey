package String;

public class checkOccuerance {

    int StringArr[]=new int[26];
    public void check(String s){
        for(int i=0;i<s.length();i++)
        {
           StringArr[ (int)s.charAt(i)-'a']++;
        }

        for(int i=0;i<26;i++)
        {
            if(StringArr[i]>0)
                System.out.println( (char)(i+'a')+" "+StringArr[i]);
        }
    }

    public static void main(String args[])
    {
        String str="jeevan";
        checkOccuerance c= new checkOccuerance();
        c.check(str);
    }
}
