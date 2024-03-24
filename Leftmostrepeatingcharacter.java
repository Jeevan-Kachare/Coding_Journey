package String;

public class Leftmostrepeatingcharacter {
    public int lmrc(String s){

        for(int i=0;i<s.length();i++)
        {
            for(int j=1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                    return i;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
    Leftmostrepeatingcharacter lr = new Leftmostrepeatingcharacter();
    String s="jeevan";
        System.out.println(lr.lmrc(s));

    }

}
