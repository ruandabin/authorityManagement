package top.ruandb.common;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JsonData {

	private boolean ret;
	private String msg;
	private Object data;
	public JsonData() {
	}
	public JsonData(boolean ret) {
		this.ret = ret ;
	}
	public static JsonData success(Object object, String msg) {
        JsonData jsonData = new JsonData(true);
        jsonData.data = object;
        jsonData.msg = msg;
        return jsonData;
    }

    public static JsonData success(Object object) {
        JsonData jsonData = new JsonData(true);
        jsonData.data = object;
        return jsonData;
    }

    public static JsonData success() {
        return new JsonData(true);
    }

    public static JsonData fail(String msg) {
        JsonData jsonData = new JsonData(false);
        jsonData.msg = msg;
        return jsonData;
    }
	
	public Map<String,Object> toMap(){
		Map<String,Object> map = new HashMap<>();
		map.put("ret", ret);
		map.put("msg", msg);
		map.put("data", data);
		return map ;
	}
}
