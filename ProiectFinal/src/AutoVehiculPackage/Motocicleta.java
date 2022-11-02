package AutoVehiculPackage;

public class Motocicleta extends AutoVehicul{
    
    private int vitezamaxima;

    public Motocicleta()
    {
        super.setModel("");
        super.setProprietar("");
        super.setPret(0);
        super.setAn(0);
        this.vitezamaxima=0;
    }

    public Motocicleta(String model,String proprietar,int pret,int an,int vitezamaxima)
    {
        super.setModel(model);
        super.setProprietar(proprietar);
        super.setPret(pret);
        super.setAn(an);
        this.vitezamaxima=vitezamaxima;
    }

    public int getvitezamaxima()
    {
        return vitezamaxima;
    }

    public void setvitezamaxima(int vitezamaxima)
    {
        this.vitezamaxima=vitezamaxima;
    }
    public String toString()
    {
        return super.getModel()+" "+ super.getProprietar()+ " "+super.getPret()+" "+super.getAn()+" "+this.vitezamaxima;
    }
}
