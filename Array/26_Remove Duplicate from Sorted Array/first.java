public class first{

    public static int removeDuplicate(int [] nums){
        int k = 1; //The first element of the array is always unique;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int [] nums = {1,1,2,3,3,4};
        int k = removeDuplicate(nums); // return the unique element 
        int [] expectedArray = new int[nums.length];
        for(int i=0; i<k; i++){
            expectedArray[i] = nums[i];
        }
        //Printing the unique element;
        System.out.println(k);
        //Now printing the new expected array;
        for( int e : expectedArray){
            System.out.print(e+ " ");
        }
    }
}