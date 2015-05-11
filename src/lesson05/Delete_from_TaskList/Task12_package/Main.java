package lesson05.Delete_from_TaskList.Task12_package;

import java.util.Random;

/**
 * Написать код, который разделит список объектов Developer на N отдельных списка для Juniors, Seniors и тд. Вывести списки на экран
 */
public class Main {
    public static void main(String[] args) {

        Developer[] developers = new Developer[20];
        int countjunior = 0, countsenior = 0, counterteam = 0;
        StringBuilder sb;
        Random random = new Random();

        for (int i = 0; i < developers.length; i++) {
            int counter = random.nextInt(3);
            switch (counter) {
                case 0:
                    developers[i] = new JuniorDeveloper("Junior" + 1, random.nextInt(500), 3);
                    countjunior++;
                    break;
                case 1:
                    developers[i] = new SeniorDeveloper("Senior" + 1, random.nextInt(500) + 1000, 7);
                    countsenior++;
                    break;
                case 2:
                    developers[i] = new TeamLeadDeveloper("TeamLead" + 1, random.nextInt(500) + 2000, 10);
                    counterteam++;
                    break;
            }
        }

        int jun = 0, sen = 0, team = 0;
        Developer[] juniors = new Developer[countjunior];
        Developer[] seniors = new Developer[countsenior];
        Developer[] teamleads = new Developer[counterteam];

        for (Developer d : developers) {
            if (d instanceof JuniorDeveloper) {
                juniors[jun] = d;
                jun++;
            }
            if (d instanceof SeniorDeveloper) {
                seniors[sen] = d;
                sen++;
            }
            if (d instanceof TeamLeadDeveloper) {
                teamleads[team] = d;
                team++;
            }
        }

        for (Developer d : juniors) {
            sb = new StringBuilder() // !!!
                    .append(d.getName())
                    .append(": ")
                    .append(d.getBasicSalary())
                    .append(" -> ")
                    .append(d.getSalary());

            System.out.println(sb.toString());
        }

        for (Developer d : seniors) {
            sb = new StringBuilder() // !!!
                    .append(d.getName())
                    .append(": ")
                    .append(d.getBasicSalary())
                    .append(" -> ")
                    .append(d.getSalary());

            System.out.println(sb.toString());
        }

        for (Developer d : teamleads) {
            sb = new StringBuilder() // !!!
                    .append(d.getName())
                    .append(": ")
                    .append(d.getBasicSalary())
                    .append(" -> ")
                    .append(d.getSalary());

            System.out.println(sb.toString());
        }

    }
}
