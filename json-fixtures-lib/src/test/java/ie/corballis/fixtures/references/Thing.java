package ie.corballis.fixtures.references;

public class Thing {
    private String name;
    private Owner owner;

    public Thing(String name, Owner owner) {
        this.name = name;
        this.owner = owner;
    }

    public Thing() {
    }

    @Override
    public String toString() {
        return "Thing:" +
               "\n\tname = " + name +
               ",\n\towner's name = " + owner.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Thing thing = (Thing) o;
        if (name != null ? !name.equals(thing.name) : thing.name != null) {
            return false;
        }
        return !(owner != null ? !owner.getName().equals(thing.owner.getName()) : thing.owner != null);
    }
}