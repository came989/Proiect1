package AutoVehiculPackage;

public class Masina extends AutoVehicul{

    private int numarlocuri;

    public Masina()
    {
        super.setModel("");
        super.setProprietar("");
        super.setPret(0);
        super.setAn(0);
        this.numarlocuri=0;
    }

    public Masina(String model,String proprietar,int pret,int an,int numarlocuri)
    {
        super.setModel(model);
        super.setProprietar(proprietar);
        super.setPret(pret);
        super.setAn(an);
        this.numarlocuri=numarlocuri;
    }

    public int getNumarlocuri()
    {
        return numarlocuri;
    }

    public void setNumarLocuri(int numarlocuri)
    {
        this.numarlocuri=numarlocuri;
    }

    public String toString()
    {
        return super.getModel()+" "+ super.getProprietar()+ " "+super.getPret()+" "+super.getAn()+" "+this.numarlocuri;
    }
}
