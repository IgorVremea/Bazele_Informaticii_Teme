public class Task10 {
    // Care este cel mai mic numar prim mai mare ca 1000?
    public static void main(String args[]) throws Exception{
        boolean isPrime = false;
        int curNum = 1000;
        while(!isPrime){
            curNum++;
            for(int i = 2; i < curNum; i++){
                if(curNum % i == 0 ){
                    isPrime = false;
                    break;
                }
                isPrime = true;
            }
        }
        System.out.println("Primul numar prim dupa 1000: " + curNum);
    }
}
