package Array;

public class MaxDiffrenceInArray {

//    public int maxDiffrenceInArray(int[] arr){
//
//        int result=arr[1]-arr[0];
//        for(int i=1;i< arr.length;i++)
//        {
//            for(int j=i+1;j<arr.length;j++)
//            {
//                result=Math.max(result,arr[j]-arr[i]);
//            }
//
//        }
//
//        return result;
//
//    }

    public int maxDiffrenceInArray(int[] arr) {
        int result=arr[1]-arr[0];
        int min=arr[0];

        for(int j=0;j<arr.length;j++)
        {
            result = Math.max(result,arr[j]-min);
            min=Math.min(min,arr[j]);
        }
        return result;
    }

    public static void main(String args[]){
        int arr[]={2,3,10,6,4,8,1};
        MaxDiffrenceInArray m = new MaxDiffrenceInArray();

        System.out.println(m.maxDiffrenceInArray(arr));
    }
}
