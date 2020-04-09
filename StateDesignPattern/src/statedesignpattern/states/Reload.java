package statedesignpattern.states;

import statedesignpattern.IEnemyAI;

public class Reload extends AbstractState {

    public Reload(IEnemyAI gamePlayer) {
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
    }

    @Override
    public void low_ammo() {
    }

    @Override
    public void full_ammo() {
        System.out.println("Full Ammo..");
        gamePlayer.setCurrentState(new Attack(gamePlayer));
        System.out.println("Attack..");
    }

}
