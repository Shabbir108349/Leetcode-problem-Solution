public class first{

    // if you don't understand please see the readme.md file and also contact with me "shabbirhassain24@gmail.com"

    static int removeElement(int []nums, int val){
        int k = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String ... args){
        int [] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int afterRemoveTheElement = removeElement(nums, 2);
        System.out.println(afterRemoveTheElement);
        for(int i=0; i<afterRemoveTheElement; i++){
            System.out.print(nums[i]+ " ");
        }
    }
}