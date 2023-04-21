import java.util.Random;

public class card {
    int hp;
    int mana;
    int dmg;
    String element;

    public int getHp() {
        return hp;
    }

    public int setHp() {
        mana = getMana();
        int hp = 0;
        if (mana == 1) {
            hp = 10;
        }

        if (mana == 2) {
            hp = 15;
        }

        if (mana == 3) {
            hp = 20;
        }

        return this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana() {
        int mana = Random (1,3);
        this.mana = mana;
    }

    public int getDmg() {
        return dmg;
    }

    public int setDmg() {
        int mana = getMana();
        int dmg = 0;

        if (mana == 1) {
            dmg = Random(1, 10);
        }

        if (mana == 2) {
            dmg = Random(10, 20);
        }

        if (mana == 3) {
            dmg = Random(20, 100);
        }
        return this.dmg = dmg;
    }

    public String getElement() {
        return element;
    }

    public void setElement() {
        int i = Random(1,5);
        String[] elementlist = {"Water", "Fire", "Air", "Earth", "Star"};
        this.element = elementlist[i];
    }

    public int Random(int min, int max) {
        int min_nub = min;
        int max_nub = max;
        Random rand = new Random();
        int rndnumb = rand.nextInt(max_nub - min_nub) + min_nub;
        return rndnumb;
    }
    public void setDmg(int dmg) {
        this.dmg = dmg;
    }
}