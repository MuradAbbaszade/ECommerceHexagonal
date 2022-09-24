package account.model;

import lombok.Builder;
import lombok.Data;
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
