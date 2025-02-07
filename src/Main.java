import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hola\n");

       int vi=2;
       double vd=2.3;
       char vc='A';
       String cad="Hola";

       //Mostrando variables por pantalla
       //+Activa como operador de concatenacion
       System.out.println("vi: " + vi + " vd: " + vd);

       //Leyendo datos de teclado
       Scanner sc= new Scanner(System.in);
       System.out.println("Introduzca un valor entero... ");
       vi= sc.nextInt();
       System.out.println("Valor entero leido: " + vi);


       if (vi%2==0){
           System.out.println("El valor ingresado es par.");
       } else {
           System.out.println("El valor ingresado es impar.");
       }

    }
}