package org.robobinding.widgetaddon.adapterview;

import org.robobinding.widgetaddon.view.ViewAddOnForView;

import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView.OnItemLongClickListener;

/**
 * @since 1.0
 * @author Cheng Wei
 *
 */
public class AdapterViewAddOn extends ViewAddOnForView {
	private final AdapterView<?> view;
	private OnItemSelectedListeners onItemSelectedListeners;
	private OnItemClickListeners onItemClickListeners;
	private OnItemLongClickListeners onItemLongClickListeners;

	public AdapterViewAddOn(AdapterView<?> view) {
		super(view);
		
		this.view = view;
	}

	public void addOnItemSelectedListener(OnItemSelectedListener onItemSelectedListener) {
		ensureOnItemSelectedListenersInitialized();
		onItemSelectedListeners.addListener(onItemSelectedListener);
	}

	public void addOnItemClickListener(OnItemClickListener onItemClickListener) {
		ensureOnItemClickListenersInitialized();
		onItemClickListeners.addListener(onItemClickListener);
	}

	public void addOnItemLongClickListener(OnItemLongClickListener onItemLongClickListener) {
		ensureOnItemLongClickListenersInitialized();
		onItemLongClickListeners.addListener(onItemLongClickListener);
	}

	private void ensureOnItemSelectedListenersInitialized() {
		if (onItemSelectedListeners == null) {
			onItemSelectedListeners = new OnItemSelectedListeners();
			view.setOnItemSelectedListener(onItemSelectedListeners);
		}
	}

	private void ensureOnItemClickListenersInitialized() {
		if (onItemClickListeners == null) {
			onItemClickListeners = new OnItemClickListeners();
			view.setOnItemClickListener(onItemClickListeners);
		}
	}

	private void ensureOnItemLongClickListenersInitialized() {
		if (onItemLongClickListeners == null) {
			onItemLongClickListeners = new OnItemLongClickListeners();
			view.setOnItemLongClickListener(onItemLongClickListeners);
		}
	}
}
