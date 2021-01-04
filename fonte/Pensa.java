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
        String l = this.text[i];
        for(int i = 0; i < text.length; i++){
            if(text[i] == "break")
                break;

            if (text[i] == "conta"){
                this.startMath(l);
            }
        }
    }
    public void startMath(String l){
        for(int i = 0; i < l.length(); i++){
            if(this.text[i] == ";"){
                break;
            }
            if(this.text[i] == "+"){
                math.add(this.encontraNum1(l),this.encontraNum2(l));
            }
            if(this.text[i] == "-"){
                math.sub(this.encontraNum1(l),this.encontraNum2(l));
            }
            if(this.text[i] == "*"){
                math.mult(this.encontraNum1(l),this.encontraNum2(l));
            }
            if(this.text[i] == "/"){
                math.div(this.encontraNum1(l),this.encontraNum2(l));
            }
            if(this.text[i] == "%"){
                math.mod(this.encontraNum1(l),this.encontraNum2(l));
            }
        }
    }
    public double encontraNum1(String l){
        boolean procuraValor = false;
        int valor = 0;
        for(int i = 0; i < l.length(); i++){
            if(this.text[i] == "+" || this.text[i] == "-" || this.text[i] == "*" || this.text[i] == "/" || this.text[i] == "%"){
                break;
            }
            if(procuraValor == true){
                valor = Integer.parseInt(this.text[i]);
            }
            if(this.text[i] == "$"){
                procuraValor = true;
            } 
        }
        return valor;

    }
    public double encontraNum2(String l){
        boolean procuraValor = false;
        int valor = 0;
        for(int i = 0; i < l.length(); i++){
            if(procuraValor == true){
                valor = Integer.parseInt(this.text[i]);
            }
            if(this.text[i] == "+" || this.text[i] == "-" || this.text[i] == "*" || this.text[i] == "/" || this.text[i] == "%"){
                procuraValor = true;
            }
            if(this.text[i] == ";"){
                break;
            }

        }
        return valor;

    }

}
