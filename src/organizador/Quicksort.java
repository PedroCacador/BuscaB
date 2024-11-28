package organizador;

public class Quicksort {

    public static int[] quickSort(int[] vetor) {
        int[] vetorClonado = vetor.clone();
        quickSort(vetorClonado, 0, vetorClonado.length - 1);
        return vetorClonado;
    }

    private static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = partition(vetor, inicio, fim);
            quickSort(vetor, inicio, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
    }

    private static int partition(int[] vetor, int inicio, int fim) {
        int pivo = vetor[fim];
        int i = (inicio - 1);
        for (int j = inicio; j < fim; j++) {
            if (vetor[j] <= pivo) {
                i++;
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[fim];
        vetor[fim] = temp;
        return i + 1;
    }

    public static long quickSortTempo(int[] vetor) {
        long inicio = System.nanoTime();
        quickSort(vetor.clone());
        long fim = System.nanoTime();
        return fim - inicio;
    }

}
