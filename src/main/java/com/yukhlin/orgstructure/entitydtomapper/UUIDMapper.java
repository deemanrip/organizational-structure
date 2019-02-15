package com.yukhlin.orgstructure.entitydtomapper;

import java.util.UUID;

public class UUIDMapper {

    public String asString(UUID uuid) {
        return uuid.toString();
    }

    public UUID asUUID(String uuid) {
        return UUID.fromString(uuid);
    }
}