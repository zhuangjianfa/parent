package com.owner.common.utils;

import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * JSON 手工转换辅助类
 */
public class JsonMapper {

	private static final ObjectMapper objectMapper = new ObjectMapper();

	@SuppressWarnings("unchecked")
	public static Map<String, Object> objectToMap(Object obj) {
		
		return objectMapper.convertValue(obj, Map.class);
	}

	public static <T> String objToJson(T t) {
		try {
			objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			return objectMapper.writeValueAsString(t);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static <T> T jsonToObj(String json, Class<T> valueType) {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		try {
			return objectMapper.readValue(json, valueType);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
