public class search {
    public static void main(String[] args) {
    String name = "priyobrata";
    char target = 'r';
    boolean ans = searchp(name,target);
        System.out.println(ans);
    }
    static boolean searchp(String str ,char  target){
        if (str.length() == 0){
            return false;

        }
        for(int i=0;i<str.length();i++){
            if (target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }


}
