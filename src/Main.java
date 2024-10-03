import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
        FibonnaciThread ft = new FibonnaciThread(numero);
        ft.start();
    }
}