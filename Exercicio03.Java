// Exercicio 3
package listaone;


public class Funcionario {
    // Exercicio 3

    
     public static void main(String[] args) {
    }

    // atributos
    private int cracha;
    private String nome;
    private char Tipovinculo;
    private float valorHora;
    private float QtadeHora;
    private float Salario;
    private float ValorDesconto;
    
    // set e get cracha
    
    public int getCracha() {
        return cracha;
    }
    
    public void setCracha(int cracha) {
        this.cracha = cracha;
    }
    
    // get e set nome
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    // get e set tipovinculo
    public char getTipovinculo() {
        return Tipovinculo;
    }
    
    public void setTipovinculo(char tipovinculo) {
        this.Tipovinculo = tipovinculo;
    }
    
    //get e set valorhora
    public float getvalorhora(float valorhora) {
        return valorhora;
    }
    
    public float setvalorhora(float valorhora) {
       return valorhora;
    }
    
    //get e set Qtadedehhora
    public float getQtadeHora() {
        return QtadeHora;
    }
    
    public void setQtadeHora(float qtadeHora) {
        this.QtadeHora = qtadeHora;
    }
    
    
    //get e set salario
    public float getSalario() {
        return Salario;
    }
    
    public void setSalario(float salario) {
        this.Salario = salario;
    }
    
    
    //get e set Valordesconto
    public float getValorDesconto() {
           return ValorDesconto;
    }
    
    public float setValorDesconto() {
        return ValorDesconto;
    }
    
    
    //metodo
    public float calcularValorSalario(){

        if (Tipovinculo="H") {
            return valorHora * QtadeHora-ValorDesconto;        
        else
            return Salario-ValorDesconto;
     
            
         }
    
    
            
             // METODO - IMPRIMIR
               public String criarPessoa(Funcionario f) {
               String retorno = "";
               retorno += "Criando uma pessoa\n";
               retorno += f.imprimir();
               return retorno;
    
                         return valorHora * QtadeHora-ValorDesconto;
                         else
                         return Salario;+   
                        "\nDesconto :" + ValorDesconto+
                        "\nValor a receber :" + calcularValorSalario;
                
      }
    
        public String CriarPessoa(Funcionario f){
     
        String retorno = "";
        retorno += "Crie uma pessoa";
        retorno += f.funcionario();
        return retorno;
    }
        public String Folhadepagamento(){
        
        return "Folha de pagamento "+ Salario;
    }
        public String Alteraremuneracao(){
        
        return "Altear folha de pagamento" + Salario +valorHora;
    }
        
        
        public String Sair(){
     
        return "Funcionario criado" + nome;
    }
}

    


    
