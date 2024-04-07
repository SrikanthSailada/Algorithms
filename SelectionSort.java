public class SelectionSort {
    public static void main(String[] args)
    {
        int nums[] = {6,5,2,8,9,4};
        int temp = 0;
        int min_index = -1;
        System.out.println("Before Swapping: ");
        for(int num: nums)
        {
            System.out.print(num+" ");
        }
        System.out.println();
        for(int i=0; i<nums.length-1; i++)
        {
            min_index = i;
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[min_index] > nums[j]) {
                    min_index = j;
                }
            }

            temp = nums[min_index];
            nums[min_index] = nums[i];
            nums[i] = temp;
        }

        System.out.println("After Swapping: ");
        for(int num: nums)
        {
            System.out.print(num+" ");
        }
    }
}
