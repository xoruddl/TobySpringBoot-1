package toby.config;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyAutoConfigImportSelector implements DeferredImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {
                "toby.config.autoconfig.DispatcherServletConfig",
                "toby.config.autoconfig.TomcatWebServerConfig"
        };
    }
}
