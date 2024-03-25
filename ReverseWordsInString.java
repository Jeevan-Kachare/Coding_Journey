package String;

public class ReverseWordsInString {

    public void reverseWords(char str[]){
        int start=0;
        int n=str.length-1;
        for(int end=0;end<n;end++)
        {
            if(str[end]==' ')
            {
                reverse(str,start,end-1);
                start=end+1;
            }
        }

        ReverseWordsInString.reverse(str,start,n);
        ReverseWordsInString.reverse(str,0,n);
    }
    public static void reverse(char[] str, int low , int high)
    {
        while(low<= high){
            char temp=str[low];
            str[low]=str[high];
            str[high]=temp;
            low++;
            high--;
        }
    }


    public static void main(String arsg[])
    {
        String s="Dr. D Y Patil Institite of Enginerring and Tecgnhlogy Pune";
        ReverseWordsInString r = new ReverseWordsInString();
        char[] str=s.toCharArray();
        r.reverseWords(str);
        String ss = new String(str);
        System.out.println(ss);

    }
}
