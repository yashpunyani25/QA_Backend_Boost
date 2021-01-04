package mySQL;

public class dbConfig {

    String url;
    String user;
    String password;

    public dbConfig(String baseUrl, String dbName, String user, String password) {
        this.url = baseUrl + dbName;
        this.user = user;
        this.password = password;
        System.out.println("\nDB URL: " + url);
    }

}
