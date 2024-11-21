package HousingRentalSystem;

public class Customer {

//Customer information:
//- Name
//- Address
//- Age
        private String name;
        private String address;
        private int age;

        public Customer(String name, String address, int age) {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    ", name='" + name + '\'' +
                    "address='" + address + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
