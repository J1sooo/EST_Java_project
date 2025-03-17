package Quiz0314;

public class Util {
    public static <T, K> K getValue(Pair<T, K> pair, T key){
        if (pair.getKey().equals(key)) {
            return pair.getValue();
        }
        return null;
    }
}
