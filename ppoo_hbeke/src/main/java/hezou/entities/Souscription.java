/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hezou.entities;

import java.util.Date;

/**
 *
 * @author BEKE hezou
 */
public class Souscription {
    private int id;
    private Date dateHeureSous;
    private String actif;
    private int idClient;
    private int idProduit;

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateHeureSous() {
        return dateHeureSous;
    }

    public void setDateHeureSous(Date dateHeureSous) {
        this.dateHeureSous = dateHeureSous;
    }

    public String getActif() {
        return actif;
    }

    public void setActif(String actif) {
        if (actif != null && (actif.equals("Y") || actif.equals("N"))) {
            this.actif = actif;
        } else {
            throw new IllegalArgumentException("La valeur de actif doit être 'Y' ou 'N'.");
        }
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }
    
}
