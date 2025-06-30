package homeworks.java.cosmo.string;

/**
 * Нужно привести строку с полным именем к инициалам.
 * Например, "Носов Алексей Олегович" будет иметь вид: "Н.А.О."
 * Носов Алексей Олегович -> Н.А.О.
 * <p>
 * Подсказка: используйте методы .split() и .charAt() класса String
 */
public class ExH {
    public static void main(String[] args) {
        String fullName = "Носов Алексей Олегович";
        String [] splitInput = fullName.split(" ");
        StringBuilder resultBuilder = new StringBuilder();
        for (String str : splitInput) {
            resultBuilder.append(str.charAt(0)).append(".");
        }
        String result = resultBuilder.toString();
        System.out.println(result);
    }
}
