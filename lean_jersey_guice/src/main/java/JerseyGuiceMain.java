import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Module;
import com.mb.guicemodule.MyAppModule;
import com.mb.guicemodule.UserModule;
import com.mb.common.CommonConstant;
import io.logz.guice.jersey.JerseyModule;
import io.logz.guice.jersey.JerseyServer;
import io.logz.guice.jersey.configuration.JerseyConfiguration;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author mubi
 * @Date 2018/12/25 11:49 AM
 *
 * 参考：https://github.com/logzio/guice-jersey
 */
public class JerseyGuiceMain {
    public static void main(String[] args) throws Exception {
        JerseyConfiguration configuration = JerseyConfiguration.builder()
                .addPackage(CommonConstant.resource_packge)
                .addPort(10000)
                .build();

        List<Module> modules = new ArrayList<>();
        modules.add(new JerseyModule(configuration));
        modules.add(new AbstractModule() {
            @Override
            protected void configure() {
                // Your module bindings ...
            }
        });
        modules.add(new UserModule());
        modules.add(new MyAppModule());

        Guice.createInjector(modules)
                .getInstance(JerseyServer.class).start();
    }
}
