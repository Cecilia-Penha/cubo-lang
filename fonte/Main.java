package fonte;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.File;


public class Main {
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
        Print imprime = new Print();
        Var[] variavel = new Var[20];
        Cond testa = new Cond();
        Math op = new Math();

       

    }
}
