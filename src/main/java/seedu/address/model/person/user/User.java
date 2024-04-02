package seedu.address.model.person.user;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import seedu.address.commons.util.ToStringBuilder;
import seedu.address.model.person.Address;
import seedu.address.model.person.CompanyName;
import seedu.address.model.person.Email;
import seedu.address.model.person.Name;
import seedu.address.model.person.Phone;
import seedu.address.model.person.Salary;

public class User {

    private static User user;
    private CompanyName companyName;
    private Name name;
    private Phone phone;
    private Email email;

    // Data fields
    private Address address;
    private Salary salary;
    private Education education;

    private User() {

    }

    public static User getInstance() {
        if (user == null) {
            // Create a new instance if it doesn't exist
            user = new User();
        }
        return user;
    }

    public CompanyName getCompanyName() {
        return companyName;
    }
    public void setCompanyName(CompanyName companyName) {
        this.companyName = companyName;
    }
    public Name getName() {
        return name;
    }
    public void setName(Name name) {
        this.name = name;
    }
    public Phone getPhone() {
        return phone;
    }
    public void setPhone(Phone phone) {
        this.phone = phone;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public Salary getSalary() {
        return salary;
    }
    public void setSalary(Salary salary) {
        this.salary = salary;
    }
    public Email getEmail() {
        return email;
    }
    public void setEmail(Email email) {
        this.email = email;
    }
    public Education getEducation() {
        return education;
    }
    public void setEducation(Education education) {
        this.education = education;
    }
}
