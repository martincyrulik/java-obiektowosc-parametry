/**
 * Załóżmy, że mamy klasę o nazwie 'Repository',
 * która przechowuje tablicę okien o nazwie 'windows'.
 * Jest to swego rodzaju magazyn okien.
 * Klasa Repository posiada też metody: addWindow, findWindow.
 *
 * Metoda findWindow przyjmuje jako parametry wysokość.
 *      * Szuka pierwszego okna w tablicy, które ma określloną
 *      *  wartość, a następnie zwraca ją jako wynik działania.
 */



public class Repository {

    Window[] windows = new Window[7];       //magazyn okien

    //utworzę teraz metodę findWindow, która szuka okna o określonej wysokości,
    //a następnie zwraca to znalezione okno jako wynik swego działania.
    Window findWindow(int height){
        Window findedWindow = null;     //ustawiamy na null, na wypadek gdy nie znajdziemy
        for(Window w: windows){         //okna o danej wysokości
            if(w.height == height){
                findedWindow = w;
                break;         //przerywamy pętle for gdy już znajdziemy okno o zadanej wysokości
            }
        }
        return findedWindow;    //zwracamy znalezione okno
    }

    //utworzę teraz metodę addWindow
    int i = -1;
    Window addWindow(Window w){
        i++;
        windows[i] = w;
        return windows[i];
    }

}
