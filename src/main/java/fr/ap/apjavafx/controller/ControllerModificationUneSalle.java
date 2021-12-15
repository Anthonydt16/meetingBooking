package fr.ap.apjavafx.controller;

import fr.ap.apjavafx.model.DAO.SalleDAO;
import fr.ap.apjavafx.model.DAO.VilleDAO;
import fr.ap.apjavafx.model.DTO.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static fr.ap.apjavafx.model.DAO.SalleDAO.*;
import static fr.ap.apjavafx.model.DAO.photoDAO.SelectPhotoIdSalle;

public class ControllerModificationUneSalle {
    public TableColumn<photoDTO,Integer> colIdPhoto;
    public TableColumn<photoDTO,String> collienPhoto;
    @FXML private ComboBox cbxAnneBenef;
    @FXML private TableView<photoDTO> tablePhoto;
    @FXML private Button btnValiderSaisiSalle;
    @FXML private TextField inputNomSalle;
    @FXML private TextField inputLongueur;
    @FXML private TextField inputLargeur;
    @FXML private TextField inputSurface;
    @FXML private TextField inputHauteur;
    @FXML private TextField inputCapacite;
    @FXML private TextField inputPrixDJ;
    @FXML private TableView<ChiffreDAffaireDTO> tableCA;
    @FXML private TableColumn<ChiffreDAffaireDTO,Integer> colChiffreAffaire;
    @FXML private TableColumn<ChiffreDAffaireDTO,Integer> colAnnee;

    private LieuDTO unLieu;
    private SalleDTO uneSalle;
    private String indiceBouton;
    ArrayList<SalleDTO> DesSalles= new ArrayList <SalleDTO>();

    public LieuDTO getUnLieu() {
        return unLieu;
    }

    public void setUnLieu(LieuDTO unLieu) {
        this.unLieu = unLieu;
    }

    public String getIndiceBouton() {
        return indiceBouton;
    }

    public void setIndiceBouton(String indiceBouton) {
        this.indiceBouton = indiceBouton;
    }



    public SalleDTO getSalle() {
        return uneSalle;
    }

    public void setSalle(SalleDTO uneSalle) {
        this.uneSalle = uneSalle;
    }


    @FXML
    private void comboAction(ActionEvent event) {

        System.out.println(cbxAnneBenef.getValue());
        affichageCA((Integer) cbxAnneBenef.getValue());



    }

    public void setup() {
        if(this.indiceBouton != "Add"){
            inputCapacite.setText(String.valueOf(uneSalle.getCapacite()));
            inputHauteur.setText(String.valueOf(uneSalle.getHauteur()));
            inputLargeur.setText(String.valueOf(uneSalle.getLargeur()));
            inputSurface.setText(String.valueOf(uneSalle.getSurface()));
            inputNomSalle.setText(uneSalle.getNomSalle());
            inputLongueur.setText(String.valueOf(uneSalle.getLongueur()));
            inputPrixDJ.setText(String.valueOf(uneSalle.getPrixDemiJournee()));

            //affichage desPhoto
            ArrayList<photoDTO> desPhotos= new ArrayList <photoDTO>();
            desPhotos = SelectPhotoIdSalle(this.uneSalle.getIdSalle());

            ObservableList<photoDTO> data = FXCollections.observableList(desPhotos) ;

            for(photoDTO unePhoto : desPhotos ){
                data.add(unePhoto);
            }

            colIdPhoto.setCellValueFactory(new PropertyValueFactory<photoDTO,Integer>("idPhoto"));
            collienPhoto.setCellValueFactory(new PropertyValueFactory<photoDTO,String>("lienphoto"));

            ArrayList<Integer> desAnnee = new ArrayList<>();
            DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy");
            //TODO trouver solution pour la date batard
            for (int i = 2000; i<2023 ; i++) {
                desAnnee.add(i);
            }
            List<Integer> desAnneeL = desAnnee;
            cbxAnneBenef.setItems(FXCollections.observableList(desAnneeL));
        }
    }
    public void affichageCA(int annee){
        //Affichage chiffre affaire
        ArrayList<ChiffreDAffaireDTO> desCA= SalleDAO.selectAnnuelCA(uneSalle.getIdSalle(),annee);



        ObservableList<ChiffreDAffaireDTO> data1 = FXCollections.observableArrayList(desCA) ;


        //wtf pk ça beug
        for (ChiffreDAffaireDTO unCA : data1){
            System.out.println(unCA.getChiffreDaffaire());
            System.out.println(unCA.getAnnee());

        }

        colAnnee.setCellValueFactory(new PropertyValueFactory<ChiffreDAffaireDTO,Integer>("annee"));
        colChiffreAffaire.setCellValueFactory(new PropertyValueFactory<ChiffreDAffaireDTO,Integer>("ChiffreDaffaire"));
        tableCA.setItems(data1);
    }
    public void btnValider(ActionEvent actionEvent) {
        //pour recup l'id
        DesSalles = SalleDAO.SelectSalleCount();
        //verif de quelle bouton ils provient
        if(this.indiceBouton == "Add"){
            AjoutSalle(DesSalles.size()+1,this.unLieu.getIdLieu(),inputNomSalle.getText(), Double.valueOf(inputLongueur.getText()) , Double.valueOf(inputLongueur.getText()),Double.valueOf(inputSurface.getText()),Double.valueOf(inputHauteur.getText()),Double.valueOf(inputCapacite.getText()), Double.parseDouble(inputPrixDJ.getText()));
        }
        else{
            modificationSalle(uneSalle.getIdSalle(),inputNomSalle.getText(), Double.valueOf(inputLongueur.getText()) , Double.valueOf(inputLongueur.getText()),Double.valueOf(inputSurface.getText()),Double.valueOf(inputHauteur.getText()),Double.valueOf(inputCapacite.getText()), Double.parseDouble(inputPrixDJ.getText()));
            }
    }

}
