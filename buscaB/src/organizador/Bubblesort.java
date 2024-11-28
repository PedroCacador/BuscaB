package organizador;

public class Bubblesort {

    public static void bubbleSort(int[] vetor) {
        int tam = vetor.length;
        int temp;

        for (int i = 0; i < tam-1; i++) {
            for (int j = 0; j < tam-i-1; j++) {
                if (vetor[j] > vetor[j+1]) {
                    temp = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = temp;
                }
            }
        }
    }

    public static void bubbleSortTempo(int[] vetor) {
        long inicio = System.nanoTime();
        bubbleSort(vetor.clone());
        long fim = System.nanoTime();
        System.out.println("Tempo de execução: " + (fim - inicio) + " ns");
    } 
}
