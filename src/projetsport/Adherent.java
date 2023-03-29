/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsport;

/**
 *
 * @author TGARDAIS
 */
public abstract class  Adherent {
    
    private String nom;
    private String prenom;
    private String adresse;
    
    public Adherent(String unNom, String unPrenom, String uneAdresse){
        nom=unNom;
        prenom=unPrenom;
        adresse=uneAdresse;
    }
    public void afficher(){
        System.out.println("Nom : "+nom+", Prenom : "+prenom+", Adresse : "+adresse+".");
    }
    public void modifNom(String unNom){
        nom=unNom;
    }
    /*
    public String getNom(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    */
    public abstract double salaire(); 
 // méthode abstraite de la classe Adherent

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
}
