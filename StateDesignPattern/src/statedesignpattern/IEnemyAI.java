package statedesignpattern;

import statedesignpattern.states.IState;

public interface IEnemyAI {
    
    public void player_approaches();
    
    public void player_run();
    
    public void health_low();
    
    public void health_full();
    
    public void health_no();
    
    public void ammo_full();
    
    public void ammo_low();
    
    public void setCurrentState(IState state);
}
