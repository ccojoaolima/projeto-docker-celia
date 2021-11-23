/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.joao.henrique.docker;

import com.github.javafaker.Faker;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author aluno
 */
public class App {
    public static void main(String[] args) {
        
        Integer winrate = 0;
        String nomeDeInvocador;
        String nomeDoCampeaoPrincipal;
        
        Faker faker1 = new Faker();
        nomeDeInvocador = faker1.name().username();
        nomeDoCampeaoPrincipal = faker1.leagueOfLegends().champion();
        winrate = ThreadLocalRandom.current().nextInt(40, 101);
        
        System.out.println(nomeDeInvocador);
        System.out.println(nomeDoCampeaoPrincipal);
        System.out.println(winrate);
        
        
        
    }
    
}
