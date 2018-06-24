package org.web.eboutique.entities;

import java.io.Serializable;
import java.util.Collection;

public class Client implements Serializable {
    private Long idClient;
    private String nomVlient;
    private String adresse;
    private String email;
    private String tel;
    private Collection<Commande> commandes;

    public Client() {
        super();
    }

    public Client(String nomVlient, String adresse, String email, String tel) {
        this.nomVlient = nomVlient;
        this.adresse = adresse;
        this.email = email;
        this.tel = tel;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getNomVlient() {
        return nomVlient;
    }

    public void setNomVlient(String nomVlient) {
        this.nomVlient = nomVlient;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Collection<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(Collection<Commande> commandes) {
        this.commandes = commandes;
    }
}
