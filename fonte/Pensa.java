package fonte;

public class Pensa {
    public int i = 0;
    public char op;
    Print imprime = new Print();
    Var[] variavel = new Var[20];
    Cond testa = new Cond();
    Math math = new Math();
    String[] text;
    double result, num1, num2;
    
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

    public void start(){
        for(int i = 0; i < text.length; i++){
            if(text[i] == "break")
                break;

            if (text[i] == "conta"){
                this.startMath(i);
            }
        }
    }
    public void startMath(int l){
        for(int i = l; i < text.length; i++){
            if(this.text[i] == "+"){
                result = math.add(this.encontraNum1(),this.encontraNum2());
            }
        }
    }
    public double encontraNum1(){
        return result;

    }
    public double encontraNum2(){
        return result;

    }

}
