
package listaone;


public class Pessoa {
    public static void main (String []args){
 
    
    //exercicio 01
    private String CPF;
    private String Nome;
    private char Sexo;
    private int Idade;

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getCPF() {
        return CPF;
    }

    public char getSexo() {
        return Sexo;
    }

    public int getIdade() {
        return Idade;
    }
    
    public int getNome() {
        return Idade;
    }

    
 public String CriarPessoa(Pessoa p){
        //System.out.println("Qual é o seu nome?");
        //System.out.println("Meu nome é "+p.nome);
        //p.ResponderONome();
        String retorno = "";
        retorno += "Crie uma pessoa";
        retorno += p.MostreAPessoa();
        return retorno;
    }
    public String MostreAPessoa(){
        //System.out.println("Meu nome é "+nome);
        return "A pessoa é "+ Nome;
    }

 
}
 



