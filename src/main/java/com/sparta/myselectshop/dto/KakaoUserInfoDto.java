package com.sparta.myselectshop.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Getter
@NoArgsConstructor
public class KakaoUserInfoDto {

    private Long id;
    private String nickname;
    private String email;

    public KakaoUserInfoDto(Long id ,String nickname, String email) {
        this.id = id;
        this.nickname = nickname;
        this.email = email;
    }

}
