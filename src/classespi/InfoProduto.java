/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classespi;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gui
 */
public class InfoProduto {
         List<InfoProduto> produtoList = new ArrayList<>();
             
    private String nome;
    private double valor;
    
    public InfoProduto (){
        this.nome= nome;
        this.valor=valor;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
