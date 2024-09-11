class Slution
  {
    public class boolean isPalindrome(int x)
    {
     int res=0,val=x;
      while(x!=0 && x>0)
        {
          int temp=x%10;
          res=(res*10)+temp;
          x/=10;
        }
      if(res==val) return true;
      return false;
    }
  }
