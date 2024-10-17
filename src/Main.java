import pockemons.Bounsweet;
import pockemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle a = new Battle();
        Bounsweet sweet = new Bounsweet("Мармеладка", 1);
        Tsareena tsareena = new Tsareena("Царевна", 1);
        Steenee steenee = new Steenee("Биг Босс", 1);
        Steelix steelix = new Steelix("Сталевар", 1);
        Onix onix = new Onix("Камешек", 1);
        Regice regice = new Regice("Льдинка", 1);
        a.addAlly(sweet);
        a.addAlly(tsareena);
        a.addAlly(steenee);
        a.addFoe(onix);
        a.addFoe(steelix);
        a.addFoe(regice);
        a.go();
    }
}
