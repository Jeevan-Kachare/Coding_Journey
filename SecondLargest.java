package Array;

class SecondLargest {
    //FindLargestElement ff ;

//    public int secondLargest(int[] arr){
//        FindLargestElement ff = new FindLargestElement();
//        int largest =ff.findLargest(arr);
//        int secondlargest=-1;
//        for(int i=0;i<arr.length;i++)
//        {
//            if(arr[i] != largest){
//                if(secondlargest == -1)
//                {
//                    secondlargest = arr[0];
//                }
//                else {
//                    if(arr[i] > secondlargest  )
//                    {
//                        secondlargest=arr[i];
//                    }
//                }
//            }
//        }
//        return  secondlargest;
//    }

    // efficent approach

    public int secondLargest(int[] arr) {

        if(arr.length <3)
        {
            return -1;
        }

        int largest=arr[0];
        int seconLarggest=arr[1];
        for(int i=1;i< arr.length;i++)
        {
            if(arr[i]>largest)
            {
                seconLarggest=largest;
                largest=arr[i];
            }
            else if(arr[i] < largest)
            {
                if(arr[i] > seconLarggest)
                {
                    seconLarggest=arr[i];
                }
            }

        }
        return seconLarggest;
    }

}
