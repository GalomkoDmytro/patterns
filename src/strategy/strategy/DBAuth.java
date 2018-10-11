package strategy.strategy;

public class DBAuth implements AuthStrategy {
    private Object dbRef; // reference to DB
    private String dbUrl;

    public DBAuth(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    private void createConnection(String dbUrl) {
        // dbRef...
    }

    @Override
        public boolean checkLogin(String name, String password) {
        System.out.println("Check with db...");
        String userHash = getHesh(name);
        String passHash = getHesh(password);

        return checkUser(userHash, passHash);
    }

    private boolean checkUser(String name, String password) {
        // check with dbRef
        return true;
    }

    private String getHesh(String value) {
        return "O2DA3DDDS";
    }
}
