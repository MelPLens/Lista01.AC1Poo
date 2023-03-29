import java.util.Scanner;

public class Funcionario {
    private int cracha;
    private String nome;
    private char tipovinculo;
    private float valorhora;
    private float qtadeHora;
    private float salario;
    private float valorDesconto;
    
    public int getCracha() {
        return cracha;
    }
    
    public void setCracha(int cracha) {
        this.cracha = cracha;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public char getTipovinculo() {
        return tipovinculo;
    }
    
    public void setTipovinculo(char tipovinculo) {
        this.tipovinculo = tipovinculo;
    }
    
    public float getValorhora() {
        return valorhora;
    }
    
    public void setValorhora(float valorhora) {
        this.valorhora = valorhora;
    }
    
    public float getQtadeHora() {
        return qtadeHora;
    }
    
    public void setQtadeHora(float qtadeHora) {
        this.qtadeHora = qtadeHora;
    }
    
    public float getSalario() {
        return salario;
    }
    
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public float getValorDesconto() {
        return valorDesconto;
    }
    
    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    
    public void calcularValorSalario(float valorHora, float qtadeHora) {
        float salario = // continuar a codar
