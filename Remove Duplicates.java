class Solutions{
    public int removeDuplicates(int []nums){
      int j=1;
      for(int i=1;i<nums.length;i++){
         nums[j++]=nums[i];
      }
     return j;
    }
}
