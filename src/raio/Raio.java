/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raio;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Raio {
    
    public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    double circulo, area, diametro, raio;
    System.out.println("Informe o valor do raio: ");
    raio = ler.nextDouble();
    circulo = 2*Math.PI*raio;
    area = Math.PI * Math.pow(raio, 2);
    diametro = 2*raio;
    
    System.out.println("Raio informado: "+raio+"\n"+ "Circunferencia: "+circulo+"\n"+ "Área: "+area+"\n"+ "Diâmetro: "+diametro);
    }
}
