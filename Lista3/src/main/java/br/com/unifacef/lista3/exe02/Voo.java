package br.com.unifacef.lista3.exe02;
public class Voo {
    private int numero;
    private String origem, destino;
    
    public Voo() {
    }

    public Voo(int numero, String origem, String destino) {
        this.numero = numero;
        this.origem = origem;
        this.destino = destino;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    
    public String mostra() {
        return "Voo{" + " numero= " + numero + ", origem= " + origem + ", destino= " + destino + '}';
    }

    
    
}
