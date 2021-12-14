package com.nttdata.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("yanki")
public class Yanki {

    @Id
    private String id;
    private String idType;
    private String phone;
    private String email;
    private String imei;
    private String balance;
    private String cardId;
}
