class Solution {
    public String simplifyPath(String path) {
        String[]words=path.split("/");
        Stack<String>stack=new Stack<>();
        for(String i:words){
            if(i.equals(".")||i.equals(""))
                continue;
            if(i.equals("..")){
                if(!stack.isEmpty())
                    stack.pop();
            }
                else
                    stack.push(i);
        }
        StringBuilder res=new StringBuilder();
        for(String i:stack){
            res.append("/").append(i);
        }
        if(res.length()==0)
            return "/";
        
            return res.toString();
    }
}