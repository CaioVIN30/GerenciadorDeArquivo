package pasta;

public class LeitorArquivo implements Runnable {
    private Arquivo arquivo;

    public LeitorArquivo(Arquivo arquivo) {
        this.arquivo = arquivo;
    }

    @Override
    public void run() {
        arquivo.abrir();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        arquivo.fechar();
    }
}