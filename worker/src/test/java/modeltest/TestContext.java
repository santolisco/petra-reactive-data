package modeltest;


import com.bat.petra.data.common.model.Account;
import com.bat.petra.data.common.repository.AccountService;
import com.bat.petra.data.worker.WorkerApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = WorkerApplication.class)
public class TestContext {

    @Test
    public void contextLoads() {

        Account myAccnt = new Account();

        String myaccout = myAccnt.getId();
        System.out.print("hola Carola");

    }
}
