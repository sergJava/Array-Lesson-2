public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int[] expensesPerWeek = {23_500, 22_000, 24_000, 26_500, 21_200};
        int sum = 0;
        for (int i : expensesPerWeek) {
            sum +=i;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей.\n\n", sum);


        System.out.println("Task 2");

        int min = expensesPerWeek[1];
        for (int expense : expensesPerWeek) {
            if(expense < min) {
                min = expense;
            }
        }

        int max = expensesPerWeek[1];
        for (int expense : expensesPerWeek) {
            if(expense > max) {
                max = expense;
            }
        }

        System.out.printf("Минимальная сумма трат за неделю составила %d рублей.\n", min);
        System.out.printf("Максимальная сумма трат за неделю составила %d рублей.\n\n", max);


        System.out.println("Task 3");
        float avg = 0.0f;
        avg = (float) sum / expensesPerWeek.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n\n", avg);


        System.out.println("Task 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}