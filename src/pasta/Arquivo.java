package pasta;

public abstract class Arquivo {
    protected String nome;
    protected String caminho;

    public Arquivo(String nome, String caminho) {
        this.nome = nome;
        this.caminho = caminho;
    }

    public abstract void abrir();
    public abstract void fechar();

    public String getNome() {
        return nome;
    }

    public String getCaminho() {
        return caminho;
    }

    @Override
    public String toString() {
        return nome + " (" + caminho + ")";
    }
}

