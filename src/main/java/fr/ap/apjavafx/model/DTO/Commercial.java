package fr.ap.apjavafx.model.DTO;

public class Commercial {
    private String LOGIN;
    private String POURCENTAGECOMMERCIAL;
    private String PASSWORD ;
    private String NOM;
    private String PRENOM;
    private String ADRESSE;
    private String TELEPHONE;
    private String MAIL;

    public Commercial(String LOGIN, String POURCENTAGECOMMERCIAL, String PASSWORD, String NOM, String PRENOM, String ADRESSE, String TELEPHONE, String MAIL) {
        this.LOGIN = LOGIN;
        this.POURCENTAGECOMMERCIAL = POURCENTAGECOMMERCIAL;
        this.PASSWORD = PASSWORD;
        this.NOM = NOM;
        this.PRENOM = PRENOM;
        this.ADRESSE = ADRESSE;
        this.TELEPHONE = TELEPHONE;
        this.MAIL = MAIL;
    }

    public String getLOGIN() {
        return LOGIN;
    }

    public void setLOGIN(String LOGIN) {
        this.LOGIN = LOGIN;
    }

    public String getPOURCENTAGECOMMERCIAL() {
        return POURCENTAGECOMMERCIAL;
    }

    public void setPOURCENTAGECOMMERCIAL(String POURCENTAGECOMMERCIAL) {
        this.POURCENTAGECOMMERCIAL = POURCENTAGECOMMERCIAL;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getNOM() {
        return NOM;
    }

    public void setNOM(String NOM) {
        this.NOM = NOM;
    }

    public String getPRENOM() {
        return PRENOM;
    }

    public void setPRENOM(String PRENOM) {
        this.PRENOM = PRENOM;
    }

    public String getADRESSE() {
        return ADRESSE;
    }

    public void setADRESSE(String ADRESSE) {
        this.ADRESSE = ADRESSE;
    }

    public String getTELEPHONE() {
        return TELEPHONE;
    }

    public void setTELEPHONE(String TELEPHONE) {
        this.TELEPHONE = TELEPHONE;
    }

    public String getMAIL() {
        return MAIL;
    }

    public void setMAIL(String MAIL) {
        this.MAIL = MAIL;
    }
}
