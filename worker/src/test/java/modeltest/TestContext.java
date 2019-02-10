package modeltest;


import com.bat.petra.data.common.CommonApplication;
import com.bat.petra.data.common.model.Account;
import com.bat.petra.data.common.repository.AccountService;
import com.bat.petra.data.worker.WorkerApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.util.List;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CommonApplication.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)
public class TestContext {

    @Test
    public void contextLoads() {

        ApplicationContext context = SpringApplication.run(WorkerApplication.class);
        DataSource dataSource = context.getBean(javax.sql.DataSource.class);
        System.out.println("DATASOURCE = " + dataSource);
        AccountService myservice = new AccountService();
        List<String> mylist = myservice.getTotalIds();
        //Integer totalRows = myservice.getTotalRows();
        System.out.print("hola Carola " + mylist);


    }
}
