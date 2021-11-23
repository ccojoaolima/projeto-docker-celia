/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.joao.henrique.docker;

import com.github.javafaker.Faker;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Timer;
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
         Timer timer;
        Faker faker1 = new Faker();
        
          
     
        for (int i = 0; i < 10; i++) {
             nomeDeInvocador = faker1.name().username();
        nomeDoCampeaoPrincipal = faker1.leagueOfLegends().champion();
        winrate = ThreadLocalRandom.current().nextInt(40, 101);
        
        System.out.println(nomeDeInvocador);
        System.out.println(nomeDoCampeaoPrincipal);
        System.out.println(winrate);
        
         // Configuração dos parâmetros de conexão
         
        String url = "jdbc:mysql://localhost:3306/informacoesDosJogadores?allowPublicKeyRetrieval=true&useSSL=false";
        String user = "root";
        String passwd = "urubu100";
    
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            // Abre-se a conexão com o Banco de Dados
            Connection con = DriverManager.getConnection(url, user, passwd);

            // Cria-se Statement com base na conexão con
            Statement stmt = con.createStatement();

            String sql = "INSERT INTO estatisticas (nomeInvocador, campeaoPrincipal, winrate)VALUES "
                    + "('"+nomeDeInvocador+"','"+nomeDoCampeaoPrincipal+"',"+winrate+");";

            stmt.executeUpdate(sql);

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
            
        }
            
       
    
        
    }
    

