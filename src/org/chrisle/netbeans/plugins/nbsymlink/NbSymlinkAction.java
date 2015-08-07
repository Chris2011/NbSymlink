package org.chrisle.netbeans.plugins.nbsymlink;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import org.openide.loaders.DataObject;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Tools",
        id = "org.chrisle.netbeans.plugins.nbsymlink.NbSymlinkAction"
)
@ActionRegistration(
        displayName = "#CTL_NbSymlinkAction"
)

@ActionReferences({
    @ActionReference(path = "Loaders/folder/any/Actions", position = 0),
})
@Messages("CTL_NbSymlinkAction=Create Symlink")
public final class NbSymlinkAction implements ActionListener {

    private final DataObject context;

    public NbSymlinkAction(DataObject context) {
        this.context = context;
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        JOptionPane.showMessageDialog(null, context.toString());
    }
}