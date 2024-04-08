public class BinarySearch {
    public static void main(String[] args)
    {
        int[] nums = {5,7,9,11,13};
        int target = 13;
        int index = -1;

        int left = 0;
        int right = nums.length-1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                index = mid;
                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if(index != -1)
        {
            System.out.println("Number found at index: " + index);
        }
        else {
            System.out.println("Number not found in array");
        }
    }
}
