package organizador;

public class Binarysearch {
    public static long buscaBinaria(int[] vetor, int valor) {
        long inicio = System.nanoTime();
        int ini = 0;
        int fim = vetor.length - 1;
        while (ini <= fim) {
            int meio = (ini + fim) / 2;
            if (vetor[meio] == valor) {
                long fimTempo = System.nanoTime();

                return fimTempo - inicio;
            } else if (vetor[meio] > valor) {
                fim = meio - 1;
            } else {
                ini = meio + 1;
            }
        }

        long fimTempo = System.nanoTime();

        return fimTempo - inicio;
    }

}
