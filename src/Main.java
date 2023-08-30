public class Main {
    public static void main(String[] args) {


        Iphone iphone13 = new Iphone();

        System.out.println("==============================");
        System.out.println("Iphone 13");
        System.out.println("==============================");


        System.out.println("Opening browser");

        iphone13.displayPages();
        iphone13.addTab();
        iphone13.removeTab();
        iphone13.updatePage();

        System.out.println("Closing browser");

        System.out.println("==============================");


        System.out.println("Opening Music Player");

        iphone13.playMusic();
        iphone13.pauseMusic();
        iphone13.selectMusic();

        System.out.println("Closing Music Player");

        System.out.println("==============================");


        System.out.println("Opening Phone");


        iphone13.call();
        iphone13.answer();
        iphone13.reject();

        iphone13.startvoiceMail();


        System.out.println("Closing Phone");


        System.out.println("==============================");












    }
}