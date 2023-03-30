//EXERCICIO 2
package listaone;


    //classe
    public class Aluno {

    public static void main(String[] args) {
    }
    
    //atributos
    private String RA;
    private String nome;
    private float AC1;
    private float AC2;
    private float AG;
    private float AF;
    
    
     //RA - SET e GET
    
     public void setRA (String RA){ // +setRA(ra:String)
     this.RA = RA; // relacionar com Ra do private
     }
     
     public String getRA() { //+getRA():String
          return nome;
     }
     
     
     
     //NOME - SET e GET
     public void setNome(String nome) { // + setNome(nome:String)  void
        this.nome = nome;
     }
     public String getNome() { //getNome():String
        return nome;
     }

    
    
    
     //AC1 - SET e GET
    
     public void setAC1(float AC1) {
        this.AC1 = AC1;
     }

     public float getAC1() { 
         return AC1;
     }
 
    
    
    
     //AC2 - SET e GET
     public void setAC2(float AC2) {
        this.AC2 = AC2;
     }
     public float getAC2() {
        return AC2;
     }

   

    
     //AG - SET e GET
      public void setAG(float AG) {
        this.AG = AG;
     }
     public float getAG() {
        return AG;
     }

  
    
    
     //AF - SET e GET
     public void setAF(float AF) {
         this.AF = AF;
     }
     public float getAF() {
        return AF;
     }

    

     // METODO - CALCULAR MEDIA
     public float calcularMedia(){
        return  (AC1 * 0.15f) + (AC2 *0.30f) + (AG * 0.10f) + (AF * 0.45f); // numeros sao double(numero flutuante) mas para retornar um floar (float) ou 0.30f
     }
    
    
     // METODO - VERIFICAR
     public float verificarAprovacao(){
        if ( calcularMedia()>=5)
            return "Aprovado"; 
        else
            return "Reprovado";
     
      }
    
      // IMPRIMIR
                 public String imprimir(){
                 return "RA : " + RA +
                 "\nNome :" + nome+
                 "\nAC1 :" + AC1+
                 "\nAC2 :" + AC1+
                 "\nAG :" + AG+
                 "\nAF :" + AF+
                 "\nCalcularmedia :" + Calcularmedia+
                 "\nVerificaraprovacao :" + Verificaraprovacao+
                      
    
}
    }
