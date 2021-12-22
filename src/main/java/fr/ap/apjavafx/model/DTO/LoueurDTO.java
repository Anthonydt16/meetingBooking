package fr.ap.apjavafx.model.DTO;

public class LoueurDTO {
    private int idEnt;
    private String login;
    private String nom;
    private String adresse;
    private String ville;
    private String pays;
    private String mail;
    private String tel;
    private Boolean contacter;
    private String typeInscription;
    private String prenomContact;
    private String nomContact;
    private String mailContact;
    private String telContact;



    public LoueurDTO(int idEnt, String login, String nom, String adresse, String ville, String pays, String email,
                     String tel, Boolean contacter, String typeInscription, String prenomContact, String nomContact, String mailContact, String telContact) {
        this.idEnt = idEnt;
        this.login = login;
        this.nom = nom;
        this.adresse = adresse;
        this.ville = ville;
        this.pays = pays;
        this.mail = email;
        this.tel = tel;
        this.contacter = contacter;
        this.typeInscription = typeInscription;
        this.prenomContact = prenomContact;
        this.nomContact = nomContact;
        this.mailContact = mailContact;
        this.telContact = telContact;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getIdEnt() {
        return idEnt;
    }

    public void setIdEnt(int idEnt) {
        this.idEnt = idEnt;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Boolean getContacter() {
        return contacter;
    }

    public void setContacter(Boolean contacter) {
        this.contacter = contacter;
    }

    public String getTypeInscription() {
        return typeInscription;
    }

    public void setTypeInscription(String typeInscription) {
        this.typeInscription = typeInscription;
    }

    public String getPrenomContact() {
        return prenomContact;
    }

    public void setPrenomContact(String prenomContact) {
        this.prenomContact = prenomContact;
    }

    public String getNomContact() {
        return nomContact;
    }

    public void setNomContact(String nomContact) {
        this.nomContact = nomContact;
    }

    public String getMailContact() {
        return mailContact;
    }

    public void setMailContact(String mailContact) {
        this.mailContact = mailContact;
    }

    public String getTelContact() {
        return telContact;
    }

    public void setTelContact(String telContact) {
        this.telContact = telContact;
    }
}
