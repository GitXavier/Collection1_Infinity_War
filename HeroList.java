import java.util.*;

public class HeroList {


    public static void main(String[] args) {

        Hero blackWindow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero vision = new Hero("Vision", 3);
        Hero ironMan = new Hero("Iron Man", 48);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero thor = new Hero("Thor", 1500);
        Hero hulk = new Hero("Hulk", 49);
        Hero doctorStrange = new Hero("doctor String", 42);

        ArrayList<Hero> heroes = new ArrayList<>();
        heroes.add(blackWindow);
        heroes.add(captainAmerica);
        heroes.add(vision);
        heroes.add(ironMan);
        heroes.add(scarletWitch);
        heroes.add(thor);
        heroes.add(hulk);
        heroes.add(doctorStrange);

        System.out.println("Original list: ");
        for(Hero hero : heroes) {
                System.out.println("Nom: " + hero.getName() + " | Age: " + hero.getAge());
        }

        System.out.println(" ");
        System.out.println("Happy Birthday Thor: ");
        heroes.get(5).setAge(1501);
        System.out.println("Nom: " + heroes.get(5).getName() + " | Age: " + heroes.get(5).getAge());


        System.out.println(" ");
        System.out.println("Random List: ");
        Collections.shuffle(heroes);
        for(Hero hero : heroes) {
            System.out.println("Nom: " + hero.getName() + " | Age: " + hero.getAge());
        }

        System.out.println(" ");
        System.out.println("Living Heroes List: ");

        List<Hero> heroesSubList = heroes.subList(0, heroes.size() / 2);

        for(Hero hero : heroesSubList) {
            System.out.println("Nom: " + hero.getName() + " | Age: " + hero.getAge());
        }
    }
}