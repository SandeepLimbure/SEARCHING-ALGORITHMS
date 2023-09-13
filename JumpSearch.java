public class JumpSearch {
    public int jumpSearch(int[]array,int target){
        int blockSize = (int) Math.sqrt(array.length);
        int start = 0;
        int next = blockSize;

        while(start< array.length && array[next - 1]<target) {
            start = next;
            next += blockSize;
            if (next > array.length)
                next = array.length;
        }
        for(int i =start;i< array.length;i++)
            if(array[i]==target)
                return i;

        return -1;
    }

    public static void main(String[] args) {
        int []numbers = {1,2,3,5,6,7,9,10,15};
        var search = new JumpSearch();
        var index = search.jumpSearch(numbers,10);
        System.out.println("The number is present at index :- "+index);
    }
}
