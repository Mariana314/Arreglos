package Arreglos;

public class Ejercicio3 {

	public static void main(String[] args) {
	    int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        int cuenta = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                cuenta++;
            }
        }

        System.out.println(cuenta);
	}

}
