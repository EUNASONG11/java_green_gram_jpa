package com.green.greengramver.user.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Schema(title = "로그인 응답")
public class UserSignInRes {
    private long userId;
    private String pic;
    private String nickName;
    private String accessToken;
}
