package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import objects.BillingAddress;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

public class JacksonUtils {

    public static BillingAddress deserializeJson() throws URISyntaxException, IOException {
        URL url = JacksonUtils.class.getClassLoader().getResource("billingAddress.json");
        assert url != null;
        URI uri = url.toURI();
        File src = Paths.get(uri).toFile();

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(src,BillingAddress.class);


    }


}
