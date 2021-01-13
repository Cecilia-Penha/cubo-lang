package fonte;
// Adiciona funções do interpretador

public class Pensa {
    public int i = 0;
    Print imprime = new Print();

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

    public void start(){
        String l = this.text[i];
        for(int i = 0; i < text.length; i++){
            if(text[i] == "break")
                break;
            if (text[i] == "conta"){
                this.startMath(l);
            }
            if(text[i] == "mostra"){
                this.startImprime(l);
            }
            if(text[i] == "primo"){
                this.startPrimo(this.encontraNumPrimo(l));
            }
            if(text[i] == "media"){
                this.startMedia(l,this.encontraMedia1(l),this.encontraMedia2(l));
            }
            if(text[i] == "testaN"){
                this.startCondN(l);
            }
            if(text[i] == "testaS"){
                this.startCondS(l);
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
        double valor = 0;
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
        double valor = 0;
        for(int i = 0; i < l.length(); i++){
            if(this.text[i] == ";"){
                break;
            }
            if(procuraValor == true){
                valor = Integer.parseInt(this.text[i]);
            }
            if(this.text[i] == "+" || this.text[i] == "-" || this.text[i] == "*" || this.text[i] == "/" || this.text[i] == "%"){
                procuraValor = true;
            }
        }
        return valor;
    }
    public double encontraNumPrimo(String l){
        boolean procuraValor = false;
        double valor = 0;
        for(int i = 0; i < l.length(); i++){
            if(this.text[i] == ";"){
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
    public double encontraMedia1(String l){
        boolean procuraValor = false;
        double valor = 0;
        for(int i = 0; i < l.length(); i++){
            if(this.text[i] == ","){
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
    public double encontraMedia2(String l){
        boolean procuraValor = false;
        double valor = 0;
        for(int i = 0; i < l.length(); i++){
            if(this.text[i] == ";"){
                break;
            }
            if(procuraValor == true){
                valor = Integer.parseInt(this.text[i]);
            }
            if(this.text[i] == ","){
                procuraValor = true;
            }
        }
        return valor;
    }
    public void startImprime(String l){
        boolean procura = false;
        for(int i = 0; i < l.length(); i++){
            if(this.text[i] == ";"){
                break;
            }
            if(procura = true){
                imprime.printS(this.text[i]);
            }
            if(this.text[i] == ":"){
                procura = true;
            }
        }
    }
    public void startCondN(String l){
        boolean procura = false;
        for(int i = 0; i < l.length(); i++){
            if(this.text[i] == ";"){
                break;
            }
            if(procura = true){
                testa.igualD(Integer.parseInt(text[i]),Integer.parseInt(text[i+1]));
            }
            if(text[i] == "$"){
                procura = true;
            }
        }
    }
    public void startCondS(String l){
        boolean procura = false;
        for(int i = 0; i < l.length(); i++){
            if(this.text[i] == ";"){
                break;
            }
            if(procura = true){
                testa.igualS(text[i],text[i+1]);
            }
            if(text[i] == "&"){
                procura = true;
            }
        }
    }
    public void startPrimo(double valor){
        int n = 0;
        for(int i = 0; i < valor; i++){
            if(valor%i == 0){
                n++;
            }
            if(n>2){
                System.out.println("não é primo");
            }
            else{
                System.out.println("é primo");
            }
        }

    }
    public void startMedia(String l, double valor1, double valor2){
        double media = (valor1 + valor2)/2;
        System.out.println(media);
    }
}
