package UserInterface;

import cv.*;

import javax.swing.*;
import javax.xml.bind.JAXBException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by saidi on 08/05/2014.
 */
public class test extends JFrame implements ActionListener {

    private JTextField Nom, Prenom,  Nomcv, ident,Com1,Com2,Com3,Exp1,Exp2,Exp3,Loisirs ;

    private JLabel nom, prenom, ID,nomcv, Competences,Competences1,Competences2, Experiences1, Experiences2,Experiences3, langue1,langue2,langue3, loisirs;
    private JButton enregistrer;
    private JComboBox NivLang1;
    private JComboBox NivLang2;
    private JComboBox NivLang3;
    private JComboBox Lang1;
    private JComboBox Lang2;
    private JComboBox Lang3;
    private JComboBox NivCom1;
    private JComboBox NivCom2;
    private JComboBox NivCom3;
    private JComboBox NivExp1;
    private JComboBox NivExp2;
    private JComboBox NivExp3;


    public test(){
        setSize(600,730);
        this.setLayout(null);
        enregistrer = new JButton("Envoyer");
        enregistrer.setBounds(40,620,150,20);//(liman,     ,lta7t)
        getContentPane().add(enregistrer);

        enregistrer.addActionListener(this);
        nom = new JLabel("Nom : ");
        nom.setBounds(40,15,150,20);
        getContentPane().add(nom);

        prenom = new JLabel("Prenom : ");
        prenom.setBounds(40,40,150,20);
        getContentPane().add(prenom);

        nomcv = new JLabel("NomCV : ");
        nomcv.setBounds(40,65,150,20);
        getContentPane().add(nomcv);


        ID = new JLabel("Ientifiant : ");
        ID.setBounds(40,95,150,20);
        getContentPane().add(ID);


        Competences = new JLabel("Compétence Professionnels : ");
        Competences.setBounds(40,225,150,20);
        getContentPane().add(Competences);

        Competences1 = new JLabel("Compétence Professiones2: ");
        Competences1.setBounds(40, 250, 150, 20);//(liman,     ,lta7t)
        getContentPane().add(Competences1);

        Competences2= new JLabel("Compétence Professiones2: ");
        Competences2.setBounds(40, 275, 150, 20);//(liman,     ,lta7t)
        getContentPane().add(Competences2);


        Experiences1 = new JLabel("Experience1: ");
        Experiences1.setBounds(40, 300, 150, 20);//(liman,     ,lta7t)
        getContentPane().add(Experiences1);

        Experiences2 = new JLabel("Experience2 : ");
        Experiences2.setBounds(40,325,150,20);//(liman,     ,lta7t)
        getContentPane().add(Experiences2);

        Experiences3 = new JLabel("Experience2 : ");
        Experiences3.setBounds(40,350,150,20);//(liman,     ,lta7t)
        getContentPane().add(Experiences3);


        langue1 = new JLabel("langue1: ");
        langue1.setBounds(40,375,150,20);//(liman,     ,lta7t)
        getContentPane().add(langue1);

        langue2 = new JLabel("langue2 ");
        langue2.setBounds(40,400,150,20);//(liman,     ,lta7t)
        getContentPane().add(langue2);

        langue3 = new JLabel("langue3 ");
        langue3.setBounds(40,425,150,20);//(liman,     ,lta7t)
        getContentPane().add(langue3);

        loisirs = new JLabel("Loisirs : ");
        loisirs.setBounds(40,450,150,20);//(liman,     ,lta7t)
        getContentPane().add(loisirs);



        /************ text field **********/

        Nom = new JTextField();
        Nom.setBounds(250,15,150,20);//(liman,     ,lta7t)
        getContentPane().add(Nom);

        Prenom = new JTextField();
        Prenom.setBounds(250,40,150,20);//(liman,     ,lta7t)
        getContentPane().add(Prenom);

        Nomcv = new JTextField();
        Nomcv.setBounds(250,65,150,20);//(liman,     ,lta7t)
        getContentPane().add(Nomcv);


        ident = new JTextField();
        ident.setBounds(250,90,150,20);//(liman,     ,lta7t)
        getContentPane().add(ident);



        Com1 = new JTextField();
        Com1.setBounds(250, 225, 150, 20);//(liman,     ,lta7t)
        getContentPane().add(Com1);

        Com2 = new JTextField();
        Com2.setBounds(250, 250, 150, 20);//(liman,     ,lta7t)
        getContentPane().add(Com2);

        Com3 = new JTextField();
        Com3.setBounds(250, 275, 150, 20);//(liman,     ,lta7t)
        getContentPane().add(Com3);



        Exp1 = new JTextField();
        Exp1.setBounds(250, 300, 150, 20);
        getContentPane().add(Exp1);

        Exp2 = new JTextField();
        Exp2.setBounds(250, 325, 150, 20);
        getContentPane().add(Exp2);

        Exp3 = new JTextField();
        Exp3.setBounds(250, 350, 150, 20);
        getContentPane().add(Exp3);


        Lang1 = new JComboBox();
        Lang1.addItem("Francais");
        Lang1.addItem("Arab");
        Lang1.addItem(" Anglais");
        Lang1.setBounds(250, 375, 150, 20);
        getContentPane().add(Lang1);

        Lang2= new JComboBox();
        Lang2.addItem("Francais");
        Lang2.addItem("Arab");
        Lang2.addItem(" Anglais");
        Lang2.setBounds(250, 400, 150, 20);
        getContentPane().add(Lang2);

        Lang3= new JComboBox();
        Lang3.addItem("Francais");
        Lang3.addItem("Arab");
        Lang3.addItem(" Anglais");
        Lang3.setBounds(250, 425, 150, 20);
        getContentPane().add(Lang3);

        Loisirs = new JTextField();
        Loisirs.setBounds(250,450,150,20);
        getContentPane().add(Loisirs);

        NivLang1 = new JComboBox();
        NivLang1.addItem("Faible");
        NivLang1.addItem("moyenne");
        NivLang1.addItem(" Haut");
        NivLang1.setBounds(400, 375, 150, 20);
        getContentPane().add(NivLang1);

        NivLang2= new JComboBox();
        NivLang2.addItem("Faible");
        NivLang2.addItem("moyenne");
        NivLang2.addItem(" Haut");
        NivLang2.setBounds(400, 400, 150, 20);
        getContentPane().add(NivLang2);

        NivLang3= new JComboBox();
        NivLang3.addItem("Moyen");
        NivLang3.addItem("Faible");
        NivLang3.addItem(" Haut");
        NivLang3.setBounds(400, 425, 150, 20);
        getContentPane().add(NivLang3);

        /************************************/

        NivCom1= new JComboBox();
        NivCom1.addItem("Faibles");
        NivCom1.addItem("Moyen");
        NivCom1.addItem("Haut");
        NivCom1.setBounds(400, 225, 150, 20);//(liman,     ,lta7t)
        getContentPane().add( NivCom1);

        NivCom2= new JComboBox();
        NivCom2.addItem("Faibles");
        NivCom2.addItem("Moyen");
        NivCom2.addItem("Haut");
        NivCom2.setBounds(400, 250, 150, 20);//(liman,     ,lta7t)
        getContentPane().add(NivCom2);

        NivCom3= new JComboBox();
        NivCom3.addItem("Faibles");
        NivCom3.addItem("Moyen");
        NivCom3.addItem("Haut");
        NivCom3.setBounds(400, 275, 150, 20);//(liman,     ,lta7t)
        getContentPane().add(NivCom3);

      NivExp1= new JComboBox();
        NivExp1.addItem("2 mois");
        NivExp1.addItem("4 mois");
        NivExp1.addItem("pluss");
        NivExp1.setBounds(400, 300, 150, 20);//(liman,     ,lta7t)
        getContentPane().add( NivExp1);

        NivExp2= new JComboBox();
        NivExp2.addItem("2 mois");
        NivExp2.addItem("4 mois ");
        NivExp2.addItem("plus");
        NivExp2.setBounds(400, 325, 150, 20);//(liman,     ,lta7t)
        getContentPane().add(NivExp2);

        NivExp3= new JComboBox();
        NivExp3.addItem("2 mois");
        NivExp3.addItem("4 mois ");
        NivExp3.addItem("plus");
        NivExp3.setBounds(400, 350, 150, 20);//(liman,     ,lta7t)
        getContentPane().add(NivExp3);

       /* enregistrer = new JButton("Envoyer");
        enregistrer.setBounds(40,620,150,20);//(liman,     ,lta7t)
        getContentPane().add(enregistrer);
*/
        /************************************/
/*
        enregistrer = new JButton("Envoyer");
        enregistrer.setBounds(40,620,150,20);//(liman,     ,lta7t)
        getContentPane().add(enregistrer);

*/
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == enregistrer) {
            String cv;
            try {
               // System.out.println("Je suis la ");
               // String mail = Email.getText();
                int id = Integer.parseInt(ident.getText());
                String nomcv = Nomcv.getText();
                //String adresse = Adresse.getText();
                String nom = Nom.getText();
                String prenom = Prenom.getText();
                String loisirs =Loisirs.getText();
                String langue1Text1 = langue1.getText();
                String NivLangue1  = NivLang1.getSelectedItem().toString();
                String langue2Text = langue2.getText();
                String Nivlangue2  = NivLang2.getSelectedItem().toString();
                String langue3Text = langue3.getText();
                String Nivlangue3  = NivLang3.getSelectedItem().toString();
                String competence1 = Com1.getText();
                String niveauCompetences1  = NivCom1.getSelectedItem().toString();
                String competences2 = Com2.getText();
                String niveauCompetences2  = NivCom2.getSelectedItem().toString();
                String competences3 = Com3.getText();
                String niveauCompetences3  = NivCom3.getSelectedItem().toString();
                String exp1 = Exp1.getText();
                String d1  = NivExp1.getSelectedItem().toString();
                String exp2 = Exp2.getText();
                String d2 = NivExp2.getSelectedItem().toString();
                String exp3 = Exp3.getText();
                String d3 = NivExp3.getSelectedItem().toString();

                //ResumeAdresse resumeAdresse = new ResumeAdresse();
                Competences competences = new Competences();
                Experiences resumeExperiences = new Experiences();
                ResumeLangue resumeLangue = new ResumeLangue();
                ResumeLoisirs resumeLoisirs = new ResumeLoisirs();

                //resumeAdresse.addResumeAdresse(adresse);
                competences.addCompetences(competence1,niveauCompetences1);
                competences.addCompetences(competences2,niveauCompetences2);
                competences.addCompetences(competences3,niveauCompetences3);
                resumeExperiences.addExperiences(exp1, d1);
                resumeExperiences.addExperiences(exp2,d2);
                resumeExperiences.addExperiences(exp3,d3);
                resumeLangue.addLangue(langue1Text1, NivLangue1);
                resumeLangue.addLangue(langue2Text,Nivlangue2);
                resumeLangue.addLangue(langue3Text,Nivlangue3);
                resumeLoisirs.addLoisir(loisirs);
                System.out.println(competences2);

                //resume1= new Resume(2,"Charles", "Jean","technichien",la,lo,E,Co);
                //listCV = new ListCV();

                //listCV.resumeList.add(resume);
                Resume resume=new Resume(id, prenom,nom,nomcv,resumeLangue,resumeLoisirs,resumeExperiences,competences);
                PutRequest putRequest = new PutRequest();
                putRequest.addResume(resume);

            } catch (JAXBException e1) {
                e1.printStackTrace();
            }

          /*  ident.setText("");

            Nom.setText("");
            Prenom.setText("");
            Loisirs.setText("");
            langue1.setText("");
            langue2.setText("");
            langue3.setText("");
            Com1.setText("");
            Com2.setText("");
            Exp1.setText("");
            Exp2.setText("");
            Nomcv.setText("");
            Exp3.setText("");
            Com3.setText("");

*/


        }

    }

    }






