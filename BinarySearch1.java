public class BinarySearch1 {
    public int binarysearch(int[]arr,int target){
        var left = 0;
        var right = arr.length-1;
        while(left<=right) {
            int middle = (left + right)/2;
            if(arr[middle]==target){
                return middle;
            }
            if(target<arr[middle]){
                right=middle-1;
            }
            else
                left = middle+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int []numbers = {1,3,5,7,9,12,14};
        var search = new BinarySearch1();
        var index = search.binarysearch(numbers,9);
        System.out.println("the number is present at index :- "+ index);
    }

}
