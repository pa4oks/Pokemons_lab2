package moves;

import ru.ifmo.se.pokemon.*;

public class HammerArm  extends PhysicalMove {
    public HammerArm() {
        super(Type.FIGHTING, 100, 10);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage){ //def - обороняющийся покемон, damage - расчетное повреждение
        super.applyOppDamage(def, damage);
        Effect e = new Effect().turns(1).stat(Stat.SPEED, -1);
    }
    @Override
    protected String describe() {
        return "атакует HammerArm";
    }

}
