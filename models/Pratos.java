package models;

public class Pratos extends Base{
    public String material;
    public String marca;

    @Override
    public String toString() {
        return super.toString() + "\nMaterial: " + this.material + "\nMarca: " + this.marca;
    }
}