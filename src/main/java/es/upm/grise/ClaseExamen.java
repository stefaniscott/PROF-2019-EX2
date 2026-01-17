package es.upm.grise;

import java.util.ArrayList;
import java.util.List;

public class ClaseExamen {
    public static List<Integer> primos(int n) throws EntradaInvalida {
        if (n <= 1) {
            throw new EntradaInvalida();
        }
        List<Integer> factores = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factores.add(i);
                n /= i;
            }
        }
        return factores;
    }
}
