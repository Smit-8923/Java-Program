package tnsif.region.countrystatepack;

public class Country {

    private String name;


    public Country() {
        this.name = ""; // Initializing name to an empty string
    }

   
    public Country(String name) {
        this.name = name; // Initializing name to the provided value
    }

 
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Country country = new Country("India");
        System.out.println(country); // Printing the Country object
    }
}
