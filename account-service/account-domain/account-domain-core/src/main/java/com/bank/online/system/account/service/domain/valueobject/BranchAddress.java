package com.bank.online.system.account.service.domain.valueobject;

import java.util.Objects;
import java.util.UUID;

public class BranchAddress {

    private final UUID id;
    private final String country;
    private final String street;
    private final String city;

    public BranchAddress(UUID id, String country, String street, String city) {
        this.id = id;
        this.country = country;
        this.street = street;
        this.city = city;
    }

    public UUID getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BranchAddress that = (BranchAddress) o;
        return country.equals(that.country) && street.equals(that.street) && city.equals(that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, street, city);
    }
}
