package pasta;

public class ArquivoImagem extends Arquivo {

    public ArquivoImagem(String nome, String caminho) {
        super(nome, caminho);
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo arquivo de imagem: " + nome);
        // Lógica para abrir arquivo de imagem
    }

    @Override
    public void fechar() {
        System.out.println("Fechando arquivo de imagem: " + nome);
        // Lógica para fechar arquivo de imagem
    }
}
