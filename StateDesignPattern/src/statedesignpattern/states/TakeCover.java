package statedesignpattern.states;

import statedesignpattern.IEnemyAI;

public class TakeCover extends AbstractState {

    public TakeCover(IEnemyAI gamePlayer) {
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
        System.out.println("Full Health..");
        gamePlayer.setCurrentState(new Attack(gamePlayer));
        System.out.println("Attack..");
    }

    @Override
    public void player_approaches() {
    }

    @Override
    public void player_run() {
    }

    @Override
    public void low_ammo() {
        System.out.println("Low Ammo!");
        gamePlayer.setCurrentState(new Reload(gamePlayer));
        System.out.println("Reload..");
    }

    @Override
    public void full_ammo() {
    }

}
