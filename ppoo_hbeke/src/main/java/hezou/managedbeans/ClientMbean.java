/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hezou.managedbeans;
import hezou.entities.Client;
import hezou.services.ClientService;


/**
 *
 * @author BEKE hezou
 */
public class ClientMbean {
    
    private ClientService clientService; 

    public ClientService getClientService() {
        return clientService;
    }

  
    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }


    public void addClient(String nom, String prenom , String telephone) {
        Client client = new Client();
        client.setNom(nom);
        client.setPrenom(prenom);
        client.setTelephone(telephone);
        clientService.addClient(client);
    }
    
}
