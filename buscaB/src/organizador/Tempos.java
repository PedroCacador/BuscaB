package organizador;

public class Tempos {

    private long tempoPreencher,
            tempoBuscarPrimeiro,
            tempoBuscarUltimo,
            tempoBuscarMeio,
            tempoBuscarInexistente,
            tempoBuscarAleatorio;

    private long tempoBuscarPrimeiroBinario,
            tempoBuscarUltimoBinario,
            tempoBuscarMeioBinario,
            tempoBuscarInexistenteBinario,
            tempoAleatorioBinario;

    private long tempoQuickSort, tempoBubbleSort, tempoBinarySearch;

    private boolean isVetor;

    public Tempos(boolean isVetor) {
        this.isVetor = isVetor;
        this.tempoPreencher = 0;
        this.tempoBuscarPrimeiro = 0;
        this.tempoBuscarUltimo = 0;
        this.tempoBuscarMeio = 0;
        this.tempoBuscarInexistente = 0;
        this.tempoBuscarAleatorio = 0;
        this.tempoBuscarPrimeiroBinario = 0;
        this.tempoBuscarUltimoBinario = 0;
        this.tempoBuscarMeioBinario = 0;
        this.tempoBuscarInexistenteBinario = 0;
        this.tempoAleatorioBinario = 0;

        this.tempoQuickSort = 0;
        this.tempoBubbleSort = 0;
        this.tempoBinarySearch = 0;
    }

    public long getTempoPreencher() {
        return tempoPreencher;
    }

    public void addTempoPreencher(long tempoPreencher) {
        this.tempoPreencher += tempoPreencher;
    }

    public long getTempoBuscarPrimeiro() {
        return tempoBuscarPrimeiro;
    }

    public void addTempoBuscarPrimeiro(long tempoBuscarPrimeiro) {
        this.tempoBuscarPrimeiro += tempoBuscarPrimeiro;
    }

    public long getTempoBuscarUltimo() {
        return tempoBuscarUltimo;
    }

    public void addTempoBuscarUltimo(long tempoBuscarUltimo) {
        this.tempoBuscarUltimo += tempoBuscarUltimo;
    }

    public long getTempoBuscarMeio() {
        return tempoBuscarMeio;
    }

    public void addTempoBuscarMeio(long tempoBuscarMeio) {
        this.tempoBuscarMeio += tempoBuscarMeio;
    }

    public long getTempoBuscarInexistente() {
        return tempoBuscarInexistente;
    }

    public void addTempoBuscarInexistente(long tempoBuscarInexistente) {
        this.tempoBuscarInexistente += tempoBuscarInexistente;
    }

    public long getTempoBuscarAleatorio() {
        return tempoBuscarAleatorio;
    }

    public void addTempoBuscarAleatorio(long tempoAleatorio) {
        this.tempoBuscarAleatorio += tempoAleatorio;
    }

    public long getTempoBuscarPrimeiroBinario() {
        return tempoBuscarPrimeiroBinario;
    }

    public void addTempoBuscarPrimeiroBinario(long tempoBuscarPrimeiroBinario) {
        this.tempoBuscarPrimeiroBinario += tempoBuscarPrimeiroBinario;
    }

    public long getTempoBuscarUltimoBinario() {
        return tempoBuscarUltimoBinario;
    }

    public void addTempoBuscarUltimoBinario(long tempoBuscarUltimoBinario) {
        this.tempoBuscarUltimoBinario += tempoBuscarUltimoBinario;
    }

    public long getTempoBuscarMeioBinario() {
        return tempoBuscarMeioBinario;
    }

    public void addTempoBuscarMeioBinario(long tempoBuscarMeioBinario) {
        this.tempoBuscarMeioBinario += tempoBuscarMeioBinario;
    }

    public long getTempoBuscarInexistenteBinario() {
        return tempoBuscarInexistenteBinario;
    }

    public void addTempoBuscarInexistenteBinario(long tempoBuscarInexistenteBinario) {
        this.tempoBuscarInexistenteBinario += tempoBuscarInexistenteBinario;
    }

    public long getTempoAleatorioBinario() {
        return tempoAleatorioBinario;
    }

    public void addTempoBuscarAleatorioBinario(long tempoAleatorioBinario) {
        this.tempoAleatorioBinario += tempoAleatorioBinario;
    }

    public void exibirTempos(int tamanho) {
        System.out.println("\nTamanho: " + tamanho);
        System.out.printf("%-40s%10d nanosegundos%n", "Tempo para preencher:", tempoPreencher);
        System.out.printf("%-40s%10d nanosegundos%n", "Tempo para buscar primeiro (sequencial):", tempoBuscarPrimeiro);
        System.out.printf("%-40s%10d nanosegundos%n", "Tempo para buscar ultimo (sequencial):", tempoBuscarUltimo);
        System.out.printf("%-40s%10d nanosegundos%n", "Tempo para buscar meio (sequencial):", tempoBuscarMeio);
        System.out.printf("%-40s%10d nanosegundos%n", "Tempo para buscar inexistente (sequencial):",
                tempoBuscarInexistente);
        System.out.printf("%-40s%10d nanosegundos%n", "Tempo para buscar aleatorio (sequencial):",
                tempoBuscarAleatorio);

        if (isVetor) {
            System.out.printf("%-40s%10d nanosegundos%n", "Tempo para buscar primeiro (binario):",
                    tempoBuscarPrimeiroBinario);
            System.out.printf("%-40s%10d nanosegundos%n", "Tempo para buscar ultimo (binario):",
                    tempoBuscarUltimoBinario);
            System.out.printf("%-40s%10d nanosegundos%n", "Tempo para buscar meio (binario):", tempoBuscarMeioBinario);
            System.out.printf("%-40s%10d nanosegundos%n", "Tempo para buscar inexistente (binario):",
                    tempoBuscarInexistenteBinario);
            System.out.printf("%-40s%10d nanosegundos%n", "Tempo para buscar aleatorio (binario):",
                    tempoAleatorioBinario);
            System.out.printf("%-40s%10d nanosegundos%n", "Tempo QuickSort:", tempoQuickSort);
            System.out.printf("%-40s%10d nanosegundos%n", "Tempo BubbleSort:", tempoBubbleSort);
            System.out.printf("%-40s%10d nanosegundos%n", "Tempo BinarySearch:", tempoBinarySearch);
        }
    }

    public void setTempoBuscarPrimeiro(long tempoBuscarPrimeiro) {
        this.tempoBuscarPrimeiro = tempoBuscarPrimeiro;
    }

    public void setTempoBuscarUltimo(long tempoBuscarUltimo) {
        this.tempoBuscarUltimo = tempoBuscarUltimo;
    }

    public void setTempoBuscarMeio(long tempoBuscarMeio) {
        this.tempoBuscarMeio = tempoBuscarMeio;
    }

    public void setTempoBuscarInexistente(long tempoBuscarInexistente) {
        this.tempoBuscarInexistente = tempoBuscarInexistente;
    }

    public void setTempoBuscarAleatorio(long tempoBuscarAleatorio) {
        this.tempoBuscarAleatorio = tempoBuscarAleatorio;
    }

    public void setTempoBuscarPrimeiroBinario(long tempoBuscarPrimeiroBinario) {
        this.tempoBuscarPrimeiroBinario = tempoBuscarPrimeiroBinario;
    }

    public void setTempoBuscarUltimoBinario(long tempoBuscarUltimoBinario) {
        this.tempoBuscarUltimoBinario = tempoBuscarUltimoBinario;
    }

    public void setTempoBuscarMeioBinario(long tempoBuscarMeioBinario) {
        this.tempoBuscarMeioBinario = tempoBuscarMeioBinario;
    }

    public void setTempoBuscarInexistenteBinario(long tempoBuscarInexistenteBinario) {
        this.tempoBuscarInexistenteBinario = tempoBuscarInexistenteBinario;
    }

    public void setTempoAleatorioBinario(long tempoAleatorioBinario) {
        this.tempoAleatorioBinario = tempoAleatorioBinario;
    }

    public long getTempoQuickSort() {
        return tempoQuickSort;
    }

    public void addTempoQuickSort(long tempoQuickSort) {
        this.tempoQuickSort += tempoQuickSort;
    }

    public long getTempoBubbleSort() {
        return tempoBubbleSort;
    }

    public void addTempoBubbleSort(long tempoBubbleSort) {
        this.tempoBubbleSort += tempoBubbleSort;
    }

    public long getTempoBinarySearch() {
        return tempoBinarySearch;
    }

    public void addTempoBinarySearch(long tempoBinarySort) {
        this.tempoBinarySearch += tempoBinarySort;
    }

}