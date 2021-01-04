package fonte;

public class Pensa {
    public int i = 0;
    public char op;
    Print imprime = new Print();
    Var[] variavel = new Var[20];
    Cond testa = new Cond();
    Math math = new Math();
    String[] text;
    
    public void leia(){

        while(i<=text.length){
            if(text[i] == "break"){
                break;
            }
            else if(text[i] == "start"){
                this.start();
            }
            i++;
        }
    }
    public void setOp(char conta){
        this.op = conta;
    }
    public void start(){
        
    }


}
