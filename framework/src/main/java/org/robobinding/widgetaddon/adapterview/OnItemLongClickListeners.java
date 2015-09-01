package org.robobinding.widgetaddon.adapterview;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import org.robobinding.widgetaddon.AbstractListeners;

/**
 * 
 * @since 1.0
 * @version $Revision: 1.0 $
 * @author Cheng Wei
 */
class OnItemLongClickListeners extends AbstractListeners<OnItemLongClickListener> implements OnItemLongClickListener {
	@Override
	public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
		for (OnItemLongClickListener listener : listeners) {
			boolean result = listener.onItemLongClick(parent, view, position, id);
			if (result) {
				return true;
			}
		}
		return false;
	}

	public static OnItemLongClickListeners convert(OnItemLongClickListener listener) {
		if (listener instanceof OnItemLongClickListeners) {
			return (OnItemLongClickListeners) listener;
		} else {
			OnItemLongClickListeners onItemClickListeners = new OnItemLongClickListeners();
			onItemClickListeners.addListener(listener);
			return onItemClickListeners;
		}
	}

}
