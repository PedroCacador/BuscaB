import estruturas.ArvoreAVL;
import estruturas.Vetor;
import estruturas.ArvoreBinaria;

public class App {
    public static void main(String[] args) {
        App app = new App();
    }

    public App() {
        Vetores();
        Arvores();
        ArvoresAVL();
    }

    private void Vetores() {
        Vetor[] vetoresOrdenado = new Vetor[] {
                new Vetor(100),
                new Vetor(1000),
                new Vetor(10000)
        };

        for (int i = 0; i < vetoresOrdenado.length; i++) {
            vetoresOrdenado[i].adicionarTemposOrdenado();
            vetoresOrdenado[i].exibirTempos();
            System.out.println("============");
        }

        Vetor[] vetoresInverso = new Vetor[] {
                new Vetor(100),
                new Vetor(1000),
                new Vetor(10000)
        };

        for (int i = 0; i < vetoresInverso.length; i++) {
            vetoresInverso[i].adicionarTemposInverso();
            vetoresInverso[i].exibirTempos();
            System.out.println("============");
        }

        Vetor[] vetoresAleatorio = new Vetor[] {
                new Vetor(100),
                new Vetor(1000),
                new Vetor(10000)
        };

        for (int i = 0; i < vetoresAleatorio.length; i++) {
            vetoresAleatorio[i].adicionarTemposAleatorio();
            vetoresAleatorio[i].exibirTempos();
            System.out.println("============");
        }

    }

    private void Arvores() {
        ArvoreBinaria[] arvoresOrdenado = new ArvoreBinaria[] {
                new ArvoreBinaria(100),
                new ArvoreBinaria(1000),
                new ArvoreBinaria(10000)
        };

        for (int i = 0; i < arvoresOrdenado.length; i++) {
            arvoresOrdenado[i].adicionarTemposOrdenado();
            arvoresOrdenado[i].exibirTempos();
            System.out.println("============");
        }

        ArvoreBinaria[] arvoresInverso = new ArvoreBinaria[] {
                new ArvoreBinaria(100),
                new ArvoreBinaria(1000),
                new ArvoreBinaria(10000)
        };

        for (int i = 0; i < arvoresInverso.length; i++) {
            arvoresInverso[i].adicionarTemposInverso();
            arvoresInverso[i].exibirTempos();
            System.out.println("============");
        }

        ArvoreBinaria[] arvoresAleatorio = new ArvoreBinaria[] {
                new ArvoreBinaria(100),
                new ArvoreBinaria(1000),
                new ArvoreBinaria(10000)
        };

        for (int i = 0; i < arvoresAleatorio.length; i++) {
            arvoresAleatorio[i].adicionarTemposAleatorio();
            arvoresAleatorio[i].exibirTempos();
            System.out.println("============");
        }

    }

    private void ArvoresAVL() {
        ArvoreAVL[] arvoresOrdenado = new ArvoreAVL[] {
                new ArvoreAVL(100),
                new ArvoreAVL(1000),
                new ArvoreAVL(10000)
        };

        for (int i = 0; i < arvoresOrdenado.length; i++) {
            arvoresOrdenado[i].adicionarTemposOrdenado();
            arvoresOrdenado[i].exibirTempos();
            System.out.println("============");
        }

        ArvoreAVL[] arvoresInverso = new ArvoreAVL[] {
                new ArvoreAVL(100),
                new ArvoreAVL(1000),
                new ArvoreAVL(10000)
        };

        for (int i = 0; i < arvoresInverso.length; i++) {
            arvoresInverso[i].adicionarTemposInverso();
            arvoresInverso[i].exibirTempos();
            System.out.println("============");
        }

        ArvoreAVL[] arvoresAleatorio = new ArvoreAVL[] {
                new ArvoreAVL(100),
                new ArvoreAVL(1000),
                new ArvoreAVL(10000)
        };

        for (int i = 0; i < arvoresAleatorio.length; i++) {
            arvoresAleatorio[i].adicionarTemposAleatorio();
            arvoresAleatorio[i].exibirTempos();
            System.out.println("============");
        }

    }

}
