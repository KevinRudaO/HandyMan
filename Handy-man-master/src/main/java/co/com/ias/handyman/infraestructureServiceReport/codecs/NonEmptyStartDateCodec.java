package co.com.ias.handyman.infraestructureServiceReport.codecs;

import co.com.ias.handyman.applicationServiceReport.commons.NonEmptyStartDate;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;
@JsonComponent
public class NonEmptyStartDateCodec {
    public static class nonEmptyStartDateEncoder extends JsonSerializer<NonEmptyStartDate>{

        @Override
        public void serialize(NonEmptyStartDate nonEmptyStartDate, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            jsonGenerator.writeString(nonEmptyStartDate.getStartDate());
        }
    }
    public static class nonEmptyStartDateDecoder extends JsonDeserializer<NonEmptyStartDate>{

        @Override
        public NonEmptyStartDate deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            final String valueAsString = jsonParser.getValueAsString();
            return new NonEmptyStartDate(valueAsString);
        }
    }
}
