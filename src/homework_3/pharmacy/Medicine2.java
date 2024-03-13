package clients.pharmacy;

import java.util.*;

public class Medicine2 implements Iterable<MedComponent>, Comparable<Medicine2> {
    public List<MedComponent> components;
    public int index;
    private final String name;
    public Medicine2(String name) {
        this.components = new ArrayList<>();
        this.index = 0;
        this.name = name;
    }
    public Medicine2 addComponent(MedComponent component) {
        components.add(component);
        return this;
    }

    public String getName() {
        return name;
    }

    //    @Override
//    public boolean hasNext(){
////        return components.iterator().hasNext();
//        return index < components.size();
//    }
//
//    @Override
//    public MedComponent next() {
////        return components.iterator().next();
//        return components.get(index++);
//    }
    @Override
    public String toString(){
        return "Medicine: " + name + components + "\n";
    }

    @Override
    public Iterator<MedComponent> iterator() {
        return new Iterator<MedComponent>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public MedComponent next() {
                return components.get(index++);
            }
        };
    }

//    @Override
//    public int compareTo(MedComponent o) {
//        return name.length() - o.getName().length();
//    }

    @Override
    public int compareTo(Medicine2 o) {
//        int NameComparator = name.length() - o.name.length();
//        if (name.length() - o.name.length() == 0){
//            return components.size() - o.components.size();
//        }
//        else return NameComparator;
        Collections.sort(this.components, new Comparator<MedComponent>() {
            @Override
            public int compare(MedComponent o1, MedComponent o2) {
                return Double.compare(o1.getPower(), o2.getPower());
            }
        });
        Collections.sort(o.components, new Comparator<MedComponent>() {
            @Override
            public int compare(MedComponent o1, MedComponent o2) {
                return Double.compare(o1.getPower(), o2.getPower());
            }
        });
        double totalPower = 0;
        for (MedComponent component : this.components){
            totalPower += component.getPower();
        }
        double ototalPower = 0;
        for (MedComponent component : o.components){
            ototalPower += component.getPower();
        }
        return Double.compare(totalPower, ototalPower);
    }
}
