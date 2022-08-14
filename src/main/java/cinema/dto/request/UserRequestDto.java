package cinema.dto.request;

import cinema.lib.FieldsValueMatch;
import cinema.lib.ValidEmail;
import javax.validation.constraints.Size;
import java.util.List;

@FieldsValueMatch(
        field = "password",
        fieldMatch = "repeatPassword",
        message = "Passwords do not match!"
)
public class UserRequestDto {
    @ValidEmail
    private String email;
    @Size(min = 8, max = 40)
    private String password;
    private String repeatPassword;
    private List<Long> roleIds;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public List<Long> getRoleIds() {
        return roleIds;
    }
}