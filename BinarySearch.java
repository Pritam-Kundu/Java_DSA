// When the array is sorted in ascending order

public class BinarySearch{
    public static void main(String args[]){
        int arr[] = {-1,0,2,3,4,5,6,87};
        int target =8;
        int index = binarySearch(arr, target);
        System.out.println(index);
        
    }
    public static int binarySearch(int arr[],int target){
        int start = 0;
        int end = arr.length - 1;
  
        while(start <= end){        //Most Important 1
  
          int mid = (start+end)/2; //Most Important 2
  
          if(target < arr[mid]){
            end = arr[mid]-1;
          }else if(target > arr[mid]){
            start = arr[mid]+1;
          }else{
            return mid;
          }
        }
          return -1;
      }
}