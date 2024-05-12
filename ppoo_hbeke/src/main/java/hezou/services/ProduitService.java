/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hezou.services;

import hezou.entities.Produit;
import java.util.List;

/**
 *
 * @author BEKE hezou
 */
public interface ProduitService {
     
    void addProduit(Produit produit);
    
    
    void updateProduit(Produit produit);
    
   
    void deleteProduit(int idProduit);
    
    
    Produit getProduitById(int idProduit);
    
    
    List<Produit> getAllProduits();
}
