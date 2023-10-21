package kafka_demo.controllers;

import kafka_demo.dtos.UserDto;
import kafka_demo.services.JsonKafkaProducerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka-json")
public class JsonMessageController {

    private final JsonKafkaProducerService jsonKafkaProducerService;

    public JsonMessageController(JsonKafkaProducerService jsonKafkaProducerService) {
        this.jsonKafkaProducerService = jsonKafkaProducerService;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publishMessage(@RequestBody UserDto userDto){
        jsonKafkaProducerService.sendMessage(userDto);
        return new ResponseEntity<>("Json message sent (in controller)", HttpStatus.OK);
    }

}
