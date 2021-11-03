package models;

abstract class Base {
    public String id;

    @Override
    public String toString() {
        return "ID: " + this.id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Base){
            Base aux = (Base) obj;
            return this.id.equals(aux.id);
        }
        return false;
    }
}
