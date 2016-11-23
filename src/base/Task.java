package base;

import org.powerbot.script.ClientAccessor;
import org.powerbot.script.ClientContext;

/**
 * Created by jonwrona on 11/22/16.
 */
public abstract class Task<C extends ClientContext> extends ClientAccessor<C> {
    public Task(C ctx) {
        super(ctx);
    }

    public abstract boolean activate();
    public abstract void execute();
}
