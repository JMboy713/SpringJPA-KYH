package hellojpa;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;

@Entity
public class MemberEmbeded {
    private String name;

    @Embedded
    private Address homeAddress;

    public MemberEmbeded() {
    }

    public MemberEmbeded(String name, Address homeAddress) {
        this.name = name;
        this.homeAddress = homeAddress;
    }

    public MemberEmbeded(String name, String city, String street, String zipcode) {
        this.name = name;
        this.homeAddress = new Address(city, street, zipcode);
    }
}
