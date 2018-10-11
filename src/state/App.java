package state;

import state.context.TransformerContext;
import state.state.FireState;
import state.state.MoveState;
import state.state.TransformerState;

public class App {

    public static void main(String[] args) {
        TransformerContext context = new TransformerContext();

        TransformerState fireState = new FireState();
        TransformerState moveState = new MoveState();

        context.setState(fireState);
        context.action();

        context.setState(moveState);
        context.action();


    }
}
