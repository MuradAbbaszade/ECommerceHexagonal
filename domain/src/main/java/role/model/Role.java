package role.model;

import account.model.Account;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@Builder
public class Role {
    private int id;
    private String name;
    private List<Account> userList;
}
