package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseDisc implements OpticalDisc {
    public DVD(String name, double storage, double storageUsed, String discType, ArrayList<String> contents) {
        super(name, storage, storageUsed, discType, contents);
    }

    @Override
    public void spinDisc() {

    }

    @Override
    public void readData() {

    }

    @Override
    public void ejectDisc() {

    }

    @Override
    public void loadDisc() {

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
