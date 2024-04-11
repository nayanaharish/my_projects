public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int [] arr1 = {1,3};
        int [] arr2 = {2};
        System.out.println(findMedianSortedArrays(arr1,arr2));
        //sortArray(arr1);


        System.out.println(3/2);

//        for(int item : arr1)
//        {
//            System.out.print(item);
//        }
    }
    public static int findMedianSortedArrays(int[] nums1, int[] nums2) {

        int median = 0;

        int [] medianArray = new int [nums1.length + nums2.length];
        combine(nums1,medianArray,0);
        combine(nums2,medianArray,nums1.length);
        for(int item : medianArray)
        {
            System.out.print(item);
        }
        sortArray(medianArray);

        int length = medianArray.length;
        if (length % 2 == 0)
        {
           median =  medianArray[length/2] + medianArray[(length/2) + 1];
        }
        else
        {
            median = medianArray[(length / 2)];
        }


        return median;

    }
    public static void combine (int [] src , int [] dest ,int start)
    {
        int count = 0;
       for (int i = start ; i < src.length && count < src.length ;i++)
       {

           dest[i] = src[count];
           count ++;
       }

    }

    public static void sortArray(int [] inputArray)
    {
        int min = inputArray[0];
        for (int i = 0 ; i < inputArray.length ; i++)
        {
            for (int j = 0 ; j < inputArray.length -1 ; j++)
            {
                if (inputArray[j] > inputArray[j + 1])
                {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j+1];
                    inputArray[j+1] = temp;
                }
            }
        }
    }




}
