package pockemons;

import moves.PlayNice;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Steenee extends Bounsweet {
    public Steenee(String name, int level) {
        super(name, level);
        setType(Type.STEEL, Type.FLYING);
        setStats(52, 40, 48, 40, 48, 62);
        // hp att def spec att spec def speed
        PlayNice playnice = new PlayNice();
        super.setMove(playnice);
    }
}
