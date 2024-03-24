package Array;

public class FindLargestElement {


    public int findLargest(int[] arr){

        int max=arr[0];
        int index=0;
        if(arr.length ==1)
        {
            return max;
        }
        else {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    index=i;
                }
            }
        }
        return max;
    }
    public static  void main(String[] args)
    {
        FindLargestElement f = new FindLargestElement();
        int[] arr={10,10,10};
        System.out.println(f.findLargest(arr));
        SecondLargest sl = new SecondLargest();
        System.out.println( sl.secondLargest(arr));
    }
}
