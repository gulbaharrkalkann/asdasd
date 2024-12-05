package Factory;

public class Oracle implements IDatabase{
    @Override
    public void selectData(){
        System.out.println("Oracle veri tabanından veri çekme işlemi gerçekleştirildi");
    }
    @Override
    public void insertData(){
        System.out.println("Oracle veri tabanına veri ekleme işlemi gerçekleştirildi");
    }
}
