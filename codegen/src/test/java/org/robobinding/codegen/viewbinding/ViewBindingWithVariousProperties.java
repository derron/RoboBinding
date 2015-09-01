package org.robobinding.codegen.viewbinding;

import org.robobinding.annotation.EventProperty;
import org.robobinding.annotation.TwoWayProperty;
import org.robobinding.annotation.ViewBinding;
import org.robobinding.customviewbinding.CustomViewBinding;
import org.robobinding.property.ValueModel;
import org.robobinding.viewattribute.property.TwoWayPropertyViewAttribute;
import org.robobinding.widgetaddon.ViewAddOn;

/**
 * @since 1.0
 * @author Cheng Wei
 *
 */
@ViewBinding(simpleOneWayProperties={ViewWithProperties.PRIMITIVE_PROP, ViewWithProperties.OBJECT_PROP},
        twoWayProperties={@TwoWayProperty(name=ViewWithProperties.TWO_WAY_PROP, type=ViewWithProperties.CustomTwoWayProp.class)},
        eventProperties={@EventProperty(name=ViewWithProperties.EVENT_PROP, type=ViewWithProperties.CustomEventProp.class)})
public class ViewBindingWithVariousProperties extends CustomViewBinding<ViewWithProperties> implements ViewAddOn {


}