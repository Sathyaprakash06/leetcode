class Solution {
    public String removeDuplicateLetters(String s) {
      HashMap<Character,Integer> map=new HashMap<>();  
      for(int i=0;i<s.length();i++){
        map.put(s.charAt(i),i);
      }
      HashSet<Character>set=new HashSet<>();
      Stack<Character> stack=new Stack<>();
      for(int i=0;i<s.length();i++){
        if(set.contains(s.charAt(i))){
            continue;
        }
        while(!stack.isEmpty()&&s.charAt(i)<stack.peek()&&i<map.getOrDefault(stack.peek(),-1)){
            set.remove(stack.pop());
        }
        set.add(s.charAt(i));
        stack.push(s.charAt(i));
      }
      String p="";
      for(char i:stack){
        p+=i;
      }
      return p;
    }
}