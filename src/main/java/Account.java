public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }


    //В классе Account задай проверки: длина, наличие пробела в начале или конце строки.
    // Используй методы класса String.
    // Например, для проверки длины — name.length() >= 3.
    public boolean checkNameToEmboss(String name) {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        return  name.contains(name);
    }
}