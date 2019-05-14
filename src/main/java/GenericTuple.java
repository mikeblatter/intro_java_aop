// Add if using Serializable
// import java.io.Serializable;

// Append " extends Serializable" to <K
public class GenericTuple<K, V>
{
    private final K k;
    private final V v;

    public GenericTuple(K key, V value) {
        k = key;
        v = value;
    }

    public String toString() {
        return String.format("%s: '%s'", k, v);
    }
}
