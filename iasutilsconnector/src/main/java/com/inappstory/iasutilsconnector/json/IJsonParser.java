package com.inappstory.iasutilsconnector.json;

public interface IJsonParser {
    <T> T fromJson(String json, Class<T> typeOfT);
}
