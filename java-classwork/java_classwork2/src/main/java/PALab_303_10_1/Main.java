package PALab_303_10_1;

// Superclass Monster
class Monster{
    // Method to attack (to be overridden by subclasses)
    public void attack() {
        System.out.println("This is a generic monster attack.");
    }
}

// Subclass FireMonster
class FireMonster extends Monster {
    // Override attack method with specific implementation for FireMonster
    @Override
    public void attack() {
        System.out.println("Fire monster attacks with flames!");
    }
}

// Subclass WaterMonster
class WaterMonster extends Monster {
    // Override attack method with specific implementation for WaterMonster
    @Override
    public void attack() {
        System.out.println("Water monster attacks with water jets!");
    }
}

// Subclass StoneMonster
class StoneMonster extends Monster {
    // Override attack method with specific implementation for StoneMonster
    @Override
    public void attack() {

    System.out.println("Stone monster attacks by throwing rocks!");
    }
}

// Main class to demonstrate polymorphism
public class Main {
    public static void main(String[] args) {
        // Declare instances of the superclass
        Monster fireMonster = new FireMonster();
        Monster waterMonster = new WaterMonster();
        Monster stoneMonster = new StoneMonster();

        // Substitute superclass instances with subclass objects
        // and invoke the method defined in the superclass
        fireMonster.attack(); // Output specific to FireMonster
        waterMonster.attack(); // Output specific to WaterMonster
        stoneMonster.attack(); // Output specific to StoneMonster
    }
}

