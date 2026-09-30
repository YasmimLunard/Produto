/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package produto;

/**
 *
 * @author YasmimMoreira
 */
public class Produto {
    
    String nome;
    double preco;
    int quantidade;
    
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public double valorTotal(){
        return preco * quantidade;
    }
    public void alterarPreco(double novoPreco){
        this.preco = novoPreco;
    }
    public void mostrarDados(){
        System.out.println(nome);
         System.out.println(preco);
          System.out.println(quantidade);
    }
    
    
}
