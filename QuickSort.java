public class QuickSort {

    public static void quick(int[] arr, int low, int high)
    {
          if(low<high)
          {
              int pi = partition(arr, low, high);
              quick(arr, low, pi-1);
              quick(arr, pi, high);
          }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for(int j = low; j<=high; j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static void main(String[] args)
    {
        int[] nums = {6,5,2,8,9,4};
        System.out.println("Before swapping");
        for(int num: nums)
        {
            System.out.print(num + " ");
        }
        System.out.println();

        quick(nums, 0, nums.length-1);
        System.out.println("After swapping");
        for(int num: nums)
        {
            System.out.print(num + " ");
        }
    }
}
