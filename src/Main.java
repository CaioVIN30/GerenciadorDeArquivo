import pasta.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorArquivos gerenciador = new GerenciadorArquivos();
        boolean rodando = true;

        while (rodando) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar arquivo");
            System.out.println("2. Remover arquivo");
            System.out.println("3. Listar arquivos");
            System.out.println("4. Abrir arquivo");
            System.out.println("5. Fechar arquivo");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();  // Consome a nova linha

            switch (escolha) {
                case 1:
                    System.out.print("Nome do arquivo: ");
                    String nome = scanner.nextLine();
                    System.out.print("Caminho do arquivo: ");
                    String caminho = scanner.nextLine();
                    System.out.print("Tipo de arquivo (1 - Texto, 2 - Imagem): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();  // Consome a nova linha

                    Arquivo arquivo;
                    if (tipo == 1) {
                        arquivo = new ArquivoTexto(nome, caminho);
                    } else {
                        arquivo = new ArquivoImagem(nome, caminho);
                    }
                    gerenciador.adicionarArquivo(arquivo);
                    break;

                case 2:
                    System.out.print("Nome do arquivo a ser removido: ");
                    nome = scanner.nextLine();
                    Arquivo arquivoARemover = null;
                    for (Arquivo arq : gerenciador.arquivos) {
                        if (arq.getNome().equals(nome)) {
                            arquivoARemover = arq;
                            break;
                        }
                    }
                    if (arquivoARemover != null) {
                        gerenciador.removerArquivo(arquivoARemover);
                    } else {
                        System.out.println("Arquivo não encontrado.");
                    }
                    break;

                case 3:
                    gerenciador.listarArquivos();
                    break;

                case 4:
                    System.out.print("Nome do arquivo a ser aberto: ");
                    nome = scanner.nextLine();
                    Arquivo arquivoAAbrir = null;
                    for (Arquivo arq : gerenciador.arquivos) {
                        if (arq.getNome().equals(nome)) {
                            arquivoAAbrir = arq;
                            break;
                        }
                    }
                    if (arquivoAAbrir != null) {
                        new Thread(new LeitorArquivo(arquivoAAbrir)).start();
                    } else {
                        System.out.println("Arquivo não encontrado.");
                    }
                    break;

                case 5:
                    System.out.print("Nome do arquivo a ser fechado: ");
                    nome = scanner.nextLine();
                    Arquivo arquivoAFechar = null;
                    for (Arquivo arq : gerenciador.arquivos) {
                        if (arq.getNome().equals(nome)) {
                            arquivoAFechar = arq;
                            break;
                        }
                    }
                    if (arquivoAFechar != null) {
                        gerenciador.fecharArquivo(arquivoAFechar);
                    } else {
                        System.out.println("Arquivo não encontrado.");
                    }
                    break;

                case 6:
                    rodando = false;
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}