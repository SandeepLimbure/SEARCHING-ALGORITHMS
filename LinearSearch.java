public class LinearSearch {
    public int LinearSearchRec(int []arr,int target){
        for(int i = 0;i<arr.length;i++){
            if (arr[i]==target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []numbers = {1,2,3,5,7,5,10,12};
        var search = new LinearSearch();
        var index = search.LinearSearchRec(numbers,7);
        System.out.println("the element is present at index :- "+index);
    }
}
