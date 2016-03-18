package org.chrisle.netbeans.plugins.nbsymlink.subactions;

import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;
import org.chrisle.netbeans.plugins.nbsymlink.components.CreateSymlinkDialog;
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
    private File _selectedNode;

    public TargetAction() {
        super(NbBundle.getMessage(TargetAction.class, "CTL_TargetAction"));
    }
    
    public TargetAction(File selectedNode) {
        this();
        
        this._selectedNode = selectedNode;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CreateSymlinkDialog dialog = new CreateSymlinkDialog();
        
        dialog.setFileChooserDir(this._selectedNode, false);
        dialog.showDialog();
    }
}