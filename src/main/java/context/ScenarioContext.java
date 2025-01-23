package context;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class ScenarioContext {

    private Map<String, Object> contextData;

    public ScenarioContext() {
        contextData = new ConcurrentHashMap<>();
    }

    public void setContext(String key, Object value) {
        contextData.put(key, value);
    }

    public Object getContext(String key) {
        return contextData.get(key);
    }

    public boolean containsKey(String key) {
        return contextData.containsKey(key);
    }
}
