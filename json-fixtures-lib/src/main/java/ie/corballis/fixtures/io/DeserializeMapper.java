package ie.corballis.fixtures.io;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

public interface DeserializeMapper {

    <T> T convertValue(Object baseObjectMap, Class<T> type);

    <T> T convertValue(Object baseObjectMap, Type type);

    Type getFieldType(Field field);
}
