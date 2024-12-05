package OOP.MaceraOyunu;

import java.util.Scanner;

public class Game {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Macera Oyununa hoşgeldiniz");
        System.out.println("Lütfen bir isim giriniz : ");
        String playerName = scanner.nextLine();

        Player player = new Player(playerName);
        System.out.println("Sayın" + player.getName() + " Bu karanlık ve sisli adaya Hoşgeldiniz.");
        System.out.println("Lütfen bir karakter seçiniz.");
        player.selectChar();
        Location location=null;
        while (true) {
player.printInfo();
            System.out.println("Bölgeler");
            System.out.println("1-Güvenli Ev -->Burası sizin için güvenli bir ev,Düşman yoktur");
            System.out.println("2-Mağaza -->Silah veya zırh satın alabilirsiniz.");
            System.out.println("0- Çıkış Yap --> Oyundan çıkış yapılıyor");
            System.out.print("Gitmek istediğiniz bölgeyi seçiniz :");
            int selectLocation = scanner.nextInt();
            switch (selectLocation) {
                case 0:
                    location=null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }
            if (location==null){
                System.out.println("Bu karanlık ve sisli adadan çabuk vazgeçtin");
                break;
            }
            if (!location.onLocation()){
                System.out.println("Game Over");
                break;
            }

        }
    }
}
