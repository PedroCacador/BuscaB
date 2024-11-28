package estruturas;

import java.util.Random;

import utills.No;
import organizador.Tempos;

public class ArvoreBinaria {
    private No raiz;
    private int tamanho;
    private Tempos tempos;

    public ArvoreBinaria(int tamanho) {
        this.raiz = null;
        this.tamanho = tamanho;
        tempos = new Tempos(false);
    }

    public void inserir(int valor) {
        No novo = new No(valor);

        if (raiz == null) {
            raiz = novo;
        } else {
            No atual = raiz;
            No pai;

            while (true) {
                pai = atual;
                if (valor < atual.getValor()) {
                    atual = atual.getEsquerda();
                    if (atual == null) {
                        pai.setEsquerda(novo);
                        return;
                    }
                } else {
                    atual = atual.getDireita();
                    if (atual == null) {
                        pai.setDireita(novo);
                        return;
                    }
                }
            }
        }
    }

    public void inserirAleatorio() {
        Random random = new Random();
        long inicio = System.nanoTime();
        for (int i = 0; i < tamanho; i++) {
            inserir(random.nextInt(tamanho));
        }
        tempos.addTempoPreencher(System.nanoTime() - inicio);
    }

    public void inserirInverso() {
        long inicio = System.nanoTime();
        for (int i = tamanho - 1; i >= 0; i--) {
            inserir(i);
        }
        tempos.addTempoPreencher(System.nanoTime() - inicio);

    }

    public void inserirOrdenado() {
        long inicio = System.nanoTime();
        for (int i = 0; i < tamanho; i++) {
            inserir(i);
        }
        tempos.addTempoPreencher(System.nanoTime() - inicio);
    }

    public boolean buscar(int valor) {
        return buscar(raiz, valor);
    }

    private boolean buscar(No atual, int valor) {
        if (atual == null) {
            return false;
        }

        if (valor == atual.getValor()) {
            return true;
        }

        if (valor < atual.getValor()) {
            return buscar(atual.getEsquerda(), valor);
        } else {
            return buscar(atual.getDireita(), valor);
        }
    }

    public void buscarPrimeiroElemento() {
        long inicio = System.nanoTime();
        buscarIndice(0);
        tempos.addTempoBuscarPrimeiro(System.nanoTime() - inicio);
    }

    public void buscarUltimoElemento() {
        long inicio = System.nanoTime();
        buscarIndice(tamanho - 1);
        tempos.addTempoBuscarUltimo(System.nanoTime() - inicio);
    }

    public void buscarElementoMeio() {
        long inicio = System.nanoTime();
        buscarIndice(tamanho / 2);
        tempos.addTempoBuscarMeio(System.nanoTime() - inicio);
    }

    public void buscarElementoInexistente() {
        long inicio = System.nanoTime();
        buscarIndice(tamanho + 1);
        tempos.addTempoBuscarInexistente(System.nanoTime() - inicio);
    }

    public void buscarElementoAleatorio() {
        long inicio = System.nanoTime();
        buscarIndice(new Random().nextInt(tamanho));
        tempos.addTempoBuscarAleatorio(System.nanoTime() - inicio);
    }

    private void realizarBuscas() {
        buscarPrimeiroElemento();
        buscarUltimoElemento();
        buscarElementoMeio();
        buscarElementoInexistente();
        buscarElementoAleatorio();
    }

    public void adicionarTemposOrdenado() {
        for (int i = 0; i < 5; i++) {
            // Resetar a árvore para cada iteração
            raiz = null;
            inserirOrdenado();
            realizarBuscas();
        }
    }

    public void adicionarTemposInverso() {
        for (int i = 0; i < 5; i++) {
            // Resetar a árvore para cada iteração
            raiz = null;
            inserirInverso();
            realizarBuscas();
        }
    }

    public void adicionarTemposAleatorio() {
        for (int i = 0; i < 5; i++) {
            // Resetar a árvore para cada iteração
            raiz = null;
            inserirAleatorio();
            realizarBuscas();
        }
    }

    public int buscarIndice(int valor) {
        No atual = raiz;
        int indiceAtual = 0;
        while (atual != null) {
            if (indiceAtual == valor) {
                return atual.getValor();
            } else if (atual.getValor() > valor) {
                atual = atual.getEsquerda();
                indiceAtual++;
            } else {
                atual = atual.getDireita();
            }
        }
        return -1;
    }

     public void exibirTempos() {
        tempos.exibirTempos(tamanho);
    }

}
