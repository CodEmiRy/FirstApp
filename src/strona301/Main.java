package strona301;

public class Main {
    public static void main(String[] args) {
        Person pe = new Person(new Address("a","b","v"));
        pe.address.miasto = "nowa ulica";
        pe.address.nrDomu = "nowa ulica";
  //      pe.address = new Address("ul","dom","mias");

    }

}
