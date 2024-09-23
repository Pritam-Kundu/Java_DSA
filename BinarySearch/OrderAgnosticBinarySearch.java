/*
 * In order agnostic binary search - we don't know whether the array is sorted in ascending or descending 
 * order but we know that the array is sorted so first we have to check whether the array is in ascending or
 * descending order.
 * 
 * Suppose an array given = [3,3,3,3,3,3,87]
 * We can check the first element and last element and then we can easily make an decsiion whether the
 * array is sorted in ascending order or descending order
 */

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int arr[] = {87,67,57,37,29,10};        
        // int arr[] = {10,45,35,65,67,87};
        int target = 67;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    public static int binarySearch(int arr[],int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAscending = arr[start] < arr[end];        //Checking whether the array is in ascending or descending order

        if(isAscending){
            System.out.println("The given array is in ascending order...");
            while(start <= end){
                int mid = (start + end)/2;

                if(target < arr[mid]){
                    end = mid - 1;
                }else if(target > arr[mid]){
                    start = mid + 1;
                }else{
                    return mid;
                }
            }
        }else{
            System.out.println("The given array is in descending order...");
            while(start <= end){
                int mid = (start + end)/2;

                if(target < arr[mid]){
                    start = mid + 1;
                }else if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    return mid;
                }
            }
        }

        return -1;
    }
}
