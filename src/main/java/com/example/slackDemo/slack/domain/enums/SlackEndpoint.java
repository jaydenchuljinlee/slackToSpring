package com.example.slackDemo.slack.domain.enums;

import lombok.Getter;

@Getter
public enum SlackEndpoint {

    INCOMINT("https://hooks.slack.com/services/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","webhook-test");

    String webhookUrl;
    String channel;

    SlackEndpoint(String webhookUrl, String channel) {
        this.webhookUrl = webhookUrl;
        this.channel = channel;
    }
}
