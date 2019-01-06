import com.google.inject.Guice;
import com.google.inject.Injector;
import com.mb.guicemodule.MyAppModule;
import com.mb.service.MyAppService;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @Author mubi
 * @Date 2018/12/25 11:28 AM
 */
public class AppTest {
    private static Injector injector;

    @BeforeClass
    public static void init() {
        injector = Guice.createInjector(new MyAppModule());
    }

    @Test
    public void testMyApp() {
        MyAppService myApp = injector.getInstance(MyAppService.class);
        myApp.work();
    }
}
//作者：过了即是客
//来源：CSDN
//原文：https://blog.csdn.net/u011054333/article/details/57179999
//版权声明：本文为博主原创文章，转载请附上博文链接！
