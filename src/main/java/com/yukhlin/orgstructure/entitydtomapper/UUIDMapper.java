package com.yukhlin.orgstructure.entitydtomapper;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UUIDMapper {

    public String asString(UUID uuid) {
        return uuid == null ? null : uuid.toString();
    }

    public UUID asUUID(String uuid) {
        return uuid == null ? null : UUID.fromString(uuid);
    }
}