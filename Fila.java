public class Fila {
    private int dados[]; // Array para armazenar os elementos da fila
    private int tamanho; // Variável para rastrear o tamanho atual da fila

    // Construtor da Fila
    public Fila(int capacidade) {
        dados = new int[capacidade];
        tamanho = 0;
    }

    // Método para adicionar um elemento no final da fila
    public void adicionaFim(int e) {
        // Verificar se a fila está cheia
        if (tamanho== dados.length) {
            System.out.println("ERRO! Fila Cheia!");
        } else {
            // Adicionar novo elemento no final da fila
            dados[tamanho++] = e;
        }
    }

    // Método para remover um elemento do início da fila
    public int removeInicio() {
        int r = 0;
        if (tamanho == 0) {
            System.out.println("ERRO! Fila vazia!");
        } else {
            r = dados[0];
            // Deslocar elementos para a esquerda
            for (int i = 1; i < tamanho; i++) {
                dados[i - 1] = dados[i];
            }
            tamanho--;
        }
        return r;
    }

    // Método para exibir os elementos da fila
    public String toStringF() {
        String r = "";
        for (int i = 0; i < tamanho; i++) {
            r = r + " " + dados[i];
        }
        return r;
    }
}
