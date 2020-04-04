package pl.novaczek.projekty.gry;

public class GuessNumberGame00  {
​
        // (1) Utwórz metodę main, aby dało się to cholerstwo
        // w ogóle uruchomić
        public static void main(String[] args) {
            // (2) Przygotuj dane testowe
            int a = 9;
            int result;
​
            // (3) Wywołaj metodę tak jakbyś chiał/a jej użyć
            result = cube(a);   // (4) Przejdź kursorem na czerwony
            // kolor i naciśnij alt + enter
            // Potwierdź utworzenie metody
​
            // (8) Jak wszystko się kompiluje,
            // to uruchom maina (upewnij się, że uruchamiasz
            // właściwego maina) i sprawdź czy to dobry wynik:
            System.out.println(result);
        }
​
        // (5) Jeżeli nie skorzystałeś/aś z alt + enter
        // napisz samodzielnie metodę, która robić coś
        // bezsensu ale się skompiluje!!!!!
        private static int cube(int a) {
            // (6) Zakomentuj głupiego returna jeżeli
            // metoda coś zwraca i napisz mądry kod
//        return 0;
            // (7) Zaimplementuj poprawne rozwiązanie
            return a * a * a;
        }
    }
}
