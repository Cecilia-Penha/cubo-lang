package fonte;
import java.util.Scanner;
import java.io.File;
// Interpretador Cubo - Programa que tem a função de agir como um interpretador que realiza tarefas simples.
//Cecília Penha - Programação 1 
//ceciliapenha3@gmail.com

public class Cubo {
    public static void main(String[]args){
        try{
            File file = new File("teste.txt");
            Scanner scan = new Scanner(file);
            
            
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                System.out.println(line);
            }
              
            scan.close();
        }catch(Exception e){
            System.out.println("Erro");
        }
        
        

       

    }
}
