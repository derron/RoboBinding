package org.robobinding.annotation;

import org.robobinding.viewattribute.event.EventViewAttribute;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by dhu on 15/9/1.
 */
@Retention(RetentionPolicy.CLASS)
@Target({ ElementType.ANNOTATION_TYPE })
public @interface EventProperty {
    String name();
    Class<? extends EventViewAttribute<?, ?>> type();
}
