package com.twodevsstudio.simplejsonconfig.def.adapters;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import lombok.SneakyThrows;

public class ClassAdapter implements JsonSerializer<Class<?>>, JsonDeserializer<Class<?>> {

  @SneakyThrows
  @Override
  public Class<?> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    return Class.forName(json.getAsString());
  }

  @Override
  public JsonElement serialize(Class<?> src, Type typeOfSrc, JsonSerializationContext context) {
    return context.serialize(src.getName());
  }
}
