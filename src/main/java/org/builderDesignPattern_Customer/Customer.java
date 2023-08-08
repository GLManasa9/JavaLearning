package org.builderDesignPattern_Customer;

public class Customer {
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final String primaryEmail;
    private final String secondaryEmail;
    private final String primaryMobileNumber;
    private final String secondaryMobileNumber;

    public Customer(CustomerBuilder customerBuilder){
        this.firstName = customerBuilder.getFirstName();
        this.lastName = customerBuilder.getLastName();
        this.primaryEmail = customerBuilder.getPrimaryEmail();
        this.secondaryEmail = customerBuilder.getSecondaryEmail();
        this.primaryMobileNumber = customerBuilder.getPrimaryMobileNumber();
        this.secondaryMobileNumber = customerBuilder.getSecondaryMobileNumber();
        this.middleName = customerBuilder.getMiddleName();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", primaryEmail='" + primaryEmail + '\'' +
                ", secondaryEmail='" + secondaryEmail + '\'' +
                ", primaryMobileNumber='" + primaryMobileNumber + '\'' +
                ", secondaryMobileNumber='" + secondaryMobileNumber + '\'' +
                '}';
    }
}
