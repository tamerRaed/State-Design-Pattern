package statedesignpattern.states;

import statedesignpattern.IEnemyAI;

public class Attack extends AbstractState {

    public Attack(IEnemyAI gamePlayer) {
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
        System.out.println("Low Health!");
        gamePlayer.setCurrentState(new TakeCover(gamePlayer));
        System.out.println("Take Cover..");
    }

    @Override
    public void full_health() {
    }

    @Override
    public void player_approaches() {
    }

    @Override
    public void player_run() {
        System.out.println("Player Runs..");
        gamePlayer.setCurrentState(new Patrol(gamePlayer));
        System.out.println("Patrol");
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
