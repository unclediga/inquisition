/*
 * WebPageFileChooserDialog.java
 *
 * Created on 22 September 2006, 16:14
 */

package uk.co.bytemark.vm.enigma.inquisition.gui.quizchooser;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.text.AbstractDocument;
import javax.swing.text.Document;


/**
 *
 * @author  Matt
 */
public class WebPageFileChooserDialog extends javax.swing.JDialog {
    
    private static final Logger LOGGER = Logger.getLogger(WebPageFileChooserDialog.class.getName()); 
    
    /** A return status code - returned if Cancel button has been pressed */
    public static final int RET_CANCEL = 0;
    /** A return status code - returned if OK button has been pressed */
    public static final int RET_OK = 1;
    
    private String examURL;
    QuestionSetSelectorFrame parent;

    public WebPageFileChooserDialog(QuestionSetSelectorFrame parent, final String url) {
        super(parent, true);
        this.parent = parent;
        
        initComponents();
        
        ensureDocumentLoadsAsynchronously();
        
        try {
            editorPane.setPage(url);
        } catch (IOException e) {
            LOGGER.log(Level.INFO, "Problem loading webpage: " + url, e);
            JOptionPane.showMessageDialog(this, "Could not access web page: " + e.getMessage(), 
                    "Could not open web page", JOptionPane.ERROR_MESSAGE);
            // TODO: Stop the dialog from popping up in this case
        }
            
        editorPane.addHyperlinkListener(new LinkListener());
        
    }

    private void ensureDocumentLoadsAsynchronously() {
        Document document = editorPane.getDocument();
        ((AbstractDocument) document).setAsynchronousLoadPriority(Thread.NORM_PRIORITY);
    }
    
    /** @return the return status of this dialog - one of RET_OK or RET_CANCEL */
    public int getReturnStatus() {
        return returnStatus;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        cancelButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        editorPane = new javax.swing.JEditorPane();

        setTitle("Select a link");
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        editorPane.setEditable(false);
        jScrollPane1.setViewportView(editorPane);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, cancelButton)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(cancelButton)
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        doClose(RET_CANCEL);
    }//GEN-LAST:event_cancelButtonActionPerformed
    
    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog
    
    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JEditorPane editorPane;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
    private int returnStatus = RET_CANCEL;
    
    class LinkListener implements HyperlinkListener {
        
        public void hyperlinkUpdate(HyperlinkEvent e) {
            HyperlinkEvent.EventType eventType = e.getEventType();
            if (eventType == HyperlinkEvent.EventType.ACTIVATED) {
                WebPageFileChooserDialog.this.setVisible(false);
                examURL = e.getURL().toExternalForm();
                WebPageFileChooserDialog.this.parent.addWebExam(examURL);
                
                // Snippet: in case we ever want to 
                // traverse web links:
                // editorPane.setPage(e.getURL().toExternalForm());
    
            }
        }
    }
}
