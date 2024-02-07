package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Table table1 = new Table("Stół dębowy ludwik", 1, "black");
        Table table2 = new Table("rzeźbiona konsola", 4, "gold");

        System.out.println("informacje o obiektach:");
        System.out.printf("%s, ilość nóg: %d, kolor: %s\n", table1.name, table1.numberOfLegs, table1.color);
        System.out.printf("%s, ilość nóg: %d, kolor: %s\n", table2.name, table2.numberOfLegs, table2.color);
    }
}
