package com.example.structural.adapter;

public class PhoneHouseThingsAdapter implements Things {
    private Phone phone;

    public PhoneHouseThingsAdapter(Phone phone) {
        this.phone = phone;
    }

    @Override
    public int charger() {
        return phone.charge();
    }
}
