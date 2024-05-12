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
public class Sms {
    private int id;
    private String contenu;
    private boolean statut;
    private int idClient;
    private Date dateEnvoi;

     // Constructeur
    public Sms(int id, String contenu, boolean statut, int idClient, Date dateEnvoi) {
        this.id = id;
        this.contenu = contenu;
        this.statut = statut;
        this.idClient = idClient;
        this.dateEnvoi = dateEnvoi;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        if (contenu != null && contenu.length() <= 255) {
            this.contenu = contenu;
        } else {
            throw new IllegalArgumentException("Le contenu du SMS ne peut pas dépasser 255 caractères.");
        }
    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public Date getDateEnvoi() {
        return dateEnvoi;
    }

    public void setDateEnvoi(Date dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }
    
}
