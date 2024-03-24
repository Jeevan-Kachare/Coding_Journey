package String;

public class checkPalindrome {

    public boolean checkPalin(String s){

        String s1="";
        for(int i=s.length()-1;i>=0;i--)
        {
            s1+=s.charAt(i);
        }

        if(s1.equals(s))
            return true;

         return false;
    }

    public boolean isPal(String s){
        int begin=0;
        int end=s.length()-1;

        while(end > begin)
        {
            if(s.charAt(begin) != s.charAt(end))
                return false;
            end--;
            begin++;
        }

        return true;
    }
    public  static void main(String args[])
    {
        checkPalindrome cp = new checkPalindrome();
        String s="jeevan";
        System.out.println(cp.checkPalin(s));
        System.out.println(cp.isPal(s));

    }
}
