import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        Hero blackWindow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero vision = new Hero("Vision", 3);
        Hero ironMan = new Hero("Iron Man", 48);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero thor = new Hero("Thor", 1500);
        Hero hulk = new Hero("Hulk", 49);
        Hero doctorStrange = new Hero("doctor String", 42);

        // TODO 2 : Add those heroes to the list
        ArrayList<Hero> heroes = new ArrayList<>();
        heroes.add(blackWindow);
        heroes.add(captainAmerica);
        heroes.add(vision);
        heroes.add(ironMan);
        heroes.add(scarletWitch);
        heroes.add(thor);
        heroes.add(hulk);
        heroes.add(doctorStrange);

        // TODO 3 : It's Thor birthday, now he's 1501
        heroes.get(5).setAge(1501);

        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);

        // TODO 5 : Keep only the half of the list
        List<Hero> heroesSubList = heroes.subList(0, heroes.size() / 2);

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for(Hero hero : heroesSubList) {
            System.out.println("Nom: " + hero.getName() + " | Age: " + hero.getAge());
        }
    }
}
