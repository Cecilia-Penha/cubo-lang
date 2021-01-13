package fonte;
import java.util.Scanner;
import java.io.File;
// Interpretador Cubo - Programa que tem a função de agir como um interpretador que realiza tarefas simples.
//Cecília Penha - Programação 1 
//ceciliapenha3@gmail.com

public class Cubo {
    public static void main(String[]args){
        try{
            String [] text = new String[2000];
            int amount = 0;
            File file = new File("teste.txt");
            Scanner scan = new Scanner(file);
            Pensa pensa = new Pensa();
            
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                text[amount++] = line;
            }
            pensa.leia();  
            scan.close();
            for(int i = 0; i < amount; i++){
                System.out.println("Linha" + i + ": " + text[i]);
            }
        }catch(Exception e){
            System.out.println("Erro");
        }
        
        

       

    }
}
