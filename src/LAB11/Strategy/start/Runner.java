package LAB11.Strategy.start;

public class Runner {

    public static void main(String[] args) {
        // Create characters with different attack strategies
        Character warrior = new Character();
        Character mage = new Character();
        Character rogue = new Character();

        // Create enemies
        Enemy blackKiller = new Enemy();
        Enemy brownBiter = new Enemy();

        // Attack enemies with different characters
        warrior.attack(blackKiller);
        mage.attack(brownBiter);
        rogue.attack(blackKiller);
    }
}

//EXAMPLE OUTPUT:
//BLACK KILLER STRENGTH LEVEL IS: 75
//BROWN BITER STRENGTH LEVEL IS: 15
//BLACK KILLER STRENGTH LEVEL IS: 60