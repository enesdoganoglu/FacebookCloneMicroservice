package com.enes.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LoginRequestDto {
    @NotEmpty
    @Size(min = 3)
    String username;
    @NotBlank
    @Size(min = 8)
    String password;

}
