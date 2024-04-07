public class InsertionSort {
    public static void main(String[] args)
    {
        int nums[] = {6,5,2,8,9,4};
        System.out.println("Before Swapping: ");
        for(int num: nums)
        {
            System.out.print(num+" ");
        }
        System.out.println();
        for(int i = 1; i<nums.length; i++)
        {
            int key = nums[i];
            int j = i-1;

            while(j>=0 && nums[j] > key)
            {
                nums[j+1] = nums[j];
                j = j-1;
            }

            nums[j+1] = key;
        }

        System.out.println("After Swapping: ");
        for(int num: nums)
        {
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
