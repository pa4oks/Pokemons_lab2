package moves;

import ru.ifmo.se.pokemon.*;

public class DoubleEdge extends PhysicalMove{
    public DoubleEdge(){
        super(Type.NORMAL, 120, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage){ //def - обороняющийся покемон, damage - расчетное повреждение
        super.applyOppDamage(def, damage);
    }
    protected void applySelfDamage(Pokemon p, double damage){
        super.applySelfDamage(p, damage/3);
    }
    @Override
    protected String describe() {
        return "атакует DoubleEdge";
    }
}
