class Main {
    public static void main(String[] args) {
            int n=20;
            int k=2;
            int j=3;
            int m=12;
            int p=12;
           
            int total =(m / k) + (p / j);
           
            if (m % k != 0|| p % j != 0){
                total += 1;
               
            }
   
            System.out.println("Number of Monkeys left on the tree:"+(n-total));
    }
}
