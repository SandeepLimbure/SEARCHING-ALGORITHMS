//implementation of binary search using recursive implementation.
public class BINARYSEARCH{
    public int binarysearch(int []arr,int target){
        return binarysearch(arr, target,0,arr.length-1);
    }
    private int binarysearch(int []arr, int target, int left, int right){
            int middle = (left + right)/2;
            if(right<left)
                return -1;
            if(arr[middle]==target)
                return middle;
            if(target<arr[middle])
                return binarysearch(arr,target,left,middle-1);
            return binarysearch(arr,target,middle+1,right);


    }

    public static void main(String[] args) {
        int []numbers = {1,3,5,7,9,10,13,15};
        var search = new BINARYSEARCH();
        var index = search.binarysearch(numbers,9);
        System.out.println("the number is present at index :- "+ index);
    }
}
