package mapsStream;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companies = new HashMap<>();
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] commandLine = command.split(" -> ");
            String company = commandLine[0];
            String employeeID = commandLine[1];

            if (!companies.containsKey(company)) {
                List<String> employees = new ArrayList<>();
                employees.add(employeeID);
                companies.put(company, employees);
            }
            if (companies.containsKey(company) && !companies.get(company).contains(employeeID)) {
                companies.get(company).add(employeeID);
            }
            command = scanner.nextLine();
        }
        companies.entrySet().stream().sorted((a, b) -> a.getKey().compareTo(b.getKey()))
                .forEach(entry -> {
                            System.out.printf("%s%n", entry.getKey());
                            entry.getValue().forEach(element -> System.out.printf("-- %s%n", element));
                        }
                );
    }
}
