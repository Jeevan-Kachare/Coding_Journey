package Array;

public class LeftRotateArrayByDPlace {


    public void leftRotateArrayByDPlace(int[] arr,int n){

        int temp[]=new int[n];

        for(int i=0;i< n;i++)
        {
            temp[i]=arr[i];
        }

        for(int i=n;i< arr.length;i++) //2,1,2,34,7,32,21,34,10,5,55,43
        {

            arr[i-n]=arr[i];
        }

        int a= arr.length-1;
        int b= temp.length-1;
        while(b>=0){
            arr[a]=temp[b];
            a--;
            b--;
        }


        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        LeftRotateArrayByDPlace l = new LeftRotateArrayByDPlace();
        int[] arr={2,1,2,34,7,32,21,34,10,5,55,43};
        l.leftRotateArrayByDPlace(arr,2);
    }
}
