package az.library_management.model;

public class User {
    private Integer id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;

    public User() {
    }

    public User(Integer id, String username, String password, String firstName, String lastName, String address, String phone) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format("User{id=%d, username='%s', password='%s', firstName='%s', lastName='%s', address='%s', phone='%s'}",
                id, username, password, firstName, lastName, address, phone);
    }
}