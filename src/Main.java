import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         // se declara la intancia del scanner

        llenardatos datos = new llenardatos();
        ordenarDatos ordenamiento = new ordenarDatos();

        List<Integer> Numero = new ArrayList<>(); // se declara  la lista de tipo int

            datos.llenardatos(Numero);
            ordenamiento.ordenar(Numero);

    }
}