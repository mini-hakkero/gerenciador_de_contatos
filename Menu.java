import GerenciadorDeContatos.*;

public class Menu {
    public static void Texto(){
        System.out.println("Escolha uma opção:");
        System.out.println("1- Adicionar contato");
        System.out.println("2- Remover contato");
        System.out.println("3- Buscar contato");
        System.out.println("4- Listar contatos");
        System.out.println("5- Relistar opções");
        System.out.println("6- Finalizar operações");

    }
    public static void Escolha(){
        String nome;
        String numero;
        int opcao;
        do{
            opcao = Entrada.Opcao();
            switch (opcao) {
                case 1 -> {
                    System.out.println("Insira o nome: ");
                    nome = Entrada.Info();
                    System.out.println("Insira o número de telefone: ");
                    numero = Entrada.Info();
                    new AdicionarContato(nome, numero);
                }
                case 2 -> {
                    System.out.println("Insira o nome do contato a ser removido: ");
                    nome = Entrada.Info();
                    new RemoverContato(nome);
                }
                case 3 -> {
                    System.out.println("Insira nome do contato a ser buscado: ");
                    nome = Entrada.Info();
                    new BuscarContato(nome);
                }
                case 4 -> {
                    System.out.println("Listando contatos: ");
                    new ListarContatos();
                }
                case 5 -> Menu.Texto();
            }
        }while(opcao!=6);
    }
}
