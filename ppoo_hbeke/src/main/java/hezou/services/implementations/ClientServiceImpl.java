/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hezou.services.implementations;

import hezou.entities.Client;
import hezou.services.ClientService;
import static hezou.utils.Connexion.getConnexion;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BEKE hezou
 */
public class ClientServiceImpl implements ClientService {
   
    private static final String URL = "jdbc:mysql://localhost:3306/bd_tppoo_hbeke";
    private static final String UTILISATEUR = "root";
    private static final String MOT_DE_PASSE = "";
    
   @Override
public void addClient(Client client) {
    try (Connection connection = getConnexion()) {
        String sql = "INSERT INTO clients (nom, prenom, telephone) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
           
            statement.setString(1, client.getNom());
            statement.setString(2, client.getPrenom());
            statement.setString(3, client.getTelephone());
            
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Le client a été ajouté avec succès.");
            }
        }
    } catch (SQLException e) {
        System.out.println("Erreur lors de l'ajout du client : " + e.getMessage());
    }
}


   @Override
public List<Client> getAllClients() {
    List<Client> clients = new ArrayList<>();
    try (Connection connection = getConnexion()) {
        String sql = "SELECT * FROM clients";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                Client client = new Client();
                client.setIdClient(resultSet.getInt("id"));
                client.setNom(resultSet.getString("nom"));
                client.setPrenom(resultSet.getString("prenom"));
                client.setTelephone(resultSet.getString("telephone"));
                clients.add(client);
            }
        }
    } catch (SQLException e) {
        System.out.println("Erreur lors de la récupération des clients : " + e.getMessage());
    }
    return clients;
}


    @Override
public void updateClient(Client client) {
    try (Connection connection = getConnexion()) {
        String sql = "UPDATE clients SET nom = ?, prenom = ?, telephone = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            // Définir les valeurs des paramètres de la requête
            statement.setString(1, client.getNom());
            statement.setString(2, client.getPrenom());
            statement.setString(3, client.getTelephone());
            statement.setInt(4, client.getIdClient());
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Les informations du client ont été mises à jour avec succès.");
            }
        }
    } catch (SQLException e) {
        System.out.println("Erreur lors de la mise à jour du client : " + e.getMessage());
    }
}


   @Override
public void deleteClient(int idClient) {
    try (Connection connection = getConnexion()) {
        String sql = "DELETE FROM clients WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, idClient);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Le client a été supprimé avec succès.");
            }
        }
    } catch (SQLException e) {
        System.out.println("Erreur lors de la suppression du client : " + e.getMessage());
    }
}

    @Override
    public Client getClientById(int idClient) {
        Client client = null;
        try (Connection connection = DriverManager.getConnection(URL, UTILISATEUR, MOT_DE_PASSE)) {
            String sql = "SELECT * FROM clients WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, idClient);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        client = new Client();
                        client.setNom(resultSet.getString("nom"));
                        client.setPrenom(resultSet.getString("prenom"));
                        client.setTelephone(resultSet.getString("telephone"));
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de la récupération du client : " + e.getMessage());
        }
        return client;
    }

}
