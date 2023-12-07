package GestionBank;
import java.time.Year;
public class Client {
    private final String id;
    String nom;
    String prenom;
    private String adresse;
    private String numTelephone;
    private String dateNaissance;
    private static int compteur=0;
    public Client(String nom, String prenom, String adresse, String numTelephone, String dateNaissance){
        this.id=set_id();
        this.nom=nom;
        this.prenom=prenom;
        this.adresse=adresse;
        this.numTelephone=numTelephone;
        this.dateNaissance=dateNaissance;
    }
    static String set_id(){
        compteur+=1;
        int year = Year.now().getValue();
        String year1= String.valueOf(year);
        if ((1 <= compteur) && (compteur < 10)) {
            year1+="000"+compteur;
        }
        if ((10 <= compteur) && (compteur < 100)) {
            year1+="00"+compteur;
        }
        if ((100 <= compteur) && (compteur < 1000)) {
            year1+="0"+compteur;
        }
        if ((1000 <= compteur) && (compteur < 10000)) {
            year1+=compteur;
        }
        return year1;
    }
    public String getNom() {return this.nom;}
    public String getId() {return this.id;}
    public String getPrenom() {return this.prenom;}
    public String getAdresse() {return this.adresse;}
    public String getNumTelephone() {return this.numTelephone;}
    public void setNom(String nom) {this.nom = nom;}
    public void setPrenom(String prenom) {this.prenom = prenom;}
    public void setAdresse(String adresse) {this.adresse = adresse;}
    public void setNumTelephone(String numTelephone) {this.numTelephone = numTelephone;}
    public String getDateNaissance() {return dateNaissance;}
    public void setDateNaissance(String dateNaissance) {this.dateNaissance = dateNaissance;}
}