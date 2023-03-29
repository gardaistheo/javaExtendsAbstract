/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author TGARDAIS
 */
public class ProjetSport {

    /**
     * @param args the command line arguments
     */
    public static double moySal(ArrayList <Adherent> ensAdhs){
        double totSal=0;
        for (Adherent unAdhe : ensAdhs)
        {
            totSal += unAdhe.salaire();
        }
        return totSal/ensAdhs.size();
    }
    public static ArrayList <Adherent>genererAdherentsSupMoyenne(ArrayList <Adherent> ensAdhs){
        ArrayList <Adherent> collAdhersSupMoyenne = new ArrayList();
        for(Adherent unAdher : ensAdhs){
            if(unAdher.salaire()>moySal(ensAdhs)){
                collAdhersSupMoyenne.add(unAdher);
            }
        }
        return collAdhersSupMoyenne;
    }
    public static HashMap <String, Integer>infosAdresseAdherent(ArrayList <Adherent> ensAdhs){
        HashMap<String, Integer> dicVilleAde = new HashMap();
        for(Adherent unAde : ensAdhs){
            if(dicVilleAde.containsKey(unAde.getAdresse())){
                dicVilleAde.replace(unAde.getAdresse(), dicVilleAde.get(unAde.getAdresse())+1);
            }
            else
                dicVilleAde.put(unAde.getAdresse(), 1);
        }
        return dicVilleAde;
    }
    public static void main(String[] args) {
        /*
        // TODO code application logic here
        Sportif unSportif = new Sportif("Hervet","Antoine","10 Rue des Poules",1300,6);
        unSportif.afficher();
        
        Entraineur unEntraineur = new Entraineur("Séverin", "Xavier", "6 rue de la defaite", 8000, 3, 'A');
        unEntraineur.afficher();
        
        Administratif unAdmin = new Administratif("Desprat", "Fabien", "9 Bd DeLalouche", 11.4, 35.5, 2);
        unAdmin.afficher();
        
        SportifCombat unSportifCombat = new SportifCombat("Doumbe", "Cedric", "15 Imp de L'Union", 9000, 84, 77, 6);
        unSportifCombat.afficher();
        
        ArrayList <Adherent> collAdhers = new ArrayList();
*/
        
        
        ArrayList <Adherent> collAdhers = new ArrayList(); 
// collAdhers est une collection d'adhérents
collAdhers.add(new Sportif("ZETOFRAIS", "Mélanie", "Cugnaux", 
 10, 600));
collAdhers.add(new Entraineur("TRONC", "Paul", "Muret", 
 65, 8000, 'B'));
collAdhers.add(new Administratif("HIBULAIRE", "Pat", "Cugnaux", 
 160, '2', 10));
collAdhers.add(new SportifCombat("AYMAR", "Jean", "Blagnac", 
 5, 1000, 9, 2));
// affichage des données des adhérents du club
for (Adherent unAdherent : collAdhers)
 {
 // unAdherent est un objet Adherent
 unAdherent.afficher();
 System.out.println();
 }

// affichage du salaire des adhérents du club
for (Adherent unAdherent : collAdhers)
 {
 // unAdherent est un objet Adherent
 System.out.println(unAdherent.salaire());
 }

System.out.println("La moyenne des salaires des adhérents est de :"+moySal(collAdhers));

ArrayList <Adherent> collAdherentsSupMoyenne = new ArrayList();
collAdherentsSupMoyenne=genererAdherentsSupMoyenne(collAdhers);
for(Adherent unAde : collAdherentsSupMoyenne){
    System.out.println("Nom : "+unAde.getNom()+" , Prénom : "+unAde.getPrenom()+" , Salaire : "+unAde.salaire());
}

HashMap<String, Integer> dicVilleAde = new HashMap();
dicVilleAde = infosAdresseAdherent(collAdhers);
Set<String> setVilleAde = dicVilleAde.keySet();
for(String uneCle : setVilleAde){
    System.out.println("Ville : "+uneCle);
    System.out.println("Nombre adherents :"+dicVilleAde.get(uneCle));
}
        
        
    }
    
}
