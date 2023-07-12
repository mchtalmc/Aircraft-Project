package projeler.ucakprojesi;

public class Methods extends Depo {

    private static void yas() {

        System.out.println("İsminizi Giriniz");
        yolcuIsim = scan.next();

        System.out.println("Soyisminizi Giriniz");
        yolcuSoyisim = scan.next();

        System.out.println("Yasinizi Giriniz");
        yolcuYas = scan.next();

        if (Integer.parseInt(yolcuYas) < 12) {

            toplam = (uzaklik * kmFiyat) * (0.5);

        } else if (12 < Integer.parseInt(yolcuYas) && Integer.parseInt(yolcuYas) < 24) {

            toplam = (uzaklik * kmFiyat) * (0.9);

        } else if (Integer.parseInt(yolcuYas) > 65) {

            toplam = (uzaklik * kmFiyat) * (0.7);

        } else {
            toplam = (uzaklik * kmFiyat);
        }

        System.out.println("Sayın " + yolcuIsim.toUpperCase() + " " + yolcuSoyisim.toUpperCase());

        System.out.println(binilecekSehir + " den " + inilecekSehir + " 'e gidiyorsunuz.\nÖdemeniz Gereken Tutar = " + toplam + " TL \nİyi Yolculuklar");

        menu();


    }

    private static void yas1() {


        System.out.println("İsminizi Giriniz");
        yolcuIsim = scan.next();

        System.out.println("Soyisminizi Giriniz");
        yolcuSoyisim = scan.next();

        System.out.println("Yasinizi Giriniz");
        yolcuYas = scan.next();

        if (Integer.parseInt(yolcuYas) < 12) {

            toplam = (uzaklik * kmFiyat) * (0.5) * 2;

        } else if (12 < Integer.parseInt(yolcuYas) && Integer.parseInt(yolcuYas) < 24) {

            toplam = (uzaklik * kmFiyat) * (0.9) * 2;

        } else if (Integer.parseInt(yolcuYas) > 65) {

            toplam = (uzaklik * kmFiyat) * (0.7) * 2;

        } else {
            toplam = (uzaklik * kmFiyat * 2);
        }

        System.out.println("Sayın " + yolcuIsim.toUpperCase() + " " + yolcuSoyisim.toUpperCase());

        System.out.println(binilecekSehir + " den " + inilecekSehir + " 'e gidiyorsunuz.\nÖdemeniz Gereken Tutar = " + toplam + " TL \nİyi Yolculuklar");

        menu();


    }

    private static void hesaplama() {

        if (ucusSecim.equals("1")) {

            tekyonHesaplama();

        } else if (ucusSecim.equals("2")) {

            ciftyonHesaplama();

        }

    }

    private static void ciftyonHesaplama() {


        int a = 0;


        for (String w : sehirList) {

            if (binilecekSehir.equals(w) && inilecekSehir.equals(w)) {
                System.out.println("Gecersiz Secim");
                a = 1;
            }


        }

        if (a == 1) {

            inme();
        }


        if (binilecekSehir.equals(sehirList.get(0)) && inilecekSehir.equals(sehirList.get(1))) {

            uzaklik = abUzaklik;

        } else if (binilecekSehir.equals(sehirList.get(0)) && inilecekSehir.equals(sehirList.get(2))) {

            uzaklik = aCUzaklik;

        } else if (binilecekSehir.equals(sehirList.get(0)) && inilecekSehir.equals(sehirList.get(3))) {

            uzaklik = aDUzaklik;

        } else if (binilecekSehir.equals(sehirList.get(1)) && inilecekSehir.equals(sehirList.get(0))) {

            uzaklik = abUzaklik;

        } else if (binilecekSehir.equals(sehirList.get(1)) && inilecekSehir.equals(sehirList.get(2))) {

            uzaklik = bCUzaklik;
        } else if (binilecekSehir.equals(sehirList.get(1)) && inilecekSehir.equals(sehirList.get(3))) {

            uzaklik = bDUzaklik;

        } else if (binilecekSehir.equals(sehirList.get(2)) && inilecekSehir.equals(sehirList.get(0))) {

            uzaklik = aCUzaklik;

        } else if (binilecekSehir.equals(sehirList.get(2)) && inilecekSehir.equals(sehirList.get(1))) {

            uzaklik = bCUzaklik;

        } else if (binilecekSehir.equals(sehirList.get(2)) && inilecekSehir.equals(sehirList.get(3))) {

            uzaklik = cDUzaklik;

        } else if (binilecekSehir.equals(sehirList.get(3)) && inilecekSehir.equals(sehirList.get(0))) {

            uzaklik = aDUzaklik;

        } else if (binilecekSehir.equals(sehirList.get(3)) && inilecekSehir.equals(sehirList.get(1))) {

            uzaklik = bDUzaklik;

        } else if (binilecekSehir.equals(sehirList.get(3)) && inilecekSehir.equals(sehirList.get(2))) {

            uzaklik = cDUzaklik;

        }

        yas1();


    }

    private static void tekyonHesaplama() {


        int a = 0;


        for (String w : sehirList) {

            if (binilecekSehir.equals(w) && inilecekSehir.equals(w)) {
                System.out.println("Gecersiz Secim");
                a = 1;
            }


        }

        if (a == 1) {

            inme();
        }


        if (binilecekSehir.equals(sehirList.get(0)) && inilecekSehir.equals(sehirList.get(1))) {

            uzaklik = abUzaklik;

        } else if (binilecekSehir.equals(sehirList.get(0)) && inilecekSehir.equals(sehirList.get(2))) {

            uzaklik = aCUzaklik;

        } else if (binilecekSehir.equals(sehirList.get(0)) && inilecekSehir.equals(sehirList.get(3))) {

            uzaklik = aDUzaklik;

        } else if (binilecekSehir.equals(sehirList.get(1)) && inilecekSehir.equals(sehirList.get(0))) {

            uzaklik = abUzaklik;

        } else if (binilecekSehir.equals(sehirList.get(1)) && inilecekSehir.equals(sehirList.get(2))) {

            uzaklik = bCUzaklik;
        } else if (binilecekSehir.equals(sehirList.get(1)) && inilecekSehir.equals(sehirList.get(3))) {

            uzaklik = bDUzaklik;

        } else if (binilecekSehir.equals(sehirList.get(2)) && inilecekSehir.equals(sehirList.get(0))) {

            uzaklik = aCUzaklik;

        } else if (binilecekSehir.equals(sehirList.get(2)) && inilecekSehir.equals(sehirList.get(1))) {

            uzaklik = bCUzaklik;

        } else if (binilecekSehir.equals(sehirList.get(2)) && inilecekSehir.equals(sehirList.get(3))) {

            uzaklik = cDUzaklik;

        } else if (binilecekSehir.equals(sehirList.get(3)) && inilecekSehir.equals(sehirList.get(0))) {

            uzaklik = aDUzaklik;

        } else if (binilecekSehir.equals(sehirList.get(3)) && inilecekSehir.equals(sehirList.get(1))) {

            uzaklik = bDUzaklik;

        } else if (binilecekSehir.equals(sehirList.get(3)) && inilecekSehir.equals(sehirList.get(2))) {

            uzaklik = cDUzaklik;

        }

        yas();


    }


    private static void ciftyon() {

        binme();


    }

    private static void tekyon() {

        binme();


    }


    private static void binme() {
        System.out.println("Ucaginiz Binis Yerini Seciniz\n 1-Antalya \n 2-Bursa \n 3-Canakkale \n 4-Denizli");
        secim = scan.next();
        switch (secim) {
            case "1":
                binilecekSehir = sehirList.get(0);
                inme();
            case "2":
                binilecekSehir = sehirList.get(1);
                inme();
            case "3":
                binilecekSehir = sehirList.get(2);
                inme();
            case "4":
                binilecekSehir = sehirList.get(3);
                inme();
            default:
                System.out.println("Yanlis Secim Yaptiniz");
                binme();
        }
    }

    private static void inme() {

        System.out.println("Ucaginiz Inis Yerini Seciniz\n 1-Antalya \n 2-Bursa \n 3-Canakkale \n 4-Denizli");
        secim = scan.next();

        switch (secim) {
            case "1":
                inilecekSehir = sehirList.get(0);
                hesaplama();
            case "2":
                inilecekSehir = sehirList.get(1);
                hesaplama();
            case "3":
                inilecekSehir = sehirList.get(2);
                hesaplama();
            case "4":
                inilecekSehir = sehirList.get(3);
                hesaplama();
            default:
                System.out.println("Yanlis Secim Yaptiniz");
                inme();
        }
    }

    public static void menu() {


        System.out.println("*******HOSGELDINIZ*******\n 1-Tek Yon \n 2-Cift Yon");

        secim = scan.next();

        ucusSecim = secim;


        switch (ucusSecim) {

            case "1":
                tekyon();

            case "2":
                ciftyon();
            default:
                System.out.println("Yanlis Giris Yaptiniz");
                menu();

        }

        binme();


    }

}



