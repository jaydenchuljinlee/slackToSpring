package com.example.slackDemo.slack.controller;

import com.example.slackDemo.slack.domain.SlackMessageAttachment;
import com.example.slackDemo.slack.domain.dto.SlackDTO;
import com.example.slackDemo.slack.domain.enums.SlackEndpoint;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class SlacRequestController {

    private SlackDTO slackDTO;

    @PostMapping("/")
    public ResponseEntity<Boolean> send(@RequestBody SlackMessageAttachment message) {

        return ResponseEntity.ok(slackDTO.notify(SlackEndpoint.INCOMINT,message));
    }
}
