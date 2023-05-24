package GerenciadorDeContatos;

public class AdicionarContato implements Gerenciador {
    public AdicionarContato(String nome, String numero){
        this.listaContatos.put(nome, numero);
        System.out.println("Contato adicionado: " + nome);
        System.out.println("Telefone: " + numero);
    }
}
