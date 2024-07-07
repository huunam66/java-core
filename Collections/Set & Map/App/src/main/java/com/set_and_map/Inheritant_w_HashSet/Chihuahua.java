package com.set_and_map.Inheritant_w_HashSet;

public class Chihuahua extends Dog {

    public Chihuahua() {
        this(null);
    }

    public Chihuahua(String name) {
        super(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;

        if (obj instanceof Chihuahua) {
            String name = ((Chihuahua) obj).getName();
            return name.equalsIgnoreCase(this.getName());
        }

        return false;
    }
}
