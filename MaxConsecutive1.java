package Array;

public class MaxConsecutive1 {

    public int maxConsecutive1(int[] arr){

        int result=0;
        for(int i=0;i< arr.length;i++)
        {
            int count=0;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]==1)
                {
                    count++;
                }
                else
                    break;
            }
            result=Math.max(result,count);
        }
        return result;
    }

    public static void main(String args[])
    {
        MaxConsecutive1 m = new MaxConsecutive1();
        int[] arr={1,0,0,1,1,1,0,1,1};
        System.out.println(m.maxConsecutive1(arr));

    }
}
