package pasta;

public class ArquivoTexto extends Arquivo {

    public ArquivoTexto(String nome, String caminho) {
        super(nome, caminho);
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo arquivo de texto: " + nome);
    }

    @Override
    public void fechar() {
        System.out.println("Fechando arquivo de texto: " + nome);
    }
}
