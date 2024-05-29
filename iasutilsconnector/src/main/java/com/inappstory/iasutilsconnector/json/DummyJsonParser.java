package com.inappstory.iasutilsconnector.json;

public class DummyJsonParser implements IJsonParser {
    @Override
    public <T> T fromJson(String json, Class<T> typeOfT) {
        return null;
    }
}
