package example.chapter2;

import java.lang.ref.Cleaner;

public class CleanObject implements AutoCloseable {

    private static final Cleaner cleaner = Cleaner.create();

    private static class CleanData implements Runnable {

        @Override
        public void run() {
            // clean
        }
    }

    private final CleanData cleanData;
    private final Cleaner.Cleanable cleanable;

    public CleanObject() {
        this.cleanData = new CleanData();
        this.cleanable = cleaner.register(this,cleanData);
    }

    @Override
    public void close() {
        cleanable.clean();
    }
}
