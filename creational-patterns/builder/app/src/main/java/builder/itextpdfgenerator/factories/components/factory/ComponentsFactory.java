package builder.itextpdfgenerator.factories.components.factory;

import builder.itextpdfgenerator.factories.components.Component;
import builder.itextpdfgenerator.utils.InstancesUtil;

@FunctionalInterface
public interface ComponentsFactory {
    String get();
    default Component getComponent() {
        return InstancesUtil.Components.getComponent(get());
    }
}
