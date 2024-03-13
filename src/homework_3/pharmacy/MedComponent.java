package clients.pharmacy;

public abstract class MedComponent implements Comparable<MedComponent>{
    private String name;
    private float weight;
    private int power;
    public MedComponent(String name, float weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }
    @Override
    public int compareTo(MedComponent o){
//        // variant 1
//        if (this.power > o.power){
//            return 1;
//        } else if (this.power < o.power){
//            return -1;
//        } else return 0;
//        // variant 2
//        return Integer.compare(this.power, o.power);
//        // variant 3
        return power - o.power;
//        return name.compareTo(o.name);
    }

    public float getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return  "\n" + "MedComponent{" +
                "name: '" + name + '\'' +
                ", weight: " + weight +
                ", power: " + power +
                '}';
    }
}
