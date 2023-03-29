package w3.zadania.Ostry;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ZAD 1
//        ArrayList<Integer> tablica = new ArrayList<>();
//        ArrayList<Double> tablicaZpotega = new ArrayList<>();
//        for (int i=0;i<10;i++) {
//            Integer element =scanner.nextInt();
//            tablica.add(element);
//        }
//        for (int i=0;i<10;i++){
//            tablicaZpotega.add(Math.pow(tablica.get(i),i));
//        }
//        System.out.println(tablica);
//        System.out.println(tablicaZpotega);


        //ZAD 3
//        int[] tablica1 = new int[10];
//        Arrays.fill(tablica1,0);
//
//        int[] tablica2 = new int[10];
//        for(int i=0;i<10;i++){
//            int j=scanner.nextInt();
//            tablica2[i]=j;
//        }
//        Arrays.sort(tablica2);
//        for (int i : tablica2) {
//            System.out.println(i);
//        }


        //ZAD 4
//        ArrayList<String> tablicaImion = new ArrayList<>(10);
//        for(int i=0;i<10;i++){
//            String j =scanner.next();
//            j=j.substring(0,1).toUpperCase()+j.substring(1).toLowerCase();
//            if (tablicaImion.contains(j)){
//                System.out.println("to imie juz jest");
//            } else {
//                tablicaImion.add(j);
//            }
//        }
//        Collections.sort(tablicaImion);
//        tablicaImion.remove(0);
//        for (String i:
//             tablicaImion) {
//            System.out.println(i);
//        }


        //ZAD 5
//        File plik = new File("/Users/ostry/Programowanie/java/Wyklady z javy dod/Wyklad3Zadania/src/main/java/org/example/trivia.txt"); //dodaj path zwojego pliku trivia
//        Map<String,Integer> gra= new HashMap<>();
//
//        for (int i=1;i<15;i++){
//            if (i%2 ==1 ) {
//                gra.put(Files.readAllLines(Paths.get(plik.getPath())).get(i), Integer.valueOf(Files.readAllLines(Paths.get(plik.getPath())).get(i+1)));
//                }
//        }
//        String wyjdz;
//        do {
//            float wynik = 0;
//            for (String i : gra.keySet()) {
//                System.out.println(i);
//                int odpowiedzUser = scanner.nextInt();
//                if (odpowiedzUser == gra.get(i)) {
//                    wynik += 1;
//                }
//            }
//            float wynikWprocentach = Math.round((wynik / gra.size()) * 100);
//            if (wynikWprocentach >= 95) {
//                System.out.println("Brawo dostałeś 6, twoj wynik to " + wynikWprocentach + "%");
//            } else if (wynikWprocentach >= 85) {
//                System.out.println("Brawo dostałeś 5, twoj wynik to " + wynikWprocentach + "%");
//            } else if (wynikWprocentach >= 75) {
//                System.out.println("Brawo dostałeś 4, twoj wynik to " + wynikWprocentach + "%");
//            } else if (wynikWprocentach >= 65) {
//                System.out.println("Brawo dostałeś 3, twoj wynik to " + wynikWprocentach + "%");
//            } else if (wynikWprocentach >= 55) {
//                System.out.println("Dostałeś 2, twoj wynik to " + wynikWprocentach + "%");
//            } else {
//                System.out.println("Dostałeś 1, twoj wynik to " + wynikWprocentach + "%");
//            }
//            System.out.println("Jeśli chcesz wyjść z gierki kliknij q, jeśli nie, kliknij cokolwiek");
//            wyjdz = scanner.next();
//        }while (!wyjdz.equals("q"));


    }


}