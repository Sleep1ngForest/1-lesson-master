package clients.pharmacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Medicine implements Iterator<MedComponent> {
    public List<MedComponent> components;
    public int index;

    public Medicine() {
        this.components = new ArrayList<>();
        this.index = 0;
    }

    public Medicine addComponent(MedComponent component) {
        components.add(component);
        return this;
    }

    @Override
    public boolean hasNext(){
//        return components.iterator().hasNext();
        return index < components.size();
    }

    @Override
    public MedComponent next() {
//        return components.iterator().next();
        return components.get(index++);
    }
    @Override
    public String toString(){
        return "Medicine: " + components.toString();
    }
}
