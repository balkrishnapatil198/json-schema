package Controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@RestController
@RequestMapping("/schemas")
public class SchemaController {

    @GetMapping("/user")
    public ResponseEntity<String> getUserSchema() throws IOException {
        ClassPathResource resource = new ClassPathResource("schemas/user-schema.json");
        String content = new String(resource.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
        return ResponseEntity.ok().body(content);
    }
}





