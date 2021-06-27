package tr.gov.tcmb.ornkprj.config;

import java.util.Properties;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class DatabaseConfig {

  private @Autowired EntityInterceptor entityInterceptor;

  @Bean
  public DataSource dataSource() {

    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    // dataSource.setDriverClassName("org.postgresql.Driver");
    // dataSource.setUrl("jdbc:postgresql://localhost:5432/SampleDB");
    dataSource.setDriverClassName("org.apache.derby.jdbc.ClientDriver");
    dataSource.setUrl("jdbc:derby://localhost:1527/MYDB");
    dataSource.setUsername("ahmet");
    dataSource.setPassword("admin");

    return dataSource;

  }

  @Bean
  public LocalSessionFactoryBean sessionFactoryBean(@Autowired DataSource dataSource) {

    LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
    localSessionFactoryBean.setDataSource(dataSource);
    localSessionFactoryBean.setPackagesToScan("tr.gov.tcmb.ornkprj.model.entity");
    localSessionFactoryBean.setHibernateProperties(hibernateProperties());
    localSessionFactoryBean.setEntityInterceptor(entityInterceptor);

    return localSessionFactoryBean;

  }

  @Bean
  public PlatformTransactionManager transactionManager(@Autowired LocalSessionFactoryBean sessionFactoryBean) {

    HibernateTransactionManager transactionManager = new HibernateTransactionManager();
    transactionManager.setSessionFactory(sessionFactoryBean.getObject());

    return transactionManager;

  }

  private final Properties hibernateProperties() {

    final Properties props = new Properties();
    props.put("hibernate.dialect", "org.hibernate.dialect.DerbyTenSevenDialect");
    // props.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQL10Dialect");
    props.put("hibernate.hbm2ddl.auto", "update");
    // props.put("hibernate.globally_quoted_identifiers", true);
    props.put("hibernate.default_schema", "IKGPERS");
    props.put("hibernate.format_sql", true);
    props.put("hibernate.show_sql", true);

    return props;

  }

}
