package account.port;

import account.model.Account;

public interface AccountPort {
    public Account retrieve(int id);
}
