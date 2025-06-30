package homeworks.java.cosmo.string;

/**
 * Дана строка: ”Где мои деньги?”.
 * Необходимо собрать предложение в обратном порядке: “Деньги мои где?”.
 * Где мои деньги? -> Деньги мои где?
 * <p>
 * Подсказка: используйте методы .split(), .trim(), .replace() и .replaceFirst() класса String
 */
public class ExG {
    public static void main(String[] args) {
        String input = "Где мои деньги?";
        String [] splitInput = input.split(" ");
        StringBuilder resultBuilder = new StringBuilder();

        splitInput[2] = splitInput[2].replaceFirst("д", "Д")
                .replace("?", "");
        splitInput[0] = splitInput[0].toLowerCase().concat("?");

        for(int i = splitInput.length - 1; i >= 0; i--) {
            resultBuilder.append(splitInput[i]).append(" ");
        }
        String result = resultBuilder.toString().trim();
        System.out.println(result);
    }
}