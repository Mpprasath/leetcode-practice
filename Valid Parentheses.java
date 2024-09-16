class Solution{
   public boolean isValid(String s){
    Stack<Character> st=new Stack<>();
    HashMap<Character,Character> hm=new Map<>();
    hm.put('}','{');
    hm.put(']','[');
    hm.put(')','(');
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
       if(hm.containsKey(ch)){
          if(st.empty()||st.pop()!=hm.get(ch)) return false;
       }else st.push(ch);
    }
     return st.empty();
  }
}
