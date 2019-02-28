class Solution26 {

    public static void main(String[] args) {
        int[] nums={1,1,2};
        // nums is passed in by reference. (i.e., without making a copy)
        int len = removeDuplicates(nums);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]);
        }
    }

    //我的
    public static int removeDuplicates(int[] nums) {
        int j=1;
        if(nums.length<=1)
            return nums.length;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }

    //社区大神
    public int removeDuplicates2(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i == 0 || n > nums[i-1])
                nums[i++] = n;
        return i;
    }



}


