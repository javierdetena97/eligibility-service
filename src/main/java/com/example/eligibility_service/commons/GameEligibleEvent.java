package com.example.eligibility_service.commons;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GameEligibleEvent {
    private Integer id;
    private String name;
    private Integer userId;
    private boolean isEligible;
}
