import java.util.ArrayList;

public class LandLord {
    ArrayList<Apartment> listOfApartments = new ArrayList();

    public void collectRent() {
        listOfApartments.forEach(apartment -> {
            ((Apartment) apartment).findAddress();
            ((Apartment) apartment).contactTenant();
            ((Apartment) apartment).collectPayment();
        });
    }

    public void addApartment(Apartment apartment) {
        listOfApartments.add(apartment);
    }
}	