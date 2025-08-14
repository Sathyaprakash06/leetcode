public class Solution {
    public string LargestGoodInteger(string num) {
        string[]arr={"000","111","222","333","444","555","666","777","888","999"};
        for(int i=arr.Length-1;i>=0;i--){
            if(num.Contains(arr[i])){
                return arr[i];
            }
        }
        return "";
    }
}