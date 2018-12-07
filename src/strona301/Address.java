package strona301;

public class Address {
    private String ulica;
    protected String nrDomu;
    String miasto;

    public Address(String ulica, String nrDomu, String miasto) {
        this.ulica = ulica;
        this.nrDomu = nrDomu;
        this.miasto = miasto;
    }
}
