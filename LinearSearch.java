public class LinearSearch {
    public static void main(String[] args)
    {
        int[] nums = {5,7,9,11,13};
        int target = 13;
        int index = -1;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == target)
            {
                index = i;
                break;
            }
        }

        if(index != -1)
        {
            System.out.println("Element found at index: " + index);
        }
        else {
            System.out.println("Element not found");
        }
    }
}
