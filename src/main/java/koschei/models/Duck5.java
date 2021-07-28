package koschei.models;

public class Duck5 {

    private Egg6 edd;

    public Duck5(Egg6 edd) {
        this.edd = edd;
    }

    @Override
    public String toString() {
        return ", в утке яйцо " + edd.toString();
    }
}
