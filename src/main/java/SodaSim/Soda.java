package SodaSim;

class Soda {
    // simulate a soda
    private String name;
    private String flavor;
    private float price;

    public Soda() {
        this.name = "Generic Soda brand Soda";
        this.flavor = "Tastes like generic soda that fell behind the shelf.";
        this.price = .25;
    }

    public Soda(String name, String flavor, float price) {
        this.name = name;
        this.flavor = flavor;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public String getFlavor() {
        return this.flavor;
    }

    public float getPrice() {
        return this.price;
    }


}
