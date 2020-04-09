package statedesignpattern.states;

public interface IState {

    public void no_health();

    public void low_health();

    public void full_health();

    public void player_approaches();

    public void player_run();

    public void low_ammo();

    public void full_ammo();

}
