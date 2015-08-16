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
        id = "org.chrisle.netbeans.plugins.nbsymlink.SourceAction"
)
@Messages("CTL_SourceAction=Folder is source")
public class SourceAction extends AbstractAction {
    public SourceAction() {
        super(NbBundle.getMessage(SourceAction.class, "CTL_SourceAction"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TopComponent activeTC = TopComponent.getRegistry().getActivated();
        DataObject dataLookup = activeTC.getLookup().lookup(DataObject.class);
        File primaryFile = FileUtil.toFile(dataLookup.getPrimaryFile());
        CreateSymlinkDialog dialog = new CreateSymlinkDialog(null, true);
        
        dialog.setFileChooserDir(primaryFile, true);
        dialog.setVisible(true);
    }
}