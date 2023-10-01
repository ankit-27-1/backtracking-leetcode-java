public class file3 {
    public static void main(String[] args) {
        String str="abc";
        permutations(str,"");
    }
    static void permutations(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            String str=s.substring(0,i)+s.substring(i+1);
            permutations(str,ans+curr);
        }
    }
}
