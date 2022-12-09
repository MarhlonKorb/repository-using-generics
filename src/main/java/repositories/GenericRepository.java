package repositories;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Optional;

/**
 * Classe que representa um repositório de acesso a dados que pode ser genérico
 * @param <T>
 */
public class GenericRepository<T> {
    
    // Mock do banco de dados
    private static final HashMap<String, String> database = new HashMap<>();
    
    private ObjectMapper objectMapper;
    
    /**
     * Construtor da classe
     * @param objectMapper
     */
    public GenericRepository (ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }
    
    /**
     * Método que efetua o salvamento do objeto no banco de dados
     * @param key
     * @param value
     * @throws JsonProcessingException
     */
    public void save(String key, T value) throws JsonProcessingException {
        // Converte o corpo do objeto(T value) para o formato JSON
        var data = objectMapper.writeValueAsString(value);
        // salva o objeto no banco de dados
        database.put(key, data);
    }
    
    /**
     * Retorna o objeto de acordo com a chave informada e a classe do objeto
     * @param key
     * @param clazz
     * @return Optional<T>
     * @throws JsonProcessingException
     */
    public Optional<T> get(String key, Class<T> clazz) throws JsonProcessingException {
        var data = database.get(key);
        var mapperToClass = objectMapper.readValue(data, clazz);
        return Optional.of(mapperToClass);
    }
}
