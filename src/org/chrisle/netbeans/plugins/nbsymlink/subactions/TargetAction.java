package org.chrisle.netbeans.plugins.nbsymlink.subactions;

import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;
import org.chrisle.netbeans.plugins.nbsymlink.components.CreateSymlinkDialog;
import org.openide.awt.ActionID;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataObject;
import org.openide.util.NbBundle;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;

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
        TopComponent activeTC = TopComponent.getRegistry().getActivated();
        DataObject dataLookup = activeTC.getLookup().lookup(DataObject.class);
        File primaryFile = FileUtil.toFile(dataLookup.getPrimaryFile());
        CreateSymlinkDialog dialog = new CreateSymlinkDialog(null, true);
        
        dialog.setFileChooserDir(primaryFile, false);
        dialog.setVisible(true);
    }
}