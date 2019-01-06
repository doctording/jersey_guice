import com.google.inject.Guice;
import com.google.inject.Injector;
import com.mb.guicemodule.MyAppModule;
import com.mb.service.MyAppService;

/**
 * @Author mubi
 * @Date 2018/12/25 11:49 AM
 */
public class App {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new MyAppModule());
        MyAppService myApp = injector.getInstance(MyAppService.class);
        myApp.work();
    }
}
