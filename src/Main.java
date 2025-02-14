import java.util.Arrays;
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

        //Conversion de tipos de datos
        vi=(int)2.9 + (int)1.1;
        System.out.println("vi: " + vi );
        vi = (int)(2.9 + 1.1);
        System.out.println("vi: " + vi );
        //vi = (int)vb + vb; hay tipos que no son convertibles
        vi = vc + 1;
        System.out.println("vi (entero): " + vi + " vi (char): " + (char)vi);

        //5 - Operadores

        int a=1, b=2;
        System.out.println("a: " + a + " b: " + b);
        a++; //Postincremento
        ++b; //Preincremento
        System.out.println("a: " + a + " b: " + b);
        int C = a++ * ++b; //En este caso primero agarra el a como 2 y despues le incrementa, al b lo incrementa primero y despues lo usa
        System.out.println("a: " + a + " b: " + b + " C: " + C);

        //Precedencia de operadores: () ++ -- */% +- < <= == >= > !=
        boolean bo= (2+8) < ++a || 2+5*9 == a++ + 43; //10 < 4 || 47 == 47;// (El ultimo a dice que es 4, pero despues a=5 asi que si se repite, a es distinto)
                                                      //false || true --> true
        System.out.println("bo: " + bo + "a: " + a); //a vale 5

        bo = ++a < 10  || ++a == 6 && true; //primer a vale 6 ultimo a vale 7, pero como la primera parte ya es true, todolo otro no se hace
            //true ||...... --> true (por el or).
        // Esto es por el doble ||, si es solo 1 | se evaluan los dos lados si o si
        System.out.println("bo: " + bo + "a: " + a);

        //Strings
        cad = "Hola"; //Sobrecarga de operadores: El operador se comporta de forma diferente segun sus operadores
        a= 1+1;
        cad = "1" + "1" + 2 + 3 + 4 + 2.3 + true;//+ es concatenacion, incluir otro tipo se denomina wrapping
        System.out.println("cad: " + cad); //cad es la cadena 1111, se agregan los numero al costado
                                            //"1"+"1" + 2+3+4+2.3+true=112342.3true
        //Subcadenas
        String cad1= cad.substring(2,4); //Agarra del 2 al anterior -1
        System.out.println("cad1: " + cad1); //Escribe cad1=23

        bo= "hola".equals("Hola"); //Como las cadenos no son iguales hola!=Hola, es false
        System.out.println("bo: " + bo); //bo=false

        bo= cad1.equals("23"); //cad1=23
        System.out.println("bo: " + bo);//bo:23=23 --> true

        // Arrays
        int []arrInt1= new int[5];
        int []arrInt2= {0, 1, 2, 3, 4};

        System.out.println("arrInt1: " + Arrays.toString(arrInt1)); //arrInt1= {0, 0, 0, 0, 0}
        System.out.println("arrInt2: " + Arrays.toString(arrInt2)); //arrInt2= {0, 1, 2, 3, 4}

        //Matrices

        int[][]matriz1= new int[5][5];
        int[][]matriz2= {{0, 1, 2, 3, 4},
                         {0, 1, 2, 3, 4} }; //Abajo se pone asi porque no sabe sacar unicamente las dos primeras, sacatodolo guardado
        System.out.println("matriz1: " + Arrays.toString(matriz1[0]) + "\n" + Arrays.toString(matriz1[1])); //matriz1=[0,0,0,0,0], [0,0,0,0,0]
        System.out.println("matriz2: " + Arrays.toString(matriz2[0]) + "\n" + Arrays.toString(matriz2[1])); //matriz1=[0,1,2,3,4], [0,1,2,3,4]

        System.exit(0); //Termina con la ejecucion del programa --> return 0, se puede usar para que el programa lea una sola parte el proyecto
    }

}