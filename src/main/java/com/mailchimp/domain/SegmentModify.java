package com.mailchimp.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
/**
 * @author eamoralesl
 */

@Data
public class SegmentModify {
    @JsonProperty("members_to_add")
    private List<String> membersToAdd = null;

    @JsonProperty("members_to_remove")
    private List<String> membersToRemove = null;

}
