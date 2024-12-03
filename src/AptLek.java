public class AptLek {
    //описать название и стоимость лекарств
    private String nameLek;
    private int priceLek;

    public AptLek(String nameLek, double priceLek) {
        this.nameLek = nameLek;
        this.priceLek = priceLek;
    }
    public String getNameLek() {
        return nameLek;
    }
    public double getPriceLek() {
        return priceLek;
    }
}
