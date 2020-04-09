
package statedesignpattern.states;

import statedesignpattern.IEnemyAI;

public abstract class AbstractState implements IState{
    IEnemyAI gamePlayer;

    public AbstractState(IEnemyAI gamePlayer) {
        this.gamePlayer = gamePlayer;
    }
    
}
