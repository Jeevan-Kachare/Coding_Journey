package Array;

public class LeadersInArray {

//    public void leadersInArray(int[] arr){
//
//        int temp[]=new int[arr.length];
//        int count=0;
//        for(int i=0;i< arr.length;i++)
//        {
//            int flag=0;
//            for(int j=i+1;j< arr.length;j++)
//            {
//                if(arr[i]<arr[j])
//                    flag=1;
//            }
//            if(flag==0)
//            {
//                temp[count]=arr[i];
//                count++;
//            }
//        }
//
//        for(int x:temp)
//            System.out.print(x+" ");
//
//    }

    public void leadersInArray(int[] arr) {

        int n= arr.length-1;
        int lead=arr[n];
        System.out.print(lead+" ");
        for(int i=n-2;i>0;i--)
        {
            if(arr[i]>lead)
            {

                lead=arr[i];
                System.out.print(lead+" ");
            }
        }
    }

    public static void main(String args[])
    {
        int arr[]={7,10,4,3,6,5,2};
        ///int arr[]={10,20,30};
        LeadersInArray l= new LeadersInArray();
        l.leadersInArray(arr);

    }
}
