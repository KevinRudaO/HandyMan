package co.com.ias.handyman.infraestructureServiceReport.codecs;

import co.com.ias.handyman.applicationServiceReport.domain.ServiceIdentification;
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
public class ServiceIdentificationCodec {

    public static class serviceIdentificationSerializer extends JsonSerializer<ServiceIdentification>{

        @Override
        public void serialize(ServiceIdentification serviceIdentification, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            jsonGenerator.writeString(serviceIdentification.getServiceId());
        }
    }
    public static class serviceIdentificationDeserializer extends JsonDeserializer<ServiceIdentification>{

        @Override
        public ServiceIdentification deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            final String value= jsonParser.getValueAsString();
            return new ServiceIdentification(value);
        }
    }
}
