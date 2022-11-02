import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import AutoVehiculPackage.*;
public class Screen3 extends Main{
    private JTextField textFieldModel;
    private JTextField textFieldProprietar;
    private JTextField textFieldPret;
    private JTextField textFieldAn;
    private JTextField textFieldCapacitate;
    private JButton buttonIntroducere1;
    private JLabel lblmodel;
    private JLabel lblproprietar;
    private JLabel lblpret;
    private JLabel lblan;
    private JLabel lblcapacitate;
    private JLabel lblerror;
    JPanel ScreenPanel;

    public Screen3(ArrayList<Camion> list,JList jlist,DefaultListModel listmodel)
    {
        buttonIntroducere1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String model= textFieldModel.getText();
                String proprietar= textFieldProprietar.getText();
                int pret= Integer.parseInt(textFieldPret.getText());
                int an=Integer.parseInt(textFieldAn.getText());
                int capacitate=Integer.parseInt(textFieldCapacitate.getText());
                if(!model.isEmpty() && !proprietar.isEmpty() && pret>0 && an>0 && capacitate>0) {
                    list.add(new Camion(model, proprietar, pret, an, capacitate));
                    listmodel.addElement("* "+model+"-"+proprietar+"-"+pret+"-"+an+"-"+capacitate);
                    jlist.setModel(listmodel);
                    textFieldModel.setText("");
                    textFieldProprietar.setText("");
                    textFieldPret.setText("0");
                    textFieldAn.setText("0");
                    textFieldCapacitate.setText("0");
                    lblerror.setText("S-a introdus cu succes");
                }
                else lblerror.setText("Date Incorecte(unul sau mai multe campuri goale)");
            }
        });
    }
}
