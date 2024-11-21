package HousingRentalSystem;

///You are tasked with designing a housing rental system. The system has to manage different
////types of housing (apartment, villa). It also needs to save information about customers who rent
////the housing.
////House information:
////- number of rooms
////- size in m2
////- price per day
////- address
////- city
///
import java.util.List;
import java.util.ArrayList;

//create an abstract class called House
public abstract class House {

    //the abstract Class's fields
    protected int numberOfRooms;
    protected double sizeInSquareMeters;
    protected double pricePerDay;
    protected String address;
    protected String city;
    protected boolean isRented;
    protected List<Customer> customers;
    protected int days;

    // Constructors
    public House(int numberOfRooms, double sizeInSquareMeters, double pricePerDay, String address, String city) {
        this.numberOfRooms = numberOfRooms;
        this.sizeInSquareMeters = sizeInSquareMeters;
        this.pricePerDay = pricePerDay;
        this.address = address;
        this.city = city;

        this.isRented = false;
        this.customers = new ArrayList<>();
        this.days = 0;
    }
    //Getters
    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public double getSizeInSquareMeters() {
        return sizeInSquareMeters;
    }
    //When a customer rent the house, the customer will be added to the customers list
    // isRented becomes true and the rental days will be captured

    void rentHouse(Customer customer, int days) {
        this.customers.add(customer);
        isRented = true;
        this.days = days;

    }
    // if the customer leaves the house, the isRented should be cleared to false and days should be cleared to 0
    void leaveHouse(Customer customer) {
        this.customers.clear();
        isRented = false;
        this.days = 0;

    }
    // code to check if the housing is currently free or rented out
    void isRented(Customer customer) {
        if (isRented == true) {
            System.out.println("House is rented");
        } else {
            System.out.println("House is not rented");
        }

    }

    //To calculate the total rental income by multiplying the amount charged per day by the number of days the customer stayed in the house.
    double calculateTotalRentalIncome() {
        return pricePerDay * days;
    }

    //To get the last 5 rentals, check if the number of the rentals are more than 5 then print the last 5
    // Otherwise display the available rentals
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

