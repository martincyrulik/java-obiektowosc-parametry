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
        Window w3 = new Window(56.5, 145, 70, p);
        Window w4 = new Window(50.0, 154, 55, p);
        Window w5 = new Window(71.5, 95, 86, p);
        Window w6 = new Window(74,50, 126, p);
        Window w7 = new Window( 89, 215, 61, p);

        Repository r = new Repository();
        r.addWindow(w1);
        r.addWindow(w2);
        r.addWindow(w3);
        r.addWindow(w4);
        r.addWindow(w5);
        r.addWindow(w6);
        r.addWindow(w7);

        //W oknach w1 i w2 następuje przekazanie referencji przechowywanej w 'p'.
        //W każdym oknie w1 i w2, producent będzie wskazywał na ten sam obiekt.
        //Mamy aż 3 referencje do tego samego obiektu.



        //Wyświetlenie wysokości okna drugiego:
        System.out.print("Wysokość drugiego okna: ");
        System.out.print(w2.height);
        System.out.println();

        //Wyświetlenie nipu producenta okna pierwszego:
        System.out.print("NIP producenta pierwszego okna: ");
        System.out.print(w1.producer.nip);
        System.out.println();

        //Widzimy że obiekt w1 przechowuje w sobie inny obiekt, więc przechodzimy dalej
        //za pomocą kolejnej kropki, aby dostać się do nipu producenta tegoż okna.

        //wyświetlmy teraz wszystkie okna i ich parametry:
        System.out.println("----------------------------");
        System.out.println("Wszystkie okna w naszym magazynie okien: ");
        for (Window w : r.windows){
            System.out.print("weight: "+ w.weight + ", height: "+ w.height + ", width: " + w.width);
            System.out.println();
            System.out.print("Producent: ");
            for (char c : w.producer.name){
                System.out.print(c);
            }
            System.out.print(", NIP: " + w.producer.nip);
            System.out.println();
            System.out.println("------------------------------");
        }


        //Spróbujmy znaleźć okno o wysokości 50 cm i wyświetlmy jego wagę
        Window findedWindow = r.findWindow(50);
        System.out.println(findedWindow.weight);
    }
}
