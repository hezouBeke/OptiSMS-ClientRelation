/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hezou.services.implementations;

/**
 *
 * @author BEKE hezou
 */
import hezou.entities.Client;
import hezou.entities.ClientParticulier;
import hezou.entities.Produit;
import hezou.entities.Souscription;
import hezou.services.SouscriptionService;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class SouscriptionServiceImpl implements SouscriptionService {

    private static final String URL = "jdbc:mysql://localhost:3306/bd_tppoo_hbeke";
    private static final String UTILISATEUR = "root";
    private static final String MOT_DE_PASSE = "";

 
    public void enregistrerSMS(String contenu, int idClient, Date dateEnvoi) {
        try (Connection connection = DriverManager.getConnection(URL, UTILISATEUR, MOT_DE_PASSE)) {
            String sql = "INSERT INTO sms_souscription (contenu, id_client, date_envoi) VALUES (?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, contenu);
                statement.setInt(2, idClient);
                statement.setDate(3, new java.sql.Date(dateEnvoi.getTime()));

                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("SMS de souscription enregistré avec succès.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de l'enregistrement du SMS de souscription : " + e.getMessage());
        }
    }
    
    public void souscrireProduitClientParticulier(ClientParticulier clientParticulier, Produit produit) {
        if (clientParticulier.getDateNaissance() != null && !clientParticulier.getDateNaissance().after(new Date())) {

            if (clientParticulier.getAge() < 18 && produit.getLibelle().equals("Epargne")) {
               
                try (Connection connection = DriverManager.getConnection(URL, UTILISATEUR, MOT_DE_PASSE)) {
                   
                } catch (SQLException e) {
                    System.out.println("Erreur lors de la souscription du client particulier : " + e.getMessage());
                }
            } else {
                System.out.println("Le client ne peut souscrire qu'au produit Epargne s'il a moins de 18 ans.");
            }
        } else {
            System.out.println("La date de naissance du client n'est pas valide.");
        }
    }
    @Override
    public void addSouscription(Souscription souscription) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateSouscription(Souscription souscription) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteSouscription(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Souscription getSouscriptionById(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Souscription> getSouscriptionsByClientId(int iclient) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Souscription> getAllSouscriptions() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void souscrireProduit(Client client1, Produit epargne) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

