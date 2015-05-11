package lesson05.Task8_package;

/**
 * Расширить иерархию классами Person и HR. Провести рефакторинг, выделить общие свойства в суперклассы
 */
public class Task_person {
    public static void main(String[] args) {
        Developer[] list = {
                new JuniorDeveloper("Mike", 500, 0),
                new JuniorDeveloper("Dima", 500, 1),
                new JavaJuniorDeveloper("Vova", 500, 2, "Java"),
                new SeniorDeveloper("Jack", 500, 5),
                new TeamLeadDeveloper("Robby", 500, 7)
        };
        StringBuilder sb;

        for (Developer d : list) {
            sb = new StringBuilder() // !!!
                    .append(d.getName())
                    .append(": ")
                    .append(d.getBasicSalary())
                    .append(" -> ")
                    .append(d.getSalary());

            System.out.println(sb.toString());
        }

        Person[] people = {
                new JuniorDeveloper("Mike", 500, 0),
                new JuniorDeveloper("Dima", 500, 1),
                new JavaJuniorDeveloper("Vova", 500, 2, "Java"),
                new SeniorDeveloper("Jack", 500, 5),
                new TeamLeadDeveloper("Robby", 500, 7),
                new HR("Marina")
        };

        for (Person d : people) {
            sb = new StringBuilder() // !!!
                    .append(d.getName());

            System.out.println(sb.toString());
        }

    }
}
