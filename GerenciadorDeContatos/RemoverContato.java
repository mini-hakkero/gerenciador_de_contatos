package GerenciadorDeContatos;

public class RemoverContato implements Gerenciador{
    public RemoverContato(String nome){
        this.listaContatos.remove(nome);
        System.out.println("Contato removido: " + nome);
    }
}
