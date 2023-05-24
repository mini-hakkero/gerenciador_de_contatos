package GerenciadorDeContatos;

public class BuscarContato implements Gerenciador {
    public BuscarContato(String nome) {
        if (this.listaContatos.get(nome) == null) {
            System.out.println("Este nome não está registrado.");
        }else{
            System.out.println("Telefone de " + nome + ": " + this.listaContatos.get(nome));
        }
    }
}