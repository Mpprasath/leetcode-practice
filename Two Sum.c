C Language :

int *sum(int* nums,int target,int numsSize,int* returnSize)
{
    int* arr=malloc(sizeof(int*));
    *returnSize=2;
    for(int i=0;i<numsSize-1;i++)
    {
      for(int j=i+1;j<numsSize;j++)
      {
       if(nums[i]+nums[j]==target)
       {
         arr[0]=i;
         arr[1]=j;
       }
      }
    }
   return arr;
}
