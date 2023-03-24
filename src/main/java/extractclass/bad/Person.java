package extractclass.bad;

import extractclass.good.Address;

public class Person extends Address {
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;

    //address
    private String street;
    private String postalCode;
    private String city;
    private String country;
    private String door;
}
