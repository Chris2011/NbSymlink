package org.chrisle.netbeans.plugins.nbsymlink;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import org.openide.awt.ActionID;
import org.openide.util.NbBundle;
import org.openide.util.NbBundle.Messages;

/**
 *
 * @author ChrisLE
 */
@ActionID(
        category = "Tools",
        id = "org.chrisle.netbeans.plugins.nbsymlink.SourceAction"
)
@Messages("CTL_SourceAction=Folder is source")
public class SourceAction extends AbstractAction {
    public SourceAction() {
        super(NbBundle.getMessage(SourceAction.class, "CTL_SourceAction"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "This Folder is the source.");
    }
}