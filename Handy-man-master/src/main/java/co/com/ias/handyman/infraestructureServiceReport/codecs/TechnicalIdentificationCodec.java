package co.com.ias.handyman.infraestructureServiceReport.codecs;

import co.com.ias.handyman.applicationServiceReport.domain.TechnicalIdentification;
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
public class TechnicalIdentificationCodec {
    public static class technicalIdentificationEncoder extends JsonSerializer<TechnicalIdentification>{

        @Override
        public void serialize(TechnicalIdentification technicalIdentification, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            jsonGenerator.writeString(technicalIdentification.getTechnicalId());
        }
    }
    public static class technicalIdentificationDecoder extends JsonDeserializer<TechnicalIdentification>{

        @Override
        public TechnicalIdentification deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            final String valueAsString = jsonParser.getValueAsString();
            return new TechnicalIdentification(valueAsString);
        }
    }
}
