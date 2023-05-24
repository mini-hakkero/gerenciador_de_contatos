/*
package GerenciadorDeContatos;
import java.io.*;
import java.util.HashMap;

public class Load implements Gerenciador {
    public Load(String arquivo){
        try{
            FileInputStream file = new FileInputStream(arquivo);
            ObjectInputStream read = new ObjectInputStream(file);
            listaContatos = (HashMap<String, String>) read.readObject();
        }catch (FileNotFoundException e){
            System.out.println("Não foi encontrado uma lista de contatos, uma nova será criada. " + e.getMessage());
        }catch (IOException e){
            System.out.println("Não foi possível carregar a lista de contatos. " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Deu merda fudeu "+ e.getMessage());
        }
    }
}
*/