package lesson18.Task6_package;

import java.util.Scanner;

/**
 * В файле хранится список серверов. Надо проверить какие из серверов доступны в данный момент и создать отчет в формате сервер=статус.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь к файлу: ");
        String path = scanner.nextLine();
        ServersAvailability servers = new ServersAvailability(path);
        servers.serversstatus();
    }
}
