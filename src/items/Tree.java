package items;

/**
 * Created by jonwrona on 11/22/16.
 */
public enum Tree {
    TREE(new int[]{38788, 38785, 38733});

    private final int[] ids;
    Tree(int[] ids) {
        this.ids = ids;
    }

    public int[] getIds() {
        return ids;
    }
}
