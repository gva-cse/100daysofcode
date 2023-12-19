
class Solution
{
    public:
    //Function to find the first position with different bits.
    int posOfRightMostDiffBit(int m, int n)
    {
        int i=1;
        // Your code here
        if(m==n){
            return -1;
        }else{
            int num=m^n ;
            while((num&1)==0){
                i=i+1;
                num>>=1;
            }
            return i;
        }
    }
};
