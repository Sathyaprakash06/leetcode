class Solution {
    public String removeStars(String s) {
        String s1="";
        Stack<Character>stack=new Stack<>();
        for(char i:s.toCharArray()){
            if(i=='*'){
                stack.pop();
            }else{
                stack.push(i);
            }
        }
        StringBuilder res=new StringBuilder();
        for(char ch:stack){
            res.append(ch);
        }
        return res.toString();
    }
}