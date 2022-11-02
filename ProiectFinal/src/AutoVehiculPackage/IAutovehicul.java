package AutoVehiculPackage;

public interface IAutovehicul {

    static final String culoare = "Gri";
    String getModel();
    void setModel(String model);
    String getProprietar();
    void setProprietar(String proprietar);
    int getPret();
    void setPret(int pret);
    int getAn();
    void setAn(int an);
    String toString();
}
