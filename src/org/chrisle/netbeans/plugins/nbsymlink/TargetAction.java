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
        id = "org.chrisle.netbeans.plugins.nbsymlink.TargetAction"
)
@Messages("CTL_TargetAction=Folder is target")
public class TargetAction extends AbstractAction {
    public TargetAction() {
        super(NbBundle.getMessage(TargetAction.class, "CTL_TargetAction"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "This Folder is the target.");
    }
}