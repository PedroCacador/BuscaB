package estruturas;

import java.util.Random;
import organizador.Binarysearch;
import organizador.Tempos;
import organizador.Quicksort;
import organizador.Bubblesort;

public class Vetor {
    private int[] vetor;
    private Tempos temposVetor;

    public Vetor(int tamanhoVetor) {
        this.vetor = new int[tamanhoVetor];
        temposVetor = new Tempos(true);
    }

    public void inserirAleatorio() {
        Random random = new Random();
        long inicio = System.nanoTime();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(vetor.length);
        }
        temposVetor.addTempoPreencher(System.nanoTime() - inicio);
    }

    public void inserirInverso() {
        long inicio = System.nanoTime();
        for (int i = vetor.length - 1; i >= 0; i--) {
            vetor[i] = i;
        }
        temposVetor.addTempoPreencher(System.nanoTime() - inicio);
    }

    public void inserirOrdenado() {
        long inicio = System.nanoTime();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i;
        }
        temposVetor.addTempoPreencher(System.nanoTime() - inicio);
    }

    public int buscarIndice(int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return vetor[i];
            }
        }
        return -1;
    }

    /* Buscas elementos */

    public void buscarPrimeiroElemento() {
        long inicio = System.nanoTime();
        buscarIndice(0);
        temposVetor.addTempoBuscarPrimeiro(System.nanoTime() - inicio);
    }

    public void buscarUltimoElemento() {
        long inicio = System.nanoTime();
        buscarIndice(vetor.length - 1);
        temposVetor.addTempoBuscarUltimo(System.nanoTime() - inicio);
    }

    public void buscarElementoMeio() {
        long inicio = System.nanoTime();
        buscarIndice(vetor.length / 2);
        temposVetor.addTempoBuscarMeio(System.nanoTime() - inicio);
    }

    public void buscarElementoInexistente() {
        long inicio = System.nanoTime();
        buscarIndice(vetor.length + 1);
        temposVetor.addTempoBuscarInexistente(System.nanoTime() - inicio);
    }

    public void buscarElementoAleatorio() {
        long inicio = System.nanoTime();
        buscarIndice(new Random().nextInt(vetor.length));
        temposVetor.addTempoBuscarAleatorio(System.nanoTime() - inicio);
    }

    /* Buscas binarias */

    public void buscarPrimeiroElementoBinario() {
        long inicio = System.nanoTime();
        int[] novoVetor = Quicksort.quickSort(vetor);
        Binarysearch.buscaBinaria(novoVetor, 0);
        temposVetor.addTempoBuscarPrimeiroBinario(System.nanoTime() - inicio);
    }

    public void buscarUltimoElementoBinario() {
        long inicio = System.nanoTime();
        int[] novoVetor = Quicksort.quickSort(vetor);
        Binarysearch.buscaBinaria(novoVetor, novoVetor.length - 1);
        temposVetor.addTempoBuscarUltimoBinario(System.nanoTime() - inicio);
    }

    public void buscarElementoMeioBinario() {
        long inicio = System.nanoTime();
        int[] novoVetor = Quicksort.quickSort(vetor);
        Binarysearch.buscaBinaria(novoVetor, novoVetor.length / 2);
        temposVetor.addTempoBuscarMeioBinario(System.nanoTime() - inicio);
    }

    public void buscarElementoInexistenteBinario() {
        long inicio = System.nanoTime();
        int[] novoVetor = Quicksort.quickSort(vetor);
        Binarysearch.buscaBinaria(novoVetor, novoVetor.length + 1);
        temposVetor.addTempoBuscarInexistenteBinario(System.nanoTime() - inicio);
    }

    public void buscarElementoAleatorioBinario() {
        long inicio = System.nanoTime();
        int[] novoVetor = Quicksort.quickSort(vetor);
        Binarysearch.buscaBinaria(novoVetor, new Random().nextInt(novoVetor.length));
        temposVetor.addTempoBuscarAleatorioBinario(System.nanoTime() - inicio);
    }

    private void realizarBuscas() {

        buscarPrimeiroElemento();
        buscarUltimoElemento();
        buscarElementoMeio();
        buscarElementoInexistente();
        buscarElementoAleatorio();

        buscarPrimeiroElementoBinario();
        buscarUltimoElementoBinario();
        buscarElementoMeioBinario();
        buscarElementoInexistenteBinario();
        buscarElementoAleatorioBinario();

       
    }

    public void adicionarTempoQuickSort() {
        temposVetor.addTempoQuickSort(Quicksort.quickSortTempo(vetor));
    }

    public void adicionarTempoBinarySearch() {
        long inicio = System.nanoTime();
        int[] novoVetor = Quicksort.quickSort(vetor);
        Binarysearch.buscaBinaria(novoVetor, novoVetor.length / 2);
        temposVetor.addTempoBinarySearch(System.nanoTime() - inicio);
    }

    public void adicionarTempoBubbleSort() {
        long inicio = System.nanoTime();
        Bubblesort.bubbleSort(vetor);
        temposVetor.addTempoBubbleSort(System.nanoTime() - inicio);
        
    }

    public void adicionarTemposOrdenado() {
        for (int i = 0; i < 5; i++) {
            inserirOrdenado();
            realizarBuscas();
        }
    }

    public void adicionarTemposInverso() {
        for (int i = 0; i < 5; i++) {
            inserirInverso();
            realizarBuscas();
        }
    }

    public void adicionarTemposAleatorio() {
        for (int i = 0; i < 5; i++) {
            inserirAleatorio();
            realizarBuscas();
        }
    }

    public void exibirTempos() {
        temposVetor.exibirTempos(vetor.length);
    }

}
