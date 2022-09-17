public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        {
            String firstName;
            firstName = "Ivan";

            String middleName = "Ivanovich";
            String lastName = "Ivanov";

            String fullName = lastName + " " + firstName + " " + middleName;
            System.out.println("ФИО сотрудника — " + fullName);
        }
    }
    public static void task2() {
        var firstName = "Ivan";
        var middleName = "Ivanovich";
        var lastName = "Ivanov";
        var fullName = String.format("%s %s %s", lastName, firstName, middleName);
        var result = fullName.toUpperCase();
        System.out.printf("Данные ФИО сотрудника для заполнения отчета — %s", result);
    }
    public static void task3() {
        var fullName = "Иванов Семён Семёнович";
        var result = fullName.replace("ё","е");
        System.out.printf("Данные ФИО сотрудника — %s", result);
    }
}