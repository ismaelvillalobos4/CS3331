public class Main {

    public static void main(String[] args) {
        LandLord LandLord = new LandLord();

        LandLord.addApartment(new Apartment("Juan", "123 Eastlake", 5000));
        LandLord.addApartment(new Apartment("Erik", "342 Redd Rd", 4000));
        LandLord.addApartment(new Apartment("Omar", "3331 South Mesa Hills", 2500));
        LandLord.addApartment(new Apartment("Bryan", "Green Street 90B", 1000));

        LandLord.collectRent();
    }
}