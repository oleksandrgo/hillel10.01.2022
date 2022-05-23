

public class Main {

    public static void main(String[] args){

        String g = "volcharartem@gmail.com";

        System.out.println(mailcheck(g));

    }

    static boolean mailcheck(String x){
        char[] mlchck = x.toCharArray();
        int i;
        for (i = 0;i == mlchck.length; i++){
            if (mlchck[i] == '@') {
                return true;
                break;
            }
        }
        return false;
    };

}
