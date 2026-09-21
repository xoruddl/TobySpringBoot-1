package toby.config;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.boot.context.annotation.ImportCandidates;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

@RequiredArgsConstructor
public class MyAutoConfigImportSelector implements DeferredImportSelector {

    private final ClassLoader classLoader;

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        List<String> autoConfigs = new ArrayList<>();

        ImportCandidates.load(MyAutoConfigImportSelector.class, classLoader).forEach(autoConfigs::add);
        return autoConfigs.stream().toArray(String[]::new);
    }
}
