package com.set_and_map.Inheritant_w_HashSet;

public class Dog {

    private String name;

    public Dog() {
        this(null);
    }

    public Dog(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;

        if (obj instanceof Dog) {
            String name = ((Dog) obj).getName();
            return name.equalsIgnoreCase(this.getName());
        }

        return false;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
