package Factory;

public class Mssql implements IDatabase {
    @Override
    public void selectData(){
        System.out.println("Mssql veri tabanından veri çekme işlemi gerçekleştirildi");
    }
    @Override
    public void insertData(){
        System.out.println("Mssql veri tabanına veri ekleme işlemi gerçekleştirildi.");
    }
}
