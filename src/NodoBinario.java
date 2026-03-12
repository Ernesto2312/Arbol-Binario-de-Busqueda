public class NodoBinario<E extends Comparable<E>> {

    E info;
    NodoBinario<E> parent;
    NodoBinario<E> left;
    NodoBinario<E> right;

    public NodoBinario(E info, NodoBinario<E> parent) {
        this.info = info;
        this.parent = parent;
        this.left = null;
        this.right = null;
    }

    public E getInfo() {
        return info;
    }
}