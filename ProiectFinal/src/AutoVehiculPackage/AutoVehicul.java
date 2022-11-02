
package AutoVehiculPackage;

    public class AutoVehicul implements IAutovehicul{
        private  String model;
        private String proprietar;
        private int pret;
        private int an;
        private static final String culoare = "Gri";

        public AutoVehicul()
        {
            this.model="";
            this.proprietar="";
            this.pret=0;
            this.an=0;
        }

        public AutoVehicul(String model,String proprietar,int pret,int an){
            this.model=model;
            this.proprietar=proprietar;
            this.pret=pret;
            this.an=an;

        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getProprietar() {
            return proprietar;
        }

        public void setProprietar(String proprietar) {
            this.proprietar = proprietar;
        }


        public int getPret() {
            return pret;
        }

        public void setPret(int pret) {
            this.pret = pret;
        }

        public int getAn() {
            return an;
        }

        public void setAn(int an) {
            this.an = an;
        }

        public String toString(){
            return model+" "+ proprietar+ " "+pret+" "+an;
        }
    }