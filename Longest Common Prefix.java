class Solution{
   public String longestCommonPrefix(String arr[]){
     String org_String = arr[0];
     for(int i=1;i<arr.length;i++){
      while(arr[i].indexOf(org_String)!=0){
        org_String=org_String.substring(0,org_String.length()-1);
      }
     }
     return org_String;
   }
}
