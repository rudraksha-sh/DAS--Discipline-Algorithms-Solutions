class Solution {
    public boolean isPalindrome(int x) {
        int x2=x;
        if(x<0)return false;
        else{
        int y =0;
        while(x>0){
            y=y*10+x%10;
            x=x/10;
        }
        return x2==y;
        }
    }
}