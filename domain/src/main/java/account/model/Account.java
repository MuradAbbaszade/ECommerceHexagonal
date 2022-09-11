package account.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Account {
    private int id;
    private String name;
    private String surname;
}
