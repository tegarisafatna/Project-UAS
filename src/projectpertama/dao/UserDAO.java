package projectpertama.dao;

import projectpertama.model.User;

/**
 * Interface DAO untuk User.
 */
public interface UserDAO {
    // Mengecek apakah login valid
    User login(String username, String password);
}
