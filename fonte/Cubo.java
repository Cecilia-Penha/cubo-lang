package fonte;
import java.util.Scanner;
import java.io.File;


public class Cubo {
    public static void main(String[]args){
        try{
            File file = new File("teste.txt");
            Scanner scan = new Scanner(file);
            Pensa pensa = new Pensa();
            
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                System.out.println(line);
            }
            pensa.leia();  
            scan.close();
        }catch(Exception e){
            System.out.println("Erro");
        }
        
        

       

    }
}
