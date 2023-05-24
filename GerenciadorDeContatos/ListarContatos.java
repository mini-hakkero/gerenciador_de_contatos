package GerenciadorDeContatos;

public class ListarContatos implements Gerenciador{
    public ListarContatos() {
        if(!this.listaContatos.isEmpty()){
        this.listaContatos.forEach((nome, numero) -> {
            System.out.println(nome);
            System.out.println("Tel: " + numero);
            System.out.println("  ");
        });
    }else{
        System.out.println("Não há nenhum contato na lista.");
        }
    }
}
