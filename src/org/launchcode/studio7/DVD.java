package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseDisc implements OpticalDisc {
    public DVD(String name, double storage, double storageUsed, String discType, ArrayList<String> contents) {
        super(name, storage, storageUsed, discType, contents);
    }

    @Override
    public void spinDisc() {
        System.out.println("The DVD is spinning now.");
    }

    @Override
    public void readData() {
        ArrayList<String> data = getContents();
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }
    }

    @Override
    public void ejectDisc() {
        System.out.println("The disc has been ejected.");
    }

    @Override
    public void loadDisc() {
        System.out.println("The disc has been inserted.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
