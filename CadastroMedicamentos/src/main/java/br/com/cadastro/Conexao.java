/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.cadastro;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection conectar() {

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/farmacia",
                    "usuário",
                    "senha"
            );

            return con;

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());
            return null;

        }
    }
}
