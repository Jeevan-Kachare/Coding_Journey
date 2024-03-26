package String;

public class PatternSearching {

    public void PaternSearching(String txt, String pat){
        int n=txt.length();
        int m=pat.length();

        for(int i=0;i<=n-m ;i++)
        {
            int j;
            for(j=0;j<m;j++)
            {
                if(pat.charAt(j)!=txt.charAt(i+j))
                {
                    break;
                }
            }
            if(j==m)
                System.out.print(i);
        }
    }

    public static void main(String[] args)
    {
        String text="ABCABCD";
        String pattern="ABCD";
        PatternSearching p = new PatternSearching();
        p.PaternSearching(text,pattern);

    }
}
