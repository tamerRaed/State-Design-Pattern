package statedesignpattern;

import statedesignpattern.states.IState;
import statedesignpattern.states.Patrol;

public class StateEnemyAI implements IEnemyAI {

    IState currentState = null;

    @Override
    public void setCurrentState(IState state) {
        this.currentState = state;
    }

    public StateEnemyAI() {
        System.out.println("Starting game..");
        System.out.println("Patrol...");
        this.setCurrentState(new Patrol(this));
    }

    @Override
    public void player_approaches() {
        this.currentState.player_approaches();
    }

    @Override
    public void player_run() {
        this.currentState.player_run();
    }

    @Override
    public void health_low() {
        this.currentState.low_health();
    }

    @Override
    public void health_full() {
        this.currentState.full_health();
    }

    @Override
    public void health_no() {
        this.currentState.no_health();
    }

    @Override
    public void ammo_full() {
        this.currentState.full_ammo();
    }

    @Override
    public void ammo_low() {
        this.currentState.low_ammo();
    }
}
