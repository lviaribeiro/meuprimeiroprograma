import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    int n1, n2, soma;

    Scanner teclado = new Scanner(System.in);

    n1 = teclado.nextInt();
    
    n2 = teclado.nextInt();
    
    soma =  n1 + n2; 

    System.out.println(soma);
  }
}