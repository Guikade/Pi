/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classespi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Guikade
 */
public class CadProd {
    public static void main(String[] args) {
       List<InfoProduto> lista = new ArrayList<>();
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("Escreva o nome do produto");
        String nome=scanner.next();
        System.out.println("Escreva o valor do produto: R$");
        Double valor= scanner.nextDouble();
        lista.add(new InfoProduto());
        
        for(InfoProduto obj: lista){
        System.out.println("nome: "+obj.getNome()+" valor: R$"+obj.getValor());
        
    }   
   }
}