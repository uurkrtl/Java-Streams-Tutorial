public class Main {
    public static void main(String[] args) {
        System.out.println("Map (Namen in Großbuchstaben): " + StreamDemo.mapDemo());
        System.out.println("Filter (gerade Zahlen): " + StreamDemo.filterDemo());
        System.out.println("Collect (Früchte ohne Wiederholung): " + StreamDemo.collectDemo());
        System.out.println("Flat (flache Liste): " + StreamDemo.flatMapDemo());
        System.out.println("Reduce (Summe der Zahlen 1 bis 10): " + StreamDemo.reduceDemo());
        System.out.println("forEach (doppelt so viele Zahlen): " + StreamDemo.forEachDemo());
        System.out.println("Distinct (Früchte ohne Wiederholung): " + StreamDemo.distinctDemo());
        System.out.println("Sorted (sortierte Liste): " + StreamDemo.sortedDemo());
        System.out.println("Skip (letzte 3 Elemente): " + StreamDemo.skipDemo());
        System.out.println("Limit (erste 2 Elemente): " + StreamDemo.limitDemo());
        System.out.println("AnyMatch (Enthält die Liste 5?): " + StreamDemo.anyMatchDemo());
        System.out.println("NoneMatch (Enthält die Liste nicht 5?): " + StreamDemo.noneMatchDemo());
        System.out.println("AllMatch (Sind alle Zahlen in der Liste größer als Null?): " + StreamDemo.allMatchDemo());
    }
}