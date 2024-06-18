package tnsif.region.countrystatepack;

public class City {

    private String name;

  
    public City() {
        this.name = ""; 
    }

 
    public City(String name) {
        this.name = name; 
    }

    
    public String getName() {
        return name;
    }

   
    public void setName(String name) {
        this.name = name;
    }

   
    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                '}';
    }

    
    public static void main(String[] args) {
        City city = new City("AHMEDABAD");
        System.out.println(city); // Printing the City object
    }
}
