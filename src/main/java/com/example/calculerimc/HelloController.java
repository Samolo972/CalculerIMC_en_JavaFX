package com.example.calculerimc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    public Button calculerimc;

    @FXML
    public Label corpulence;

    @FXML
    public Button femme;

    @FXML
    public Button homme;

    @FXML
    public TextField poids;

    @FXML
    public Label poidsid;

    @FXML
    public Label pourcent;

    @FXML
    public Label resuIMC;

    @FXML
    public TextField taille;

    @FXML
    public TextField year;


   public void CalculerIMC(ActionEvent Action){

       String taille2 = taille.getText();
       double tailleDouble = Double.parseDouble(taille2);
       String poids2 = poids.getText();
       double poidsDouble = Double.parseDouble(poids2);
       double imc = poidsDouble/Math.pow(tailleDouble, 2);


        resuIMC.setText(String.valueOf(imc));

        String nbr1 = "Insuffisance pondérale";
        String nbr2 = "Poids normal";
        String nbr3 = "Surpoids";
        String nbr4 = "Obésité";

        if (imc < 18.5) {
            corpulence.setText(nbr1);
        } else if (imc >= 18.5 && imc < 25) {
            corpulence.setText(nbr2);
        } else if (imc >= 25 && imc < 30) {
            corpulence.setText(nbr3);
        } else {
            corpulence.setText(nbr4);
        }
        
        double tailleEnCm = tailleDouble*100;

        double poidsIdealH = tailleEnCm - 100 - ((tailleEnCm - 150) /4);

        poidsid.setText("Votre poids idéale serait " +poidsIdealH+ "KG");
    }

}