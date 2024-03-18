package com.lawrencejews.springbootrestfulwebservices.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Schema(
        description = "UserDto model information"
)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;
    @Schema(description = "User First Name")
    private String firstName;
    @Schema(description = "User Last Name")
    private String lastName;
    @Schema(description = "User Email Address")
    private String email;

}
