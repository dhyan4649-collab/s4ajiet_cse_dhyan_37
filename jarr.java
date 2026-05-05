public class Main {
    public static void main(String[] args) {
        int a,n=20,m=6;
        int input=3;
        if (input>0&&input<=n){
            System.out.println("No of candies sold:"+input);
            n=n-input;
            if (n<=m){
                n=10;
            }
            System.out.println("Remaining candies:"+n);
        }else{
            System.out.println("Invalid");
        }
    }
}
