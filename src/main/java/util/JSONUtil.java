package util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import model.Booking;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public class JSONUtil<T extends Serializable> {

    private final ObjectMapper MAPPER = enableMapper();

    public JSONUtil(){
    }

    public void toJsonFile(String filePath, T entity) {
        try {
            String entityJson = MAPPER.writeValueAsString(entity);
            FileUtil.toNewFile(filePath, entityJson);
        } catch (JsonProcessingException jpe) {
            LoggerUtil.LOGGER.error(jpe.getMessage());
        }
    }

    public void toJsonFile(String filePath, Collection<T> entities) {
        try {
            String entityJson = MAPPER.writeValueAsString(entities);
            FileUtil.toNewFile(filePath, entityJson);
        } catch (JsonProcessingException jpe) {
            LoggerUtil.LOGGER.error(jpe.getMessage());
        }
    }

    public List<T> fromJsonFile(String filePath) {
        try (InputStream fileInputStream = new FileInputStream(filePath)) {
            List<T> entities = MAPPER.readValue(fileInputStream, new TypeReference<List<T>>(){});
            fileInputStream.close();
            return entities;
        } catch (IOException e) {
            LoggerUtil.LOGGER.error(e.getMessage());
        }
        return null;
    }

    public T fromJsonFile(String filePath, Class<T> entityClass) {
        try (InputStream fileInputStream = new FileInputStream(filePath)) {
            return MAPPER.readValue(fileInputStream, entityClass);
        } catch (IOException ex) {
            LoggerUtil.LOGGER.error(ex.getMessage());
        }
        return null;
    }

    private ObjectMapper enableMapper() {
        return new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
    }

    public List<Booking> fromJSONFile(String filePath) {
        try (InputStream fileInputStream = new FileInputStream(filePath)) {
            List<Booking> entities = MAPPER.readValue(fileInputStream, new TypeReference<List<Booking>>(){});
            fileInputStream.close();
            return entities;
        } catch (IOException e) {
            LoggerUtil.LOGGER.error(e.getMessage());
        }
        return null;
    }
}
