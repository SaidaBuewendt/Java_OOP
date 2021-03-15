package appl;

import interfaces.IPrintable;
import items.*;

public class MassMediaAppl {
    public static void main(String[] args) {
        Newspaper np1 = new Newspaper("Berliner Zeitung", 202101, 16);
        Newspaper np2 = new Newspaper("Die Welt", 20212, 28);
        Newspaper np3 = new Newspaper("Financial Times", 20213, 30);
        Journal journal1 = new Journal("Der Spiegel", 01, 70, false);
        Journal journal2 = new Journal("Vogue", 02, 170, true);
        Journal journal3 = new Journal("Tatler", 03, 150, true);
        NewsPortal portal1 = new NewsPortal("Meduza", "https://meduza.io");
        NewsPortal portal2 = new NewsPortal("RBC", "https://www.rbc.ru");
        WebSite ws1 = new WebSite("VK", "https://vk.com", "Pavel Durov");
        WebSite ws2 = new WebSite("Facebook", "https://www.facebook.com", "Mark  Zuckerberg");

        MassMedia[] ar = {np1, np2, np3, journal1, journal2, journal3, portal1, portal2, ws1, ws2};
        displayPrintable(ar);
        System.out.println("_______________");
        getPrintableElements(ar);


    }

    private static IPrintable[] getPrintableElements(MassMedia[] ar) {
        IPrintable[] arr = new IPrintable[ar.length];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] instanceof IPrintable) {
                arr[i] = (IPrintable) ar[i];
                System.out.println(arr[i]);
            }
        }
        return arr;
    }


    private static void displayPrintable(MassMedia[] ar) {
        System.out.println("Print edition: ");
        for (MassMedia element : ar) {
            if (element instanceof IPrintable) {
                IPrintable temp = (IPrintable) element;
                temp.print();
                System.out.println(element);
            }
        }
    }
}
