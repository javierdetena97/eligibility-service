package com.example.eligibility_service.commons;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GameCreatedEvent {
    private Integer id;
    private String name;
    private Integer userId;
}
