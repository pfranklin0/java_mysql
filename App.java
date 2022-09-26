package pf.java_mysql;

public class App
{
    public static void main(String[] args) throws Exception
    {
        Database database = Database.connect();
        int sum = database.sumInt("id", "data");
        database.disconnect();
        System.out.println("ok");
    }
}
