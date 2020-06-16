package com.example.slackDemo.slack.domain;

import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SlackMessage {

    private String text;
    private String channel;
    private List<SlackMessageAttachment> attachments;

    public void addAttechment(SlackMessageAttachment attachment) {

        if (this.attachments == null) {
            this.attachments = Lists.newArrayList();
        }

        this.attachments.add(attachment);
    }
}
