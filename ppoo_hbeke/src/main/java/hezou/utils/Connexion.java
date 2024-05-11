/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hezou.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author BEKE hezou
 */
public class Connexion {
    
    private static final String URL = "jdbc:mysql://localhost:3306/bd_tppoo_hbeke";
    private static final String UTILISATEUR = "root";
    private static final String MOT_DE_PASSE = "";

   
    public static Connection obtenirConnexion() {
        Connection connexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connexion = DriverManager.getConnection(URL, UTILISATEUR, MOT_DE_PASSE);
            System.out.println("Connexion réussie !");
        } catch (ClassNotFoundException e) {
            System.out.println("Erreur de chargement du pilote JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Erreur de connexion à la base de données: " + e.getMessage());
        }
        return connexion;
    }
}
