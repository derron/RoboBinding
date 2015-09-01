package org.robobinding.widget.radiogroup;

import android.widget.RadioGroup;
import org.robobinding.property.ValueModel;
import org.robobinding.viewattribute.property.TwoWayPropertyViewAttribute;
import org.robobinding.widgetaddon.radiogroup.RadioGroupAddOn;

/**
 * Created by dhu on 15/9/1.
 */
public class CheckedIdAttribute implements TwoWayPropertyViewAttribute<RadioGroup, RadioGroupAddOn, Integer> {

    @Override
    public void updateView(RadioGroup view, Integer newValue, RadioGroupAddOn viewAddOn) {
        view.check(newValue);
    }

    @Override
    public void observeChangesOnTheView(RadioGroupAddOn viewAddOn, final ValueModel<Integer> valueModel, RadioGroup view) {
        viewAddOn.addOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                valueModel.setValue(checkedId);
            }
        });
    }
}