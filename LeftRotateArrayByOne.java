package Array;

public class LeftRotateArrayByOne {

    public void leftRotateArrayByOne(int[] arr){

        int temp=arr[0];
        int n=arr.length-1;
        for(int i=1;i<=n;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[n]=temp;

        for(int x: arr)
            System.out.print(x+ " ");
    }
    public static void main(String args[])
    {
        LeftRotateArrayByOne l = new LeftRotateArrayByOne();
        int[] arr={2,1,2,34,7,32,21,34,10,5,55,43};
        l.leftRotateArrayByOne(arr);

    }
}
