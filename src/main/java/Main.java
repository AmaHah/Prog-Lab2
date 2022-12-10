import Pokemons.*;
import ru.ifmo.se.pokemon.*;
public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Petilil("Большой Шлёппа", 50);
        Pokemon p2 = new Heatmor("Патрик Бейман", 1);
        Pokemon p3 = new Lilligant("Игорь Войтенко", 50);
        Pokemon p4 = new Budew("Тони", 50);
        Pokemon p5 = new Roselia("Маленький Шлёппа", 50);
        Pokemon p6 = new Roserade("Райан Гослинг из фильма Драйв", 50);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}

