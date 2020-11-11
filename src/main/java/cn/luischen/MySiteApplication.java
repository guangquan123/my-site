package cn.luischen;

import cn.luischen.api.QiniuCloudService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("cn.luischen.dao")
@EnableCaching

public class MySiteApplication {

    private static final transient Log log = LogFactory.getLog(MySiteApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(MySiteApplication.class, args);

        log.debug("------------------------------------");
    }
}
