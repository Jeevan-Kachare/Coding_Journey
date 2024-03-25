package Array;

import java.util.Arrays;

public class MoveZeroToEnd {

    public void moveZeroToEnd(int[] arr){

        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                int temp1=arr[i];
                 arr[i] = arr[count];
                 arr[count]=temp1;
                 count++;
             }
        }
    }

    public static void main(String args[]){
        MoveZeroToEnd m = new MoveZeroToEnd();
        int[]  arr= {11,22,0,33,42,0,54,0,11};
        m.moveZeroToEnd(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
