package org.robobinding.widget.view;


import android.view.View;
import org.robobinding.viewattribute.property.OneWayPropertyViewAttribute;

/**
 *
 * @since 1.0
 * @version $Revision: 1.0 $
 * @author Cheng Wei
 */
public class BackgroundColorAttribute implements OneWayPropertyViewAttribute<View, Integer> {
    @Override
    public void updateView(View view, Integer newColor) {
        view.setBackgroundColor(newColor);
    }
}
