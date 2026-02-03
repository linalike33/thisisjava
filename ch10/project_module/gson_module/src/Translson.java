import com.google.gson.Gson;

import java.lang.reflect.Type;

public class Translson {
    private final Gson gson ;

    public Translson() {
        this.gson = new Gson();
    }

    public String toJsonStringFromObject(Object obj) {
        return this.gson.toJson(obj);
    }

    public Object toObjectFromJsonString(String str, Type type) {
        return this.gson.fromJson(str, type);
    }
}
