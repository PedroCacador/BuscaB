
# Projeto BUSCAB

## Descrição do Projeto
O projeto **BUSCAB** é uma aplicação em Java que implementa diferentes algoritmos de ordenação, busca e estruturas de dados. Ele foi desenvolvido com foco em modularidade e organização, permitindo fácil expansão e análise de estruturas e algoritmos.

---

## Estrutura do Projeto
O projeto segue a estrutura abaixo, com cada pacote responsável por uma funcionalidade específica:



---

## Detalhamento dos Pacotes e Classes

### **Pacote `estruturas`**
Contém implementações de estruturas de dados fundamentais:

- **`ArvoreAVL.java`**: Implementação de uma Árvore AVL, incluindo balanceamento dinâmico.
- **`ArvoreBinaria.java`**: Implementação de uma Árvore Binária de Busca para armazenar e pesquisar dados.
- **`Vetor.java`**: Gerencia vetores, com métodos para preenchê-los de diferentes formas (ordenado, inverso e aleatório).

### **Pacote `organizador`**
Implementa algoritmos de busca e ordenação:

- **`Binarysearch.java`**: Algoritmo de busca binária em vetores ordenados.
- **`Bubblesort.java`**: Algoritmo de ordenação simples Bubble Sort.
- **`Quicksort.java`**: Algoritmo de ordenação eficiente Quick Sort.
- **`Tempos.java`**: Classe para gerenciamento de tempos de execução (caso necessário).

### **Pacote `utills`**
Contém classes auxiliares:

- **`No.java`**: Representa os nós utilizados nas árvores AVL e Binária.

### **Classe `App.java`**
A classe principal que organiza e executa as operações:

- Criação de vetores com diferentes configurações (ordenado, inverso e aleatório).
- Execução de algoritmos de ordenação e busca.
- Chama métodos das estruturas de dados e algoritmos para testar seu comportamento.

---

## Como Executar o Projeto

Para rodar o projeto, basta compilar o código e executar a classe `App.java`:
- No Visual Studio Code: compile o código e execute a classe `App.java`.
- No JGRASP: compile o código com o comando "javac *.java" e execute a classe `App.java` com o comando "java App".
- Em outras IDEs: clique em **Run** ou **Executar** na classe `App.java` e o programa será iniciado.
Para rodar o projeto no visual studio code, basta compilar o código e executar a classe `App.java`. Se estiver usando uma IDE, clique em **Run** ou **Executar** na classe `App.java` e o programa será iniciado.



---
### Dependências

Este projeto requer o Java 23 ou superior para ser executado corretamente.


