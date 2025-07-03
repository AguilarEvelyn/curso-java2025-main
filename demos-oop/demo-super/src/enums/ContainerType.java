package enums;

public enum ContainerType {

    // BAG, BOX

    BAG("Bolsa"), BOX("Caja");

    String name;
    
    ContainerType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
