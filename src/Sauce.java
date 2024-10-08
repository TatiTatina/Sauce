class Sauce {
    String name;
    Hotness hotness;

    public Sauce(String name, Hotness hotness) {
        this.name = name;
        this.hotness = hotness;
    }

    public String toString() {
        return "Sauce{" +  name + ":" + hotness + '}';
    }
}
enum Hotness{VERY_HOT,HOT,NOT_HOT}

