import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    for (int i=1; i<=10;i++) {
        System.out.println("********* Tabla del "+i+" *************");
        for (int j=i; j<=10;j++) {
        System.out.println(i+" multiplicado por "+j+" es igual a "+i*j);
      }
    }
  }
}
    