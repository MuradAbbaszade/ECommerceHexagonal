package account.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import role.model.Role;

@Builder
@Data
public class Account {
    private int id;
    private String name;
    private String password;
    private String email;
    private Role role;
}
