/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hezou.services.implementations;

import hezou.entities.Produit;
import hezou.services.ProduitService;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BEKE hezou
 */
public class ProduitServiceImpl implements ProduitService {

    private static final String URL = "jdbc:mysql://localhost:3306/bd_tppoo_hbeke";
    private static final String UTILISATEUR = "root";
    private static final String MOT_DE_PASSE = "";

 @Override
public void addProduit(Produit produit) {
    try (Connection connection = DriverManager.getConnection(URL, UTILISATEUR, MOT_DE_PASSE)) {
        String sql = "INSERT INTO produits (libelle, actif) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, produit.getLibelle());
            statement.setBoolean(2, produit.isActif());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Le produit a été ajouté avec succès.");
            }
        }
    } catch (SQLException e) {
        System.out.println("Erreur lors de l'ajout du produit : " + e.getMessage());
    }
}

    @Override
public List<Produit> getAllProduits() {
    List<Produit> produits = new ArrayList<>();
    try (Connection connection = DriverManager.getConnection(URL, UTILISATEUR, MOT_DE_PASSE)) {
        String sql = "SELECT * FROM produits";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Produit produit = new Produit();
                    produit.setLibelle(resultSet.getString("libelle"));
                    produit.setActif(resultSet.getBoolean("actif"));
                    produits.add(produit);
                }
            }
        }
    } catch (SQLException e) {
        System.out.println("Erreur lors de la récupération des produits : " + e.getMessage());
    }
    return produits;
}
@Override
public Produit getProduitByName(String nomProduit) {
    Produit produit = null;
    try (Connection connection = DriverManager.getConnection(URL, UTILISATEUR, MOT_DE_PASSE)) {
        String sql = "SELECT * FROM produits WHERE libelle = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, nomProduit);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    produit = new Produit();
                    produit.setLibelle(resultSet.getString("libelle"));
                    produit.setActif(resultSet.getBoolean("actif"));
                }
            }
        }
    } catch (SQLException e) {
        System.out.println("Erreur lors de la récupération du produit : " + e.getMessage());
    }
    return produit;
}


}
