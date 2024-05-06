package fr.diginamic.salaire;

public class Salarie extends Intervenant {

    double salaireMensuel;
    
    public Salarie(String nom, String prenom, double salaireMensuel) {
        super(nom, prenom);    
        this.salaireMensuel =  salaireMensuel; 
    }

    @Override
    public double getSalaire() {
        return salaireMensuel ;
    }
    
    @Override
    public String getStatus() {
        return "salarié";
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
    @Override
    public String afficherDonnees() {
        return toString() +  " a un salaire  de " + getSalaire() + " euros." + " Il est : " + getStatus();
    }
  
}
