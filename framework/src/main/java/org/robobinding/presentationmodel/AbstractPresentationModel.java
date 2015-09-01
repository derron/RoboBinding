package org.robobinding.presentationmodel;

/**
 * Created by dhu on 15/9/1.
 */
public abstract class AbstractPresentationModel implements HasPresentationModelChangeSupport {
    private final PresentationModelChangeSupport presentationModelChangeSupport = new PresentationModelChangeSupport(this);

    @Override
    public PresentationModelChangeSupport getPresentationModelChangeSupport() {
        return presentationModelChangeSupport;
    }

    protected void firePropertyChange(String propertyName) {
        this.presentationModelChangeSupport.firePropertyChange(propertyName);
    }

    public void refreshPresentationModel() {
        this.presentationModelChangeSupport.refreshPresentationModel();
    }
}
