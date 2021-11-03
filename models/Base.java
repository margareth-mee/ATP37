package models;

abstract class Base {
    public String id;

    @Override
    public String toString() {
        return "ID: " + this.id;
    }
}
