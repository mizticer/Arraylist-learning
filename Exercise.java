import java.util.List;

public class Exercise {

    static class Address{
        final String country;
        final String city;
        final String street;

        Address(String country, String city, String street) {
            this.country = country;
            this.city = city;
            this.street = street;
        }
    }

    @SuppressWarnings("SpellCheckingInspection")
    public static void main(String[] args) {
        /**
         * Napisz program, który dla tablicy adresow, zwroci i wyświetli tylko te adresy, których kraj ma 6 liter,
         * posortowane w odwrotnej kolejności wg: nazwy miasta i ulicy.
         * Na koniec wstaw swoj adres jako przedostatni element w liscie.
         */
        Address[] array = {
                new Address("Polska", "Wroclaw", "Wałbrzyska"),
                new Address("Francja", "Paryż", "Że Tę"),
                new Address("Niemcy", "Berlin", "DasUlica"),
                new Address("Polska", "Wroclaw", "Komandorska"),
                new Address("Czechy", "Praga", "nebespeczna"),
        };
        Address myAddress = new Address("Polska", "Wroclaw", "RODO");
        List<Address> addresses = solution(myAddress, array);
        for (Address address : addresses) {
            System.out.println(address);
        }

        // Wroclaw, Wałbrzyska
        // Wroclaw, Komandorska
        // Praga, nebespeczna
        // TWOJE_MIAST, TWOJ_ADRES
        // Berlin, DasUlica
    }

    private static List<Address> solution(Address myAddress, Address... addressArray) {
        return null;
    }
}
