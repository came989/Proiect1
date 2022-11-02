import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import AutoVehiculPackage.*;
public class Screen1 extends Main{
    private JTextField textFieldModel;
    private JTextField textFieldProprietar;
    private JTextField textFieldPret;
    private JTextField textFieldAn;
    private JTextField textFieldNumarLocuri;
    private JButton buttonIntroducere1;
    private JLabel lblmodel;
    private JLabel lblproprietar;
    private JLabel lblpret;
    private JLabel lblan;
    private JLabel lblnumarlocuri;
    private JLabel lblerror;
    JPanel ScreenPanel;
    public Screen1(ArrayList<Masina> list,JList jlist,DefaultListModel listmodel)
    {
        buttonIntroducere1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String model= textFieldModel.getText();
                String proprietar= textFieldProprietar.getText();
                int pret= Integer.parseInt(textFieldPret.getText());
                int an=Integer.parseInt(textFieldAn.getText());
                int numarlocuri=Integer.parseInt(textFieldNumarLocuri.getText());
                if(!model.isEmpty() && !proprietar.isEmpty() && pret>0 && an>0 && numarlocuri>0) {
                    list.add(new Masina(model, proprietar, pret, an, numarlocuri));
                    listmodel.addElement("* "+model+"-"+proprietar+"-"+pret+"-"+an+"-"+numarlocuri);
                    jlist.setModel(listmodel);
                    textFieldModel.setText("");
                    textFieldProprietar.setText("");
                    textFieldPret.setText("0");
                    textFieldAn.setText("0");
                    textFieldNumarLocuri.setText("0");
                    lblerror.setText("S-a introdus cu succes");
                }
                else lblerror.setText("Date Incorecte(unul sau mai multe campuri goale)");
            }
        });
    }
}
