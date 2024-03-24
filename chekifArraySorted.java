package Array;

public class chekifArraySorted {

    public boolean sorted(int[] arr){
        if(arr.length <2)
            return  true;

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]>arr[i])
                return false;
        }

        return true;
    }
    public static void main(String args[])
    {
        chekifArraySorted c= new chekifArraySorted();
        int[] arr={100};
        System.out.println( c.sorted(arr));
    }
}
