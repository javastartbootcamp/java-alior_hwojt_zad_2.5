package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Table table1 = new Table();
        table1.name = "Stół dębowy ludwik";
        table1.numberOfLegs = 1;
        table1.color = "black";

        Table table2 = new Table();
        table2.name = "rzeźbiona konsola";
        table2.numberOfLegs = 4;
        table2.color = "gold";

        System.out.println("informacje o obiektach:");
        System.out.printf("%s, ilość nóg: %d, kolor: %s\n", table1.name, table1.numberOfLegs, table1.color);
        System.out.printf("%s, ilość nóg: %d, kolor: %s\n", table2.name, table2.numberOfLegs, table2.color);
    }
}
