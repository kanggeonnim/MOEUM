package com.b301.moeum.music.dto;

public record MetaDataRequest(
        int bpm,
        String musicKey,
        String vibe,
        String instrument
) {
}
