public class Address {
    private int streetNumber;
    private String city;
    private String country;
    public Address(int streetNumber,String city,String country){
        this.streetNumber=streetNumber;
        this.city=city;
        this.country=country;
    }
    public void setStreetNumber(int streetNumber){
        this.streetNumber=streetNumber;
    }
    public int getStreetNumber(){
        return streetNumber;
    }
    public void setCity(String city){
        this.city=city;
    }
    public String getCity(){
        return city;
    }
    public void setCountry(String country){
        this.country=country;
    }
    public String getCountry(){
        return country;
    }
}
