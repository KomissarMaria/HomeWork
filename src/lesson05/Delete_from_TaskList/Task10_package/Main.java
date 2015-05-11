package lesson05.Delete_from_TaskList.Task10_package;

import java.util.Random;

/**
 * Создать список разработчиков и заполнить его случайным образом. Вывести на экран только Senior developer-ов с зарплатой больше 1500 у.е
 */
public class Main {
    public static void main(String[] args) {

        StringBuilder sb;

        Developer[] developers = new Developer[10];
        Random random = new Random();
        for (int i = 0; i < developers.length; i++) {
            int who = random.nextInt(3);
            switch (who) {
                case 0:
                    developers[i] = new JuniorDeveloper("Junior N" + i, random.nextInt(500), random.nextInt(3));
                    break;
                case 1:
                    developers[i] = new SeniorDeveloper("Senior N" + i, random.nextInt(500) + 500, random.nextInt(10));
                    break;
                case 2:
                    developers[i] = new TeamLeadDeveloper("TeamLead N" + i, random.nextInt(500) + 1000, random.nextInt(15));
                    break;
            }
        }

        for (Developer d : developers) {
            if (d.getSalary() > 1500 && d instanceof SeniorDeveloper) {
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
}
