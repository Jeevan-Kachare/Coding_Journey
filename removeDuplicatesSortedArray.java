package Array;

public class removeDuplicatesSortedArray {


    public void removeDuplicate(int[] arr){

        int temp[]=new int[arr.length];
        int count=1;
        temp[0]=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            int flag=1;
            for(int j=0;j<=i;j++)
            {
                if(temp[j]==arr[i])
                {
                    flag=0;
                }

            }
            if(flag==1)
            {
                temp[count]=arr[i];
                count++;
            }

        }

        for(int i=0;i< temp.length;i++)
        {
            System.out.print(temp[i]+" ");
        }
    }

    public static void main(String args[]){
        removeDuplicatesSortedArray rd= new removeDuplicatesSortedArray();
        int[] arr={10,30,20,10,30,30,30};
        rd.removeDuplicate(arr);
    }
}
