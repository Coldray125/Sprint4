public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

        if (name != null&&
                        !name.isBlank() &&
                        name.matches("^(?=.{3,18}$)[a-zA-ZA-Яа-я]*+\\s(?:[a-zA-ZA-Яа-я])*$"))
        {
            return true;
        } else {
            return false;
        }
    }
}