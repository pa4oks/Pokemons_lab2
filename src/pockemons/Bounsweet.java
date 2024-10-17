package pockemons;

import moves.Facade;
import moves.TeeterDance;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Type;

public class Bounsweet extends Pokemon {
    public Bounsweet(String name, int level) {
       super(name, level); //инициализация названия и уровня
        setType(Type.GRASS);
        setStats(42, 30, 38, 30, 38, 32); // hp att def spec att spec def speed

        Facade facade = new Facade();
        TeeterDance teeterdance = new TeeterDance();
        super.setMove(facade);
        super.setMove(teeterdance);
    }
}
