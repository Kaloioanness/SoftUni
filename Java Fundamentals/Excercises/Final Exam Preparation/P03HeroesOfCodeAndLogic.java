package JavaFundamentals.FinalExamPrep;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class P03HeroesOfCodeAndLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> heroesHP = new LinkedHashMap<>();
        Map<String, Integer> heroesMP = new LinkedHashMap<>();

        int countHeroes = Integer.parseInt(scanner.nextLine());
        for (int hero = 1; hero <= countHeroes; hero++) {
            String heroInfo = scanner.nextLine();

            String[] heroData = heroInfo.split("\\s+");
            String heroName = heroData[0];
            int hp = Integer.parseInt(heroData[1]);
            int mp = Integer.parseInt(heroData[2]);

            if (hp <= 100) {
                heroesHP.put(heroName, hp);
            }
            if (mp <= 200) {
                heroesMP.put(heroName, mp);
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String [] commandParts = command.split("\\s+-\\s+");
            String commandName = commandParts[0];
            String heroName = commandParts[1];

            switch (commandName) {
                case "CastSpell":
                    int mpNeeded = Integer.parseInt(commandParts[2]);
                    String spellName = commandParts[3];
                    int currentMP = heroesMP.get(heroName);


                    if (currentMP >= mpNeeded) {
                        int mpLeft = currentMP - mpNeeded;
                        heroesMP.put(heroName, mpLeft);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, mpLeft);
                    }
                    else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":

                    int damage = Integer.parseInt(commandParts[2]);
                    String attacker = commandParts[3];

                    int currentHP = heroesHP.get(heroName);
                    currentHP -= damage;

                    if (currentHP > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, currentHP);
                        heroesHP.put(heroName, currentHP);
                    }

                    else {
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                        heroesHP.remove(heroName);
                        heroesMP.remove(heroName);
                    }
                    break;
                case "Recharge":

                    int amount = Integer.parseInt(commandParts[2]);
                    int currentMPHero = heroesMP.get(heroName);

                    currentMPHero += amount;

                    if(currentMPHero > 200) {
                        currentMPHero = 200;
                    }

                    System.out.printf("%s recharged for %d MP!%n", heroName, currentMPHero - heroesMP.get(heroName));
                    heroesMP.put(heroName, currentMPHero);
                    break;
                case "Heal":

                    int amountHeal = Integer.parseInt(commandParts[2]);
                    int currentHPHero = heroesHP.get(heroName);

                    currentHPHero += amountHeal;

                    if (currentHPHero > 100) {
                        currentHPHero = 100;
                    }
                    System.out.printf("%s healed for %d HP!%n", heroName, currentHPHero - heroesHP.get(heroName));
                    heroesHP.put(heroName, currentHPHero);

                    break;
            }
            command = scanner.nextLine();
        }

        heroesHP.entrySet()
                .forEach(entry -> {
                    String heroName = entry.getKey();
                    System.out.println(heroName);
                    System.out.println(" HP: " + entry.getValue());
                    System.out.println(" MP: " + heroesMP.get(heroName));
                });
    }
}
