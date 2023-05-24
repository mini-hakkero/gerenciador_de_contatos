/*
package GerenciadorDeContatos;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Save implements Gerenciador {
    public Save(String arquivo){
        try{
            FileOutputStream file = new FileOutputStream(arquivo);
            ObjectOutputStream write = new ObjectOutputStream(file);
            write.writeObject(listaContatos);
            write.close();
            System.out.println("Salvando lista de contatos...");
        }catch (IOException e){
            System.out.println("Erro ao salvar contatos, " + e.getMessage());
        }
    }
}
*/