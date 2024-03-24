package String;

public class subsequence {

    public boolean sub(String s , String s1){

        int i=0;
        int j=0;
        while(i!=s.length()){
            if(s.charAt(i)==s1.charAt(j)){
                i++;
                j++;
            }
            else {
                i++;
            }
        }

        if(j==s1.length())
            return true;

        return false;

    }

    public static void main(String args[]){
        subsequence ss = new subsequence();
        String s="jeevan";
        String s1="jpq";
        System.out.println( ss.sub(s,s1));
    }
}
