package estruturas;

import java.util.Random;

import utills.No;
import organizador.Tempos;

public class ArvoreAVL {
    private No raiz;
    private int altura, tamanho;
    private Tempos tempos;

    public ArvoreAVL(int tamanho) {
        this.raiz = null;
        this.altura = 0;
        this.tamanho = tamanho;
        tempos = new Tempos(false);
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

    private void realizarBuscas() {
        buscarPrimeiroElemento();
        buscarUltimoElemento();
        buscarElementoMeio();
        buscarElementoInexistente();
        buscarElementoAleatorio();
    }

    private No rotacaoEsquerda(No y) {
        No x = y.getDireita();
        No T2 = x.getEsquerda();

        x.setEsquerda(y);
        y.setDireita(T2);

        y.setAltura(Math.max(getAltura(y.getEsquerda()), getAltura(y.getDireita())) + 1);
        x.setAltura(Math.max(getAltura(x.getEsquerda()), getAltura(x.getDireita())) + 1);

        return x;
    }

    private No rotacaoDireita(No y) {
        No x = y.getEsquerda();
        No T3 = x.getDireita();

        x.setDireita(y);
        y.setEsquerda(T3);

        y.setAltura(Math.max(getAltura(y.getEsquerda()), getAltura(y.getDireita())) + 1);
        x.setAltura(Math.max(getAltura(x.getEsquerda()), getAltura(x.getDireita())) + 1);

        return x;
    }

    private No inserirRecursivo(No atual, int valor) {
        if (atual == null) {
            return new No(valor);
        }

        if (valor < atual.getValor()) {
            atual.setEsquerda(inserirRecursivo(atual.getEsquerda(), valor));
        } else {
            atual.setDireita(inserirRecursivo(atual.getDireita(), valor));
        }

        atual.setAltura(Math.max(getAltura(atual.getEsquerda()), getAltura(atual.getDireita())) + 1);

        int balanceamento = atual.getBalance();

        if (balanceamento > 1) {
            if (valor < atual.getEsquerda().getValor()) {
                return rotacaoDireita(atual);
            } else {
                atual.setEsquerda(rotacaoEsquerda(atual.getEsquerda()));
                return rotacaoDireita(atual);
            }
        } else if (balanceamento < -1) {
            if (valor > atual.getDireita().getValor()) {
                return rotacaoEsquerda(atual);
            } else {
                atual.setDireita(rotacaoDireita(atual.getDireita()));
                return rotacaoEsquerda(atual);
            }
        }

        return atual;
    }

    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
        altura = getAltura(raiz);
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

    private int getAltura(No no) {
        if (no == null) {
            return -1;
        }
        return no.getAltura();
    }

    public void exibirTempos() {
        tempos.exibirTempos(tamanho);
    }
}
