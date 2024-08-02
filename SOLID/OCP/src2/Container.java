import java.util.HashMap;
import java.util.Map;

public class Container {
    private Map<String, Class<?>> services = new HashMap<>();

    public <T> void register(String name, Class<T> implementation) {
        services.put(name, implementation);
    }

    public <T> T resolve(String name) {
        Class<?> implementation = services.get(name);
        if (implementation == null) {
            throw new RuntimeException("Service not found: " + name);
        }
        try {
            return (T) implementation.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to instantiate service: " + name, e);
        }
    }
}
