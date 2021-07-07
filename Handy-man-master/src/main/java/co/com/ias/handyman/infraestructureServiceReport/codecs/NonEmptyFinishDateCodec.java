package co.com.ias.handyman.infraestructureServiceReport.codecs;

import co.com.ias.handyman.applicationServiceReport.commons.NonEmptyFinishDate;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.time.LocalDateTime;
@JsonComponent
public class NonEmptyFinishDateCodec {
    public static class finishDateEncoder extends JsonSerializer<NonEmptyFinishDate>{

        @Override
        public void serialize(NonEmptyFinishDate nonEmptyFinishDate, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            jsonGenerator.writeString(nonEmptyFinishDate.getFinishDate());
        }
    }
    public static class finishDateDecoder extends JsonDeserializer<NonEmptyFinishDate>{

        @Override
        public NonEmptyFinishDate deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            final String valueAsString = jsonParser.getValueAsString();
            return new NonEmptyFinishDate(valueAsString);
        }
    }
}
