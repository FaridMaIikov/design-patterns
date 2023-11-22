package com.example.structural.adapter;

public class App {
    public static void main(String[] args) {
        Socket socket = new Socket();

        Refrigerator r = new Refrigerator();
        socket.giveElectricity(r);

        Samsung s = new Samsung();
        PhoneHouseThingsAdapter adapter = new PhoneHouseThingsAdapter(s);

        socket.giveElectricity(adapter);
    }
}
