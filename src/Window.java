public class Window {
    double weight;
    int height;
    int width;
    Producer producer;

    //zdefinuimy konstruktor ustawiający wszystkie pola
    //jednym z parametrów konstruktora będzie obiekt
    Window(double weight, int height, int width, Producer producer){
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.producer = producer;
    }
}
