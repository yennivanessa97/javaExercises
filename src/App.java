import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sumaPrecios = 0;
        String[] apellidos = new String[5];

        apellidos[0] = "Delgado";
        apellidos[4] = "Ferro";
        apellidos[1] = "Velasco";
        apellidos[2] = "Martinez";
        apellidos[3] = "Sanchez";

        for( int i=0; i<apellidos.length; i++){
            System.out.println(apellidos[i]);
        }


        int[] precios = new int[3];

        for( int i=0; i<precios.length; i++){
            System.out.println("dame el precio");
            precios[i] = sc.nextInt();
        }

        for( int i=0; i<precios.length; i++){
            System.out.println(precios[i]);
        }

       for(int i=0; i< precios.length; i++){
            sumaPrecios = sumaPrecios + precios[i];
       }

       System.out.println("Suma de los precios: " + sumaPrecios );


        double promedio = sumaPrecios/precios.length;
        System.out.println("promedio " + promedio );
    }
}
