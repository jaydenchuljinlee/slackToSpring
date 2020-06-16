package com.example.slackDemo.slack.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SlackMessageAttachment {

    private String color;
    private String pretext;
    private String title;
    private String title_link;
    private String text;
}
