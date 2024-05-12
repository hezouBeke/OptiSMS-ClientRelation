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

    List<Produit> getAllProduits();

    public Produit getProduitByName(String epargne);
}
