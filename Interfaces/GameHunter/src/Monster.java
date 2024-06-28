import java.util.ArrayList;
import java.util.List;

public class Monster implements Isaver {

    private String name;
    private String type;
    private int level;
    private String weapon;


    public Monster() {
        this(null, null, 0, null);
    }

    public Monster(String name, String type, int level, String weapon) {
        this.setName(name);
        this.setType(type);
        this.setLevel(level);
        this.setWeapon(weapon);
    }

    @Override
    public void read() {
        List<String> lString = this.toList();
        if (lString == null) return;
        if (lString.size() <= 0) return;

        System.out.println("\n============ THE MONSTER ============");
        System.out.printf("\nName: %s", lString.get(0));
        System.out.printf("\nType: %s", lString.get(1));
        System.out.printf("\nLevel: %d", Integer.parseInt(lString.get(2)));
        System.out.printf("\nWeapon: %s", lString.get(3));
    }

    @Override
    public List<String> write(List<String> dataString) {
        if (dataString == null) return null;
        if (dataString.size() <= 0) return null;

        this.setName(dataString.get(0));
        this.setType(dataString.get(1));
        String level = dataString.get(2);
        this.setLevel(Integer.parseInt(level == null ? "0" : level));
        this.setWeapon(dataString.get(3));
        return this.toList();
    }

    @Override
    public List<String> toList() {
        List<String> lSting = new ArrayList<>();
        lSting.add(0, this.getName());
        lSting.add(1, this.getType());
        lSting.add(2, String.valueOf(this.getLevel()));
        lSting.add(3, this.getWeapon());
        return lSting;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
