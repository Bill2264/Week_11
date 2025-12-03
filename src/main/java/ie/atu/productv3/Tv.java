package ie.atu.productv3;

public class Tv extends Product{
    private String screenSize;
    private String manufacturer;

    public Tv(){
        super();
        screenSize = "";
        manufacturer = "";
        count++;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return super.toString() + " " + getCode()+
                " by " + manufacturer+"\n"
                + " Screen Size: " + screenSize;
    }
}
