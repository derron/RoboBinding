package org.robobinding;

import org.robobinding.widget.view.ClickEvent;

/**
 * Created by dhu on 15/9/2.
 */
public class TrackHelper {
    public static final int TAG_TRACK_TAG = 0x7f0d1234;
    public static final String ATTR_TRACK_TAG = "trackTag";
    public static interface OnClickHook {
        void preInvokeClickEvent(ClickEvent event);
        void postInvokeClickEvent(ClickEvent event);
    }
    /**
     * Initiate a new instance of {@link TrackHelper}.
     */
    private TrackHelper() {
    }

    private static OnClickHook sOnClickHook;
    public static void setOnClickHook(OnClickHook hook) {
        sOnClickHook = hook;
    }

    public static OnClickHook getOnClickHook() {
        return sOnClickHook;
    }
}
