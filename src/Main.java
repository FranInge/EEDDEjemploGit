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

        //Sentencia de bifurcacion
       if (vi%2==0){
           System.out.println("El valor ingresado es par.");
       } else {
           System.out.println("El valor ingresado es impar.");
       }
        //Sentencia de bifurcacion anidadas
       if(vi < 50){
           System.out.println("El valor ingresado es menor de 50");
       }else if(vi > 50){
           System.out.println("El valor ingresado es mayor de 50");
       } else {
           System.out.println("El valor ingresado es igual a 50");
       }

       //Sentencia switch-case
        System.out.println("Introduzca un color (R/r, V/v, A/a): ");
       cad= sc.next();
       vc= cad.charAt(0);

       switch (vc){
           case 'R':
           case 'r':
               System.out.println("El color es rojo: ");
               break;
           case 'V':
           case 'v':
               System.out.println("El color es verde: ");
               break;
           case 'A':
           case 'a':
               System.out.println("El color es azul: ");
               break;

               default:
               System.out.println("El color es incorrecto");
       }
       /*
       vc= sc.next().charAt(0);
       if(vc == 'R'){
           System.out.println("El color ingresado es Rojo.");
       } */

       //Bucles cuando se sable el numero de iteraciones
       int suma1=0, suma2=0;
       for(int i=0; i<10; i++){
           suma1=suma1 + i;
           suma2+=i;
       }
        System.out.println("La suma de los numeros es suma1: " + suma1 + " suma2: " + suma2);

       //Bucles while cuando no es conocido a priori el numero de iteraciones
        int cont=1;
        int c=0;
        while(cont%2!=0) {
            int vp = 0;
            System.out.println("Introduzca un numero para ver si es par: ");
            vp = sc.nextInt();
            cont = vp%2;
            c++;
        }

        System.out.println("El numero ingresado es par. Numero de intentos hechos: " + c);
    }
}