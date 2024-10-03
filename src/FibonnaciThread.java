public class FibonnaciThread extends Thread{

    private int numero;

    public FibonnaciThread(int numero){
        this.numero = numero;
    }


    @Override
    public void run() {

        int a = 0;
        int b = 1;
        for(int i = 2; i < numero; i++){

            int nextNumbre = a + b;
            System.out.println(nextNumbre);
            a = b;
            b = nextNumbre;


        }
    }
}
