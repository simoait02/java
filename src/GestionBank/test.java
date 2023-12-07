package GestionBank;

public class test {
    public static void main(String[] args){
        CompteBancaire X=new CompteBancaire(20.0,"AITHSSAINE","simo");
        Client Y= new Client("ait hssaine","mohamed","rabat","0664398415","02-05-2004");
        Client Z= new Client("sbaiti","mohammed","rabat","0606929996","01-08-2003");
        CompteBancaire a=new CompteBancaire(200,"AIT HSSAINE","MOHAMED");
        CompteBancaire b=new CompteBancaire(545,"AT HSSAINE","MOAMED");
        GestionComptes v=new GestionComptes();
        GestionComptes.registerClient(Y,4000);
        GestionComptes.registerClient(Z,500000);
        System.out.println(GestionComptes.seedata(Y).getSolde());
        System.out.println(GestionComptes.seedata(Z).getSolde());
    }
}