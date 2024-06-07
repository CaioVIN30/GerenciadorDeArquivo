package pasta;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorArquivos {
    public List<Arquivo> arquivos;

    public GerenciadorArquivos() {
        arquivos = new ArrayList<>();
    }

    public void adicionarArquivo(Arquivo arquivo) {
        arquivos.add(arquivo);
        System.out.println("Arquivo adicionado: " + arquivo);
    }

    public void removerArquivo(Arquivo arquivo) {
        arquivos.remove(arquivo);
        System.out.println("Arquivo removido: " + arquivo);
    }

    public void listarArquivos() {
        System.out.println("Lista de arquivos:");
        for (Arquivo arquivo : arquivos) {
            System.out.println(arquivo);
        }
    }

    public void abrirArquivo(Arquivo arquivo) {
        arquivo.abrir();
    }

    public void fecharArquivo(Arquivo arquivo) {
        arquivo.fechar();
    }
}
