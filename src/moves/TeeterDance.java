package moves;

import ru.ifmo.se.pokemon.*;

import java.awt.*;

public class TeeterDance extends StatusMove {
    public TeeterDance(){
        super(Type.NORMAL, 0, 20);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.confuse(p);
    }
    @Override
    protected String describe() {
        return "атакует TeeterDance";
    }
}
