import static java.util.Objects.nonNull;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }
    //В классе Account задай проверки: длина, наличие пробела в начале или конце строки.
    // Используй методы класса String.
    // Например, для проверки длины — name.length() >= 3.
    public boolean checkNameToEmboss() throws Exception {

        if (
                        !name.isBlank() &&
                        (name.length() >= 3) &&
                        (name.length() <= 19) &&
                        name.matches("^[a-zA-Z]+\\s[a-zA-Z]*$") ||
                        name.matches("^[A-Я][а-я]+\\s[A-Я][а-я]*$")) {
            return true;
        } else {
            return false;
        }
    }
}