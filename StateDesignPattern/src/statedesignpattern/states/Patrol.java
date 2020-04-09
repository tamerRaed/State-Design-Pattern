package statedesignpattern.states;

import statedesignpattern.IEnemyAI;

public class Patrol extends AbstractState {

    public Patrol(IEnemyAI gamePlayer) {
        super(gamePlayer);
    }

    @Override
    public void no_health() {
        System.out.println("No Health!");
        gamePlayer.setCurrentState(null);
        System.out.println("Game Over :(");
        gamePlayer.setCurrentState(new Patrol(gamePlayer));
    }

    @Override
    public void low_health() {
    }

    @Override
    public void full_health() {
    }

    @Override
    public void player_approaches() {
        System.out.println("Player Approaches...");
        gamePlayer.setCurrentState(new Attack(gamePlayer));
        System.out.println("Attack!");
    }

    @Override
    public void player_run() {
    }

    @Override
    public void low_ammo() {
    }

    @Override
    public void full_ammo() {
    }

}
