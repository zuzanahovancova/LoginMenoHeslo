package sk.tmconsulting.model;

import java.util.Base64;

public class Pouzivatel {
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        // logika, ktora desifruje heslo
        Base64.Decoder dec = Base64.getDecoder(); // na desifrovanie pouzijeme sifru Base64
        String decodedPassword = new String(dec.decode(this.password));  // a jej metodu decode
        return decodedPassword; // desifrovane heslo vratime
    }

    public void setPassword(String password) {
        // logika, ktora zasifruje heslo
        Base64.Encoder enc = Base64.getEncoder(); // na zasifrovanie pouzijeme sifru Base64
        String encodedPassword = enc.encodeToString(password.getBytes()); // a jej metodu encodeToString
        this.password = encodedPassword; // zasifrovane heslo ulozime do premennej password tejto triedy (teda triedy Prihlasenie)
    }


}
