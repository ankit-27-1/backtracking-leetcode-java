class Solution {
    public boolean areOccurrencesEqual(String s) {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            int countTemp=0;
            for(int j=0;j<n;j++){
                if(s.charAt(i)==s.charAt(j)){
                    countTemp++;
                }
            }
            if(i==0){
                count=countTemp;
            }
            if(count!=countTemp){
                return false;
            }
        }
        return true;
    }
}
