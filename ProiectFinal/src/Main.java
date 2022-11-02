import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import AutoVehiculPackage.*;

public class Main {
    JList jlist1;
    JList jlist2;
    JList jlist3;
    private JButton buttonadaugare1;
    private JButton buttonadaugare2;
    private JButton buttonadaugare3;
    private JButton buttonminim1;
    private JButton buttonminim2;
    private JButton buttonminim3;
    private JButton buttonmaxim1;
    private JButton buttonmaxim2;
    private JButton buttonmaxim3;
    private JButton buttonmedie1;
    private JButton buttonmedie2;
    private JButton buttonmedie3;
    private JLabel lblminim1;
    private JLabel lblminim2;
    private JLabel lblminim3;
    private JLabel lblmaxim1;
    private JLabel lblmaxim2;
    private JLabel lblmaxim3;
    private JLabel lblmedie1;
    private JLabel lblmedie2;
    private JLabel lblmedie3;
    private JLabel lblMasini;
    private JLabel lblMotociclete;
    private JLabel lblCamioane;
    private JPanel MainWindowPanel;
    DefaultListModel<String> listmodel1= new DefaultListModel<String>();

    DefaultListModel<String> listmodel2= new DefaultListModel<String>();

    DefaultListModel<String> listmodel3= new DefaultListModel<String>();

    ArrayList<Masina> list1=new ArrayList<Masina>();
    ArrayList<Motocicleta> list2=new ArrayList<Motocicleta>();
    ArrayList<Camion> list3=new ArrayList<Camion>();
    public Main()
    {

        buttonadaugare1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame=new JFrame("Introduceti Date Masina");
                frame.setContentPane(new Screen1(list1,jlist1,listmodel1).ScreenPanel);
                frame.pack();
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame.setVisible(true);
            }
        });
        buttonadaugare2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame=new JFrame("Introduceti Date Motocicleta");
                frame.setContentPane(new Screen2(list2,jlist2,listmodel2).ScreenPanel);
                frame.pack();
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame.setVisible(true);
            }
        });
        buttonadaugare3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame=new JFrame("Introduceti Date Camion");
                frame.setContentPane(new Screen3(list3,jlist3,listmodel3).ScreenPanel);
                frame.pack();
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame.setVisible(true);
            }
        });
        buttonminim1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int aux1=Utilitar.pretMinMasini(list1);
                lblminim1.setText(Integer.toString(aux1));
            }
        });
        buttonminim2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int aux2=Utilitar.pretMinMotociclete(list2);
                lblminim2.setText(Integer.toString(aux2));
            }
        });
        buttonminim3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int aux3=Utilitar.pretMinCamioane(list3);
                lblminim3.setText(Integer.toString(aux3));
            }
        });
        buttonmaxim1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int aux1=Utilitar.pretMaxMasini(list1);
                lblmaxim1.setText(Integer.toString(aux1));
            }
        });
        buttonmaxim2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int aux2=Utilitar.pretMaxMotociclete(list2);
                lblmaxim2.setText(Integer.toString(aux2));
            }
        });
        buttonmaxim3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int aux3=Utilitar.pretMaxCamioane(list3);
                lblmaxim3.setText(Integer.toString(aux3));
            }
        });
        buttonmedie1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double aux1=Utilitar.mediePreturiMasini(list1);
                lblmedie1.setText(Double.toString(aux1));
            }
        });
        buttonmedie2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double aux2=Utilitar.mediePreturiMotociclete(list2);
                lblmedie2.setText(Double.toString(aux2));
            }
        });
        buttonmedie3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double aux3=Utilitar.mediePreturiCamionane(list3);
                lblmedie3.setText(Double.toString(aux3));
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame=new JFrame("Game App");
        frame.setContentPane(new Main().MainWindowPanel);
        frame.pack();
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int resp = JOptionPane.showConfirmDialog(frame, "Confirmati inchiderea aplicatiei",
                        "", JOptionPane.YES_NO_OPTION);

                if (resp == JOptionPane.YES_OPTION) {
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                } else {
                    frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            }
        }});
        frame.setVisible(true);
    }
}
