package sk.tmconsulting;

// Aplikacia bude sluzit na registraciu uzivatelov,cize bude vyzadovat zaddanie login-u a hesla

import sk.tmconsulting.model.Pouzivatel;

public class AplikaciaNaPrihlasovanie {
    public static void main(String[] args) {
        String login = "admin";
        String heslo = "Ahoj"; // sifrujeme obsah premennej heslo
        Pouzivatel pouzivatel = new Pouzivatel();
        pouzivatel.setLogin(login);
        pouzivatel.setPassword(heslo); //heslo zasifrujeme prostrednictvom setPassword

        System.out.println(pouzivatel.getPassword());
        //System.out.println(pouzivatel.password); //nepojde,lebo v triede Pouzivatel je private String heslo..keby bolo public String heslo,tak by bolo heslo spristupnene hocikomu

    }
}
