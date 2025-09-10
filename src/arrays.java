import java.util.Scanner;


public class arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int n = 7;
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        int[] array3 = new int[n];
        int suma = 0;


        //  primer arreglo
        System.out.println("=== Primer arreglo ===");
        for(int i=0; i<n; i++){
            System.out.print("Ingresa el número en la posición " + (i+1));
            array1[i] = sc.nextInt();
        }


        // segundo arreglo
        System.out.println("=== Segundo arreglo ===");
        for(int i=0; i<n; i++){
            System.out.print("Ingresa el número en la posición " + (i+1));
            array2[i] = sc.nextInt();
        }


        // Calcular diferencias y sumar
        System.out.println("=== Calculando diferencias ===");
        for(int i=0; i<n; i++){
            array3[i] = array1[i] - array2[i];
            suma += array3[i];
        }


        // Calcular promedio
        double promedio = (double) suma / n;


        // Mostrar el promedio
        System.out.println("El promedio de los datos del tercer arreglo es: " + promedio);


        sc.close();


        // Mostrar los datos del tercer arreglo
        System.out.println("=== Datos del tercer arreglo ===");
        for(int i=0; i<n; i++){
            System.out.println("array3[" + (i+1) + "] = " + array3[i]);
        }




    }
}
