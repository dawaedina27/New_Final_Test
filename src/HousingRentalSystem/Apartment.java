package HousingRentalSystem;

public class Apartment extends House{
    public Apartment( int numberOfRooms, double sizeInSquareMeters, double pricePerDay, String address, String city) {
        super(numberOfRooms, sizeInSquareMeters, pricePerDay, address, city);
    }

    @Override
    void rentHouse(Customer customer, int days) {
        this.customers.add(customer);
        isRented = true;
        this.days = days;

    }

    @Override
    void leaveHouse(Customer customer) {
        this.customers.clear();
        isRented = false;
        this.days = 0;

    }

    @Override
    void isRented(Customer customer) {
        if(isRented == true){
            System.out.println("House is rented");
        }else{
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
        }  else{
            top = customers.size();
        }
        for(int i =0;i<top;i++){
            System.out.println(customers.get(i));
        }

    }


}
