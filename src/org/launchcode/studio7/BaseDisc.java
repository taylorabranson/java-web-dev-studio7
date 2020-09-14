package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.HashMap;

public class BaseDisc {

    private String name;
    private double storage;
    private double storageUsed;
    private String discType;
    private ArrayList<String> contents;

    public BaseDisc(String name, double storage, double storageUsed, String discType, ArrayList<String> contents) {
        this.name = name;
        this.storage = storage;
        this.storageUsed = storageUsed;
        this.discType = discType;
        this.contents = contents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStorage() {
        return storage;
    }

    public void setStorage(double storage) {
        this.storage = storage;
    }

    public double getStorageUsed() {
        return storageUsed;
    }

    public void setStorageUsed(double storageUsed) {
        this.storageUsed = storageUsed;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public ArrayList<String> getContents() {
        return contents;
    }

    public void setContents(ArrayList<String> contents) {
        this.contents = contents;
    }

    public void discInfo() {
        System.out.println("Disc \"" + name + "\" is a " + discType +
                "\nTotal Storage: " + storage +
                "\nStorage Used: " + storageUsed +
                "\nAvailable Space: " + (storage - storageUsed));
    }

    public void writeData(String data) {
        this.contents.add(data);
    }
}
