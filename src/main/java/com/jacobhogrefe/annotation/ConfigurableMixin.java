/**
 * Credits: https://github.com/hiisuuii/tifymc/blob/main/src/main/java/hisui/tifymc/annotation/ConfigurableMixin.java
 */
package com.jacobhogrefe.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@SuppressWarnings("unused")
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ConfigurableMixin {
    String configName();
}
