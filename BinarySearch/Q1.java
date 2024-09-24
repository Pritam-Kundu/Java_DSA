// Video no: 15 > Question no: 1 (Kunal Kushwaha)
//+++++++++++++++++++++++++++++++++++++++++Ceiling of a given number+++++++++++++++++++++++++++++++++++++++++++++++++++
/*
 * Ceiling of a given number is - smallest element in the array which is greater than or equal to the target element being searched
 * 
 * arr[] = {2,3,5,7,9,14,16,67,87}
 * 
 * Hence the array is in sorted so we can use Binary Search here easily
 * 
 * Now if the target element is : 7  -> then it can find it directly in the array
 * But if the target element is : 15 ->in this case the ceiling will be 16(because 16 is the smallest element that is greater than
 *                                                                                          or equal to the target in the array)  
 * Now if the target element is : 20 -> the ceiling will be 67
 */

public class Q1{
    public static void main(String args[]){
        int arr[] = {2,3,5,7,9,14,16,67,87};
        int target = 90;
        int result = BinarySearch(arr, target);
        System.out.println("Ceiling value of "+target+" is: "+arr[result]);
    }

    public static int BinarySearch(int arr[],int target){
        
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while(start <= end){
            mid = (start + end)/2;

            if(arr[mid] > target){
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                return mid;
            }
        }
 
        return start;
    }
}

/*
 * Basically we are checking whether the loop breaking condition is met or not...means if we are searching for the "target" element and we have not found that, in that case "start > end" because otherwise the loop will not break and the "start" element will be the ceiling of the given number
 * 
 * Instead of returning "-1" we have to return "start" after ending of the while loop
 * & in the loop we will return "mid" 
 */