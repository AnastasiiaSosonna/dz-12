package man.woman;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Danylo", "Boiko", 30, true);
        Woman woman = new Woman("Iryna", "Duda", 25, true);

        woman.registerPartnership(man);

        System.out.println(woman.getLastName());
        System.out.println(woman.getPartnership());

        woman.deregisterPartnership();
        System.out.println(woman.getLastName());
        System.out.println(woman.getPartnership());
    }
}