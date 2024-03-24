package Array;

public class ReverseArray {

    public void reverse(int[] arr){


        //method 1
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }

        //method 2
       int begin=0;
        int end=arr.length-1;

      while(end > begin)
      {
          int temp=arr[end];
          arr[end]=arr[begin];
          arr[begin]=temp;
          end--;
          begin++;
      }

      for(int i=0;i<arr.length;i++)
      {
          System.out.print(arr[i]+ " ");
      }
    }

    public static void main(String args[])
    {
        ReverseArray r = new ReverseArray();
        int[] arr={11,22,33,44,55};
        r.reverse(arr);
    }
}
