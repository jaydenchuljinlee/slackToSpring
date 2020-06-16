package com.example.slackDemo.slack.domain.dto;

import com.example.slackDemo.slack.domain.SlackMessage;
import com.example.slackDemo.slack.domain.SlackMessageAttachment;
import com.example.slackDemo.slack.domain.enums.SlackEndpoint;
import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Slf4j
@AllArgsConstructor
@Component
public class SlackDTO {

    private RestTemplate restTemplate;

    public boolean notify(SlackEndpoint endpoint, SlackMessageAttachment message) {

        log.debug("notify [endpoiont : {}, message : {}]",endpoint,message);

        SlackMessage slackMessage = SlackMessage.builder().channel(endpoint.getChannel())
                                        .attachments(Lists.newArrayList(message)).build();

        try {

            restTemplate.postForEntity(endpoint.getWebhookUrl(), slackMessage, String.class);
            return true;
        } catch (Exception e) {

            log.error("Occur Exception : {}", e);

            return false;
        }
    }
}
