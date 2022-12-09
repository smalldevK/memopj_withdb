package com.sparta.memopj.dto;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;

@Getter
public class PostRequestDto {
    private String title;
    private String username;
    private String password;
    private String contents;

}
