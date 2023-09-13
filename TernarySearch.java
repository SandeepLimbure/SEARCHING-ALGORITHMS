//implementation of ternary search using recursive method.
public class TernarySearch {
    private int ternarySearch(int []array,int target){
        return ternarySearch(array,target,0,array.length-1);
    }
    public int ternarySearch(int []array,int target,int left,int right){
        int partitionSize = (right - left)/3;
        int mid1 = left + partitionSize;
        int mid2 = right - partitionSize;

        if(right<left)
            return -1;
        if(array[mid1]==target)
            return mid1;
        if(array[mid2]==target)
            return mid2;
        if(target<array[mid1])
            return ternarySearch(array, target, left, mid1-1);
        if(target>array[mid2])
            return ternarySearch(array,target,mid2+1,right);
        return ternarySearch(array, target, mid1+1, mid2-1);
    }

    public static void main(String[] args) {
        int []numbers = {1,3,5,7,9,12,15,17};
        var search = new TernarySearch();
        var index = search.ternarySearch(numbers,9);
        System.out.println("The number is present at index :- "+ index);
    }

}
