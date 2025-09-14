public class Droid {
    String name;
    int batteryLevel;

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

//    **** When you pass an object into System.out.println(), the toString() method is automatically called ****
    public String toString() {
        return "Hello, I am " + name;
    }

    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
    }

    public void batteryReport() {
        System.out.println("Battery Level: " + batteryLevel + "%");
    }

    public void energyTransfer(Droid chargerDroid, int transferPercent) {
        System.out.println("Transferring energy from " + chargerDroid.name + " to " + name);
        chargerDroid.batteryLevel -= transferPercent;
        batteryLevel += transferPercent;

        System.out.println(name + "'s battery is now " + batteryLevel + "%");
        System.out.println(chargerDroid.name + "'s battery is now " + chargerDroid.batteryLevel + "%");
    }

}
