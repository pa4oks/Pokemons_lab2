package pockemons;

import moves.FrostBreath;
import moves.HammerArm;
import moves.Swagger;
import moves.ZapCannon;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Regice extends Pokemon {
    public Regice(String name, int level) {
        super(name, level);
        setType(Type.ICE);
        setStats(80, 50, 100, 100, 200, 50);
        ZapCannon zapcannon = new ZapCannon();
        HammerArm hammerarm = new HammerArm();
        Swagger swagger = new Swagger();
        FrostBreath frostbreath = new FrostBreath();
        super.setMove(swagger);
        super.setMove(frostbreath);
        super.setMove(zapcannon);
        super.setMove(hammerarm);
    }
}
