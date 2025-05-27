
public class ListaEncadeada<T> {
    private No<T> inicio;

    public ListaEncadeada() {
        this.inicio = null;
    }

    public void adicionar(T dado) {
        No<T> novoNo = new No<>(dado);
        if (inicio == null) {
            inicio = novoNo;
        } else {
            No<T> atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }

    public void listar() {
        No<T> atual = inicio;
        while (atual != null) {
            System.out.println(atual.dado);
            atual = atual.proximo;
        }
    }

    public boolean atualizar(T antigo, T novo) {
        No<T> atual = inicio;
        while (atual != null) {
            if (atual.dado.equals(antigo)) {
                atual.dado = novo;
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    public boolean remover(T dado) {
        if (inicio == null) return false;

        if (inicio.dado.equals(dado)) {
            inicio = inicio.proximo;
            return true;
        }

        No<T> atual = inicio;
        while (atual.proximo != null) {
            if (atual.proximo.dado.equals(dado)) {
                atual.proximo = atual.proximo.proximo;
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }
}
