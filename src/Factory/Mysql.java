package Factory;

public class Mysql implements IDatabase{
    @Override
    public void selectData(){
        System.out.println("Mysql veri tabanında veri çekme işlemi gerçekleştirildi");
    }
    @Override
    public void insertData(){
        System.out.println("Mysql veri tababına veri ekleme işlemi gerçekleşmiştir");
    }
}
