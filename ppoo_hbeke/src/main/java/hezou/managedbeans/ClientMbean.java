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
  public void addFourClients() {
        // Ajoutez quatre clients avec des informations différentes
        addClient("Doe", "John", "123456789");
        addClient("Smith", "Alice", "987654321");
        addClient("Johnson", "Michael", "555555555");
        addClient("Brown", "Emma", "999999999");
    }

    private void addClient(String nom, String prenom, String telephone) {
        Client client = new Client();
        client.setNom(nom);
        client.setPrenom(prenom);
        client.setTelephone(telephone);
        clientService.addClient(client);
    }
}
