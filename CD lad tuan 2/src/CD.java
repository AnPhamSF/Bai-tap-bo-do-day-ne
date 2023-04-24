public class CD {
        private int maCD;
        private String tuaCD;
        private int soBH;
        private float giaThanh;
        public CD() {
        }
        public CD(int maCD, String tuaCD, int soBH, float giaThanh) {
            this.maCD = maCD;
            this.tuaCD = tuaCD;
            this.soBH = soBH;
            this.giaThanh = giaThanh;
        }
    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }
    public int getSoBH() {

            return soBH;
    }

    public void setSoBH(int soBH) {

            this.soBH = soBH;
    }

    public float getGiaThanh() {

            return giaThanh;
    }

    public void setGiaThanh(float giaThanh) {

            this.giaThanh = giaThanh;
    }
    @Override
    public String toString() {
        return "Album{" + "maCD=" + maCD + ", tuaCD='" + tuaCD + ", soBH=" + soBH + ", giaThanh=" + giaThanh + '}';
    }
    public void hienThiCD(){
        System.out.printf("%-10d %-20s %-20s %-20.1f \n",maCD,tuaCD,soBH,giaThanh);
    }

}
