import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(findPrimeNumbers(100));
    }

    private static ArrayList<Integer> findPrimeNumbers(int maxNum){
        ArrayList<Integer> pnList = new ArrayList<Integer>();
        int i, j;
        boolean divideFlog;

        for(i=2;i<=maxNum;i++){
            divideFlog = true;
            /* iの正の平方根の整数部分が2未満のときは、繰返し処理を実行しない  */
            for(j=2;j<=Math.floor(Math.sqrt(i));j++){
                if(i % j == 0){
                    divideFlog = false;
                    break;
                }
            }
            if(divideFlog == true) {
                pnList.add(i);
            }
        }
        return pnList;
    }
}