package lu.ankang.ignitedemo.repository;

import lu.ankang.ignitedemo.model.User;
import org.apache.ignite.springdata22.repository.IgniteRepository;
import org.apache.ignite.springdata22.repository.config.Query;
import org.apache.ignite.springdata22.repository.config.RepositoryConfig;
import org.springframework.stereotype.Repository;

import javax.cache.Cache;

@Repository
@RepositoryConfig(cacheName = "UserCache")
public interface UserRepository extends IgniteRepository<User, String> {

    @Query("SELECT * FROM UserCache WHERE userName = ?")
    User findByUserName(String userName);

    @Query("SELECT * FROM UserCache WHERE userAccount = ?")
    Cache.Entry<String,User> findByUserAccount(String userAccount);
}
