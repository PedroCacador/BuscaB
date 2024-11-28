package utills;

public class No {

    private int valor,altura;
    private No esquerda, direita;
    
    public No(int valor) {
        this.valor = valor;
        esquerda = null;
        direita = null;
        altura = 1;
    }

    public int getBalance() {
        int leftaltura = (esquerda == null) ? 0 : esquerda.altura;
        int rightaltura = (direita == null) ? 0 : direita.altura;
        return leftaltura - rightaltura;
    }


    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }   

    public int getValor() {
        return valor;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }   

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }


}
