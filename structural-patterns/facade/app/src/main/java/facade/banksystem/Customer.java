package facade.banksystem;

public class Customer {
    private String name;
    private String celphone;
    private String email;

    public Customer(String name, String celphone, String email) {
        this.name = name;
        this.celphone = celphone;
        this.email = email;
    }

    public String getCustomerInformation() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", celphone='" + celphone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
