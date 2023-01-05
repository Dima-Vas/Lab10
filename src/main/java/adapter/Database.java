package adapter;

public class Database extends БазаДаних{

    public Database() {
        super();
    }

    public String getUserData() {
        return super.отриматиДаніКористувача();
    }

    public String getStatisticsData() {
        return super.отриматиСтатистичніДані();
    }
}
