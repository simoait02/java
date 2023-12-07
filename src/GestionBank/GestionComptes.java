package GestionBank;
import java.util.HashMap;
public class GestionComptes {
    private static final HashMap<Client,CompteBancaire> register =new HashMap<>();
    public static void registerClient(Client p,double solde){
        CompteBancaire c=new CompteBancaire(solde,p.getNom(),p.getPrenom());
        register.put(p,c);
    }
    public static void registerClient(Client p){
        CompteBancaire c=new CompteBancaire(p.getNom(),p.getPrenom());
        register.put(p,c);
    }
    public static CompteBancaire seedata(Client p){
        return register.get(p);
    }
}