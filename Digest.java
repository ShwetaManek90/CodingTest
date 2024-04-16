import java.util.HashMap;
import java.util.Map;

public abstract class Digest {
    private Map<byte[], byte[]> cache = new HashMap<>();

    public byte[] digest(byte[] input) {
        byte[] result = cache.get(input);
        if (result == null) {
            synchronized (cache) {
                // repeated and code if-else
                result = cache.get(input);
                if (result == null) {
                    try {
                        result = doDigest(input);
                        cache.put(input, result);

                    } catch (RuntimeException ex) {
                        // Error on Line 21 of original code
                        /* LoggerFactory.getLogger("Digest").error("Unable to make Digest"); */
                        throw ex;
                    }
                }
            }
        }
        return result;
    }

    protected abstract byte[] doDigest(byte[] input);
}
