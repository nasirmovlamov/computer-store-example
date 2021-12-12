package az.library_management.model;

public class Users {
    private Integer userId;
    private Integer roleId;
    private String name;
    private String degreeProgram;
    private String contact;
    private String address;
    private Integer year;

    public Users() {
    }

    public Users(Integer userId, Integer roleId, String name, String degreeProgram, String contact, String address, Integer year) {
        this.userId = userId;
        this.roleId = roleId;
        this.name = name;
        this.degreeProgram = degreeProgram;
        this.contact = contact;
        this.address = address;
        this.year = year;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public void setDegreeProgram(String degreeProgram) {
        this.degreeProgram = degreeProgram;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("Users{id=%d, roleId=%d, name='%s', degreeProgram='%s', contact=%d, address='%s', year=%d}", userId, roleId, name, degreeProgram, contact, address, year);
    }
}