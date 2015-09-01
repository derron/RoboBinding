package org.robobinding.codegen.viewbinding;

import android.view.View;
import org.robobinding.attribute.Command;
import org.robobinding.customviewbinding.CustomViewBinding;

import android.widget.ImageView;
import org.robobinding.property.ValueModel;
import org.robobinding.viewattribute.event.EventViewAttribute;
import org.robobinding.viewattribute.property.TwoWayPropertyViewAttribute;
import org.robobinding.widgetaddon.view.ViewAddOnForView;

/**
 * @since 1.0
 * @author Cheng Wei
 *
 */
public class DefineMapBindingAttributesMethod extends CustomViewBinding<ImageView> {

    public static class CustomTwoWayProp
            implements TwoWayPropertyViewAttribute<ImageView, ViewAddOnForView, Boolean> {

        @Override
        public void updateView(ImageView view, Boolean newValue, ViewAddOnForView viewAddOn) {
        }

        @Override
        public void observeChangesOnTheView(ViewAddOnForView viewAddOn, final ValueModel<Boolean> valueModel, ImageView view) {
        }
    }
    public static class CustomEventProp implements EventViewAttribute<ImageView, ViewAddOnForView> {

        @Override
        public void bind(ViewAddOnForView viewAddOn, Command command, ImageView view) {
        }

        @Override
        public Class<?> getEventType() {
            return null;
        }
    }
}
