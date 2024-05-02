package com.openclassroom.ChaTop.payload.request;

import lombok.Data;

import jakarta.validation.constraints.*;

@Data
public class SignupRequest {
  @NotBlank
  @Size(max = 50)
  @Email
  private String email;

  @NotBlank
  @Size(min = 3, max = 20)
  private String name;


  @NotBlank
  @Size(min = 6, max = 40)
  private String password;
}