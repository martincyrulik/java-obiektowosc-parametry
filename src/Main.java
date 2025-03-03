/**
 * Wywołując metodę lub konstruktor przekazujemy argumenty wywołania.
 * Java odmiennie zachowuje się w przypadku typów prostych i typów obiektowych.
 *
 * typy proste - przekazaywana jest wartość zmiennej (kopiowanie wartości)
 * typy obiektowe - przekazywana jest referencja do obiektu -> wskazanie na obiekt
 */

public class Main {
    public static void main(String[] args) {

        //Stworzę producenta oraz okna, których będzie producentem.

        char[] name = {'d','r','u','t','e','x'};
        Producer p = new Producer(name, 1231231231);
        Window w1 = new Window(55.5, 180, 60, p);
        Window w2 = new Window(61.3, 210, 40, p);

        //W oknach w1 i w2 następuje przekazanie referencji przechowywanej w 'p'.
        //W każdym oknie w1 i w2, producent będzie wskazywał na ten sam obiekt.
        //Mamy aż 3 referencje do tego samego obiektu.

        //Wyświetlenie wysokości okna drugiego:
        System.out.println(w2.height);

        //Wyświetlenie nipu producenta okna pierwszego:
        System.out.println(w1.producer.nip);

        //Widzimy że obiekt w1 przechowuje w sobie inny obiekt, więc przechodzimy dalej
        //za pomocą kolejnej kropki, aby dostać się do nipu producenta tegoż okna.
    }
}
