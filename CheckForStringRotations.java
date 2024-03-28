package String;

public class CheckForStringRotations {


    public boolean checkForStringRotations(String s1, String s2){

        if(s1.length()!= s2.length())
            return false;
        else
            return (s1+s1).indexOf(s2) >=0;
    }
    public static void main(String[] args)
    {
        CheckForStringRotations c = new CheckForStringRotations();
        String s1="ABAB";
        String s2="BABA";
        System.out.println(c.checkForStringRotations(s1,s2));

    }
}
