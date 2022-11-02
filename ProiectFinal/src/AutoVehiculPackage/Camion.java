package AutoVehiculPackage;

public class Camion extends AutoVehicul{

    private int capacitate;

    public Camion()
    {
        super.setModel("");
        super.setProprietar("");
        super.setPret(0);
        super.setAn(0);
        this.capacitate=0;
    }

    public Camion(String model,String proprietar,int pret,int an,int capacitate)
    {
        super.setModel(model);
        super.setProprietar(proprietar);
        super.setPret(pret);
        super.setAn(an);
        this.capacitate=capacitate;
    }

    public int getcapacitate()
    {
        return capacitate;
    }

    public void setcapacitate(int capacitate)
    {
        this.capacitate=capacitate;
    }
    public String toString()
    {
        return super.getModel()+" "+ super.getProprietar()+ " "+super.getPret()+" "+super.getAn()+" "+this.capacitate;
    }
}
