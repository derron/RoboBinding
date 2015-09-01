package org.robobinding.widget.adapterview;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import org.robobinding.attribute.Command;
import org.robobinding.widgetaddon.adapterview.AdapterViewAddOn;

/**
 * 
 * @since 1.0
 * @version $Revision: 1.0 $
 * @author Robert Taylor
 */
public class OnItemLongClickAttribute implements EventViewAttributeForAdapterView {
	@Override
	public void bind(AdapterViewAddOn viewAddOn, final Command command, AdapterView<?> view) {
		viewAddOn.addOnItemLongClickListener(new OnItemLongClickListener() {
			@Override
			public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
				ItemClickEvent itemClickEvent = new ItemClickEvent(parent, view, position, id);
				Object result = command.invoke(itemClickEvent);
				return Boolean.TRUE.equals(result);
			}
		});
	}

	@Override
	public Class<ItemClickEvent> getEventType() {
		return ItemClickEvent.class;
	}

}
