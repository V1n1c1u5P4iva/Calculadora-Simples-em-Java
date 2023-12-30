package calculadora_simples;


public record Calculadora(double numero1,double numero2) {
    
    public double soma(){  
        return numero1+numero2;
    }

    public double subtracao(){
        return numero1-numero2;
    }

    public double multipliacacao(){
        return numero1*numero2;
    }

    public double divisao(){
        return numero1/numero2;
    }

}
