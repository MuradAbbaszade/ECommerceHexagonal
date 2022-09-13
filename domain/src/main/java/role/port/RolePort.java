package role.port;

import role.model.Role;

public interface RolePort {
    Role retrieve(int id) throws Exception;
}
