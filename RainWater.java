package Array;

public class RainWater {

    public int findColllectWater(int[] arr)
    {

        int res=0;
        for(int i=1;i< arr.length-1;i++)
        {
                int lmax=arr[i];
                for(int j=0;j< i;j++)
                {
                    lmax = Math.max(lmax,arr[j]);
                }
                int rmax=arr[i];
                for(int j=i+1;j< arr.length;j++)
                {
                    rmax=Math.max(rmax,arr[j]);
                }

                res= res + (Math.min(lmax,rmax)-arr[i]);
        }

        return res;
    }

    public static void main(String args[])
    {
        RainWater r = new RainWater();
        int[] arr={3,0,1,2,5};
        System.out.println( r.findColllectWater(arr));
    }
}
