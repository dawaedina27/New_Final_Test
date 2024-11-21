package HousingRentalSystem;

public class Villa extends House {

    //Constructors

    public Villa(int numberOfRooms, double sizeInSquareMeters, double pricePerDay, String address, String city) {
        super(numberOfRooms, sizeInSquareMeters, pricePerDay, address, city);
    }

    //When a customer rent the house, the customer will be added to the customers list
    // isRented becomes true and the rental days will be captured
    @Override
    void rentHouse(Customer customer, int days) {
        this.customers.add(customer);
        isRented = true;
        this.days = days;

    }
    // Overridden the method from the abstract class. if the customer leaves the house, the isRented should be cleared to false and days should be cleared to 0
    @Override
    void leaveHouse(Customer customer) {
        this.customers.clear();
        isRented = false;
        this.days = 0;

    }

    @Override
    void isRented(Customer customer) {
        if (isRented == true) {
            System.out.println("House is rented");
        } else {
            System.out.println("House is not rented");
        }

    }

    @Override
    double calculateTotalRentalIncome() {
        return pricePerDay * days;
    }

    @Override
    void getLast5Rentals() {
        int top = 0;
        if (customers.size() > 5) {
            top = 5;
            System.out.println("The last 5 rentals are: " + customers.get(top));
        } else {
            top = customers.size();
        }
        for (int i = 0; i < top; i++) {
            System.out.println(customers.get(i));
        }

    }
}
