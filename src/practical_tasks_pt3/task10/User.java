package practical_tasks_pt3.task10;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        new Query(login, password).printToLog();
    }

    public class Query {
        private String login;
        private String password;

        public Query(String login, String password) {
            this.login = login;
            this.password = password;
        }

        public void printToLog() {
            System.out.println("Пользователь " + login + " (" + password + ") отправил запрос");
        }
    }

    public static void main(String[] args) {
        User user = new User("Anton", "1234asdasd");
        user.createQuery();

        Query query = user.new Query("practical_tasks_pt3.task10.User", "null");
        query.printToLog();

        Query query2 = new User("asdasdads", "null").new Query("null", "null");
        query2.printToLog();
    }

}