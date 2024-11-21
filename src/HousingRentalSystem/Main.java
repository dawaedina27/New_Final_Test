package HousingRentalSystem;

public class Main {
    public static void main(String[] args) {

//You are tasked with designing a housing rental system. The system has to manage different
//types of housing (apartment, villa). It also needs to save information about customers who rent
//the housing.
//House information:
//- number of rooms
//- size in m2
//- price per day
//- address
//- city
//Customer information:
//- Name
//- Address
//- Age
//  When designing this system, have in mind the features that the users will need:
//- check if the housing is currently free or rented out
//- calculate total rental income per housing
//- get a list of max last 5 rentals per customer


        Customer customer1 = new Customer("Dawa Edina", "110 Bari", 55);
        Customer customer2 = new Customer("Hana Debay", "1073 Napoli", 30);
        Customer customer3 = new Customer("Mauwa Mudidi", "206 Nsyambia", 19);
        Customer customer4 = new Customer("Alpha Mukasa", "2224 Ediofe", 23);
        Customer customer5 = new Customer("Melissa Joyce", "900 Pajulu", 21);
        Customer customer6 = new Customer("Francisca Nana", "976 Nebbi", 24);
        Customer customer7 = new Customer("Bosco Franco", "764 Milano", 25);
        Customer customer8 = new Customer("Patricia Emma", "354 Inghilterra", 32);


        House apartment = new Apartment(1, 4.6, 70000, "Awinidiri", "Arua");
        House villa = new Villa(2, 8, 5000, "Koboko", "Gulu");

        //Customers who have rented the apartment and the number of days they were in the house.
        apartment.rentHouse(customer1, 6);
        apartment.rentHouse(customer2, 8);
        apartment.rentHouse(customer3, 2);
        apartment.rentHouse(customer4, 3);
        apartment.rentHouse(customer5, 4);

        //Customers who rented the Villa and the days they stayed in the house
        villa.rentHouse(customer4, 4);
        villa.rentHouse(customer5, 2);
        villa.rentHouse(customer6, 5);
        villa.rentHouse(customer7, 11);
        villa.rentHouse(customer8, 9);


       // To display whether the apartment is occupied or not
        apartment.isRented(customer3);

        // To know the total income collected from the rentals of the apartment
        double totalIncome = apartment.calculateTotalRentalIncome();
        System.out.println("Total Rental Income for Apartment: $" + totalIncome);

        //get the last 5 rentals of the apartment
        apartment.getLast5Rentals();

        //Give a space/paragraph and a borderline to divide the two.
        System.out.println();
        System.out.println("******************************************************");

        // Display whether the villa is occupied or it is free.
        villa.isRented(customer5);
        double totalIncome2 = villa.calculateTotalRentalIncome();
        System.out.println("Total Rental Income for Villa: $" + totalIncome2);

        //get the last 5 rentals of the Villa
        villa.getLast5Rentals();


    }


}
