/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produto;


public class TesteProduto {
    public static void main (String[]args){
        Produto produto1 = new Produto("Batata", 1.9, 10);
        
        produto1.mostrarDados();
        double total = produto1.valorTotal();
        System.out.println(total);
        produto1.alterarPreco(2.3);
        produto1.mostrarDados();
        double novoTotal = produto1.valorTotal();
        System.out.println(novoTotal);
    }
}        
