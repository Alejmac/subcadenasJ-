import java.util.List;
import java.util.Scanner;

public class llenardatos
{
    public void llenardatos (List<Integer> lista){

        Scanner agregar = new Scanner(System.in);

        System.out.println("ingresa una cadena de caracteres de 7 numeos aleatorios\n ");
        for (int i = 0 ; i<5;i++){
       System.out.println("ingresa el numero :" +(i+1)+"\n");
       int numero = agregar.nextInt();
       lista.add(numero);
        }
    }


}
