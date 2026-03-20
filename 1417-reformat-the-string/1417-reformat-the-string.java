class Solution {
    public String reformat(String s) {
     List<Character>list=new ArrayList<>();
     List<Character>list1=new ArrayList<>();
     int c=0;
     int c1=0;
     for(char i:s.toCharArray()){
        if(Character.isLetter(i)){
            list.add(i);
        }else{
          list1.add(i);
        }
     }
    if(Math.abs(list.size() - list1.size()) > 1){
    return "";
}
    String s1="";
     int ind=0;
    int ind1=0;
   
  StringBuilder res = new StringBuilder();

boolean flag = list.size() >= list1.size();

for(int i = 0; i < s.length(); i++){
    if(flag){
        res.append(list.get(ind++));
    }else{
        res.append(list1.get(ind1++));
    }
    flag = !flag;
}

return res.toString();
    }
}