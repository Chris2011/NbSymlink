package org.chrisle.netbeans.plugins.nbsymlink.actions;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JMenu;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle;
import org.openide.util.NbBundle.Messages;
import org.openide.util.actions.Presenter;
import javax.swing.JMenuItem;
import org.chrisle.netbeans.plugins.nbsymlink.subactions.SourceAction;
import org.chrisle.netbeans.plugins.nbsymlink.subactions.TargetAction;

@ActionID(
        category = "Tools",
        id = "org.chrisle.netbeans.plugins.nbsymlink.NbSymlinkAction"
)
@ActionRegistration(
    displayName = "#CTL_NbSymlinkAction"
)

@ActionReferences({
    @ActionReference(path = "Loaders/folder/any/Actions", position = 100),
    @ActionReference(path = "Projects/Actions", position = 100)
})
@Messages("CTL_NbSymlinkAction=Create Symlink")
public final class NbSymlinkAction extends AbstractAction implements Presenter.Popup {
    @Override
    public void actionPerformed(ActionEvent e) {
    }

    public NbSymlinkAction() {
        super(NbBundle.getMessage(NbSymlinkAction.class, "CTL_NbSymlinkAction"));
    }
    
    @Override
    public JMenuItem getPopupPresenter() {
        JMenu menu = new JMenu(this);

        menu.add(new SourceAction());
        menu.add(new TargetAction());

        return menu;
    }
}