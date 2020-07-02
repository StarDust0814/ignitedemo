package lu.ankang.ignitedemo;

import lu.ankang.ignitedemo.model.User;
import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.apache.ignite.configuration.CacheConfiguration;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.apache.ignite.springdata22.repository.config.EnableIgniteRepositories;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableIgniteRepositories
public class AppConfig {
    @Bean
    public Ignite igniteInstance() {

        IgniteConfiguration cfg = new IgniteConfiguration();

        cfg.setClientMode(true);

        return Ignition.start(cfg);
    }
}