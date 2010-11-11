/*
 * TestQuestionFrame.java
 *
 * Created on 27 August 2006, 12:12
 */
package uk.co.bytemark.vm.enigma.inquisition.gui.screens;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class AbstractQuizFrame extends JFrame {

    public AbstractQuizFrame() {
        // IDE generated GUI init
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progressAndAdvancedNavLayoutPanel = new javax.swing.JPanel();
        advancedNavigationPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        navigateToQuestionComboBox = new javax.swing.JComboBox();
        markedForReviewBox = new javax.swing.JCheckBox();
        findNextMarkedButton = new javax.swing.JButton();
        findNextUnansweredButton = new javax.swing.JButton();
        progressPanel = new javax.swing.JPanel();
        timeRemainingLabel = new javax.swing.JLabel();
        timeRemainingTextField = new javax.swing.JTextField();
        pauseButton = new javax.swing.JButton();
        progressBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        overviewButton = new javax.swing.JButton();
        checkAnswerButton = new javax.swing.JButton();
        splitPane = new javax.swing.JSplitPane();
        questionPanelHolderPanel = new javax.swing.JPanel();
        explanationPanel = new javax.swing.JPanel();
        rightOrWrongLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        explanationTextPane = new javax.swing.JTextPane();
        pinExplanationPanelBox = new javax.swing.JCheckBox();
        findNextIncorrectAnswerButton = new javax.swing.JButton();
        navigationButtonsPanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        firstQuestionButton = new javax.swing.JButton();
        previousQuestionButton = new javax.swing.JButton();
        nextQuestionButton = new javax.swing.JButton();
        lastQuestionButton = new javax.swing.JButton();
        testMenuBar = new javax.swing.JMenuBar();
        quizMenu = new javax.swing.JMenu();
        saveQuizMenuItem = new javax.swing.JMenuItem();
        exitQuizMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Java.Inquisition");

        advancedNavigationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Navigation"));

        jLabel5.setText("Question:");

        markedForReviewBox.setText("Mark for review?");
        markedForReviewBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        markedForReviewBox.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        markedForReviewBox.setMargin(new java.awt.Insets(0, 0, 0, 0));

        findNextMarkedButton.setText("Find next marked");
        findNextMarkedButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        findNextMarkedButton.setName("findNextMarkedButton"); // NOI18N

        findNextUnansweredButton.setText("Find next unanswered");
        findNextUnansweredButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        findNextUnansweredButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        findNextUnansweredButton.setName("findNextUnansweredButton"); // NOI18N

        org.jdesktop.layout.GroupLayout advancedNavigationPanelLayout = new org.jdesktop.layout.GroupLayout(advancedNavigationPanel);
        advancedNavigationPanel.setLayout(advancedNavigationPanelLayout);
        advancedNavigationPanelLayout.setHorizontalGroup(
            advancedNavigationPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(advancedNavigationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(advancedNavigationPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(markedForReviewBox)
                    .add(advancedNavigationPanelLayout.createSequentialGroup()
                        .add(jLabel5)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(navigateToQuestionComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 59, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(advancedNavigationPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(findNextMarkedButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(findNextUnansweredButton))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        advancedNavigationPanelLayout.setVerticalGroup(
            advancedNavigationPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(advancedNavigationPanelLayout.createSequentialGroup()
                .add(advancedNavigationPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(navigateToQuestionComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(findNextUnansweredButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(advancedNavigationPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(markedForReviewBox)
                    .add(findNextMarkedButton))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        progressPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Progress"));

        timeRemainingLabel.setText("Time remaining:");

        timeRemainingTextField.setEditable(false);

        pauseButton.setText("Pause");
        pauseButton.setName("pauseButton"); // NOI18N

        progressBar.setStringPainted(true);

        jLabel1.setText("Answered:");

        org.jdesktop.layout.GroupLayout progressPanelLayout = new org.jdesktop.layout.GroupLayout(progressPanel);
        progressPanel.setLayout(progressPanelLayout);
        progressPanelLayout.setHorizontalGroup(
            progressPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, progressPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(progressPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(timeRemainingLabel)
                    .add(jLabel1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(progressPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(progressPanelLayout.createSequentialGroup()
                        .add(timeRemainingTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(pauseButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                    .add(progressBar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                .addContainerGap())
        );
        progressPanelLayout.setVerticalGroup(
            progressPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(progressPanelLayout.createSequentialGroup()
                .add(progressPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(timeRemainingLabel)
                    .add(timeRemainingTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(pauseButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(progressPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(progressBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout progressAndAdvancedNavLayoutPanelLayout = new org.jdesktop.layout.GroupLayout(progressAndAdvancedNavLayoutPanel);
        progressAndAdvancedNavLayoutPanel.setLayout(progressAndAdvancedNavLayoutPanelLayout);
        progressAndAdvancedNavLayoutPanelLayout.setHorizontalGroup(
            progressAndAdvancedNavLayoutPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, progressAndAdvancedNavLayoutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(advancedNavigationPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 341, Short.MAX_VALUE)
                .add(progressPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        progressAndAdvancedNavLayoutPanelLayout.setVerticalGroup(
            progressAndAdvancedNavLayoutPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(progressPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(advancedNavigationPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        overviewButton.setText("Quiz score");
        overviewButton.setName("quizScoreButton"); // NOI18N

        checkAnswerButton.setText("Show answer and explanation");
        checkAnswerButton.setName("showAnswerAndExplanationButton"); // NOI18N

        splitPane.setDividerLocation(500);
        splitPane.setDividerSize(0);
        splitPane.setResizeWeight(0.5);
        splitPane.setContinuousLayout(true);

        questionPanelHolderPanel.setLayout(new java.awt.CardLayout());
        splitPane.setTopComponent(questionPanelHolderPanel);

        explanationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Answer and explanation"));

        rightOrWrongLabel.setText("Correct");

        explanationTextPane.setContentType("text/html");
        explanationTextPane.setEditable(false);
        jScrollPane2.setViewportView(explanationTextPane);

        pinExplanationPanelBox.setText(" Keep explanation open");
        pinExplanationPanelBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        pinExplanationPanelBox.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pinExplanationPanelBox.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        pinExplanationPanelBox.setMargin(new java.awt.Insets(0, 0, 0, 0));

        findNextIncorrectAnswerButton.setText("Find next incorrect answer");
        findNextIncorrectAnswerButton.setName("findNextIncorrectAnswerButton"); // NOI18N

        org.jdesktop.layout.GroupLayout explanationPanelLayout = new org.jdesktop.layout.GroupLayout(explanationPanel);
        explanationPanel.setLayout(explanationPanelLayout);
        explanationPanelLayout.setHorizontalGroup(
            explanationPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(explanationPanelLayout.createSequentialGroup()
                .add(rightOrWrongLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 177, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(309, Short.MAX_VALUE))
            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
            .add(explanationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(pinExplanationPanelBox)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 149, Short.MAX_VALUE)
                .add(findNextIncorrectAnswerButton))
        );
        explanationPanelLayout.setVerticalGroup(
            explanationPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(explanationPanelLayout.createSequentialGroup()
                .add(rightOrWrongLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(explanationPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(pinExplanationPanelBox)
                    .add(findNextIncorrectAnswerButton)))
        );

        splitPane.setRightComponent(explanationPanel);

        navigationButtonsPanel.setLayout(new java.awt.GridBagLayout());

        firstQuestionButton.setText("First");
        firstQuestionButton.setFocusable(false);
        firstQuestionButton.setName("firstButton"); // NOI18N

        previousQuestionButton.setText("Previous");
        previousQuestionButton.setFocusable(false);
        previousQuestionButton.setName("previousButton"); // NOI18N

        nextQuestionButton.setText("Next");
        nextQuestionButton.setFocusable(false);
        nextQuestionButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        nextQuestionButton.setName("nextButton"); // NOI18N

        lastQuestionButton.setText("Last");
        lastQuestionButton.setFocusable(false);
        lastQuestionButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lastQuestionButton.setName("lastButton"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel6Layout = new org.jdesktop.layout.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .add(firstQuestionButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 118, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(previousQuestionButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 98, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(nextQuestionButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 98, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lastQuestionButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6Layout.linkSize(new java.awt.Component[] {firstQuestionButton, lastQuestionButton, nextQuestionButton, previousQuestionButton}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(nextQuestionButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(previousQuestionButton)
                .add(firstQuestionButton)
                .add(lastQuestionButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6Layout.linkSize(new java.awt.Component[] {firstQuestionButton, lastQuestionButton, nextQuestionButton, previousQuestionButton}, org.jdesktop.layout.GroupLayout.VERTICAL);

        navigationButtonsPanel.add(jPanel6, new java.awt.GridBagConstraints());

        quizMenu.setText("Quiz");

        saveQuizMenuItem.setText("Save quiz...");
        quizMenu.add(saveQuizMenuItem);

        exitQuizMenuItem.setText("Exit this quiz");
        quizMenu.add(exitQuizMenuItem);

        testMenuBar.add(quizMenu);

        jMenu2.setText("About");

        aboutMenuItem.setText("About...");
        jMenu2.add(aboutMenuItem);

        testMenuBar.add(jMenu2);

        setJMenuBar(testMenuBar);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(navigationButtonsPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
                .addContainerGap())
            .add(progressAndAdvancedNavLayoutPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, splitPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(overviewButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 706, Short.MAX_VALUE)
                        .add(checkAnswerButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(progressAndAdvancedNavLayoutPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(splitPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(checkAnswerButton)
                    .add(overviewButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(navigationButtonsPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Callbacks managed by the GUI editor">
    /**
     *  Searches cyclically for the next marked question and changes to it.
     */
    /**
     *  Searches cyclically for the next unanswered question and changes to it.
     */
    /**
     * Pauses or restarts the timer.
     *
     */    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Generated GUI variable declarations ">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JPanel advancedNavigationPanel;
    private javax.swing.JButton checkAnswerButton;
    private javax.swing.JMenuItem exitQuizMenuItem;
    private javax.swing.JPanel explanationPanel;
    private javax.swing.JTextPane explanationTextPane;
    private javax.swing.JButton findNextIncorrectAnswerButton;
    private javax.swing.JButton findNextMarkedButton;
    private javax.swing.JButton findNextUnansweredButton;
    private javax.swing.JButton firstQuestionButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton lastQuestionButton;
    private javax.swing.JCheckBox markedForReviewBox;
    private javax.swing.JComboBox navigateToQuestionComboBox;
    private javax.swing.JPanel navigationButtonsPanel;
    private javax.swing.JButton nextQuestionButton;
    private javax.swing.JButton overviewButton;
    private javax.swing.JButton pauseButton;
    private javax.swing.JCheckBox pinExplanationPanelBox;
    private javax.swing.JButton previousQuestionButton;
    private javax.swing.JPanel progressAndAdvancedNavLayoutPanel;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JPanel progressPanel;
    private javax.swing.JPanel questionPanelHolderPanel;
    private javax.swing.JMenu quizMenu;
    private javax.swing.JLabel rightOrWrongLabel;
    private javax.swing.JMenuItem saveQuizMenuItem;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JMenuBar testMenuBar;
    private javax.swing.JLabel timeRemainingLabel;
    private javax.swing.JTextField timeRemainingTextField;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
    
    protected JButton getCheckAnswerButton() {
        return checkAnswerButton;
    }
    
    protected JLabel getRightOrWrongLabel() {
        return rightOrWrongLabel;
    }
    
    protected JSplitPane getSplitPane() {
        return splitPane;
    }
    
    protected JPanel getExplanationPanel() {
        return explanationPanel;
    }
    
    protected JTextPane getExplanationTextPane() {
        return explanationTextPane;
    }
    
    protected JButton getFirstQuestionButton() {
        return firstQuestionButton;
    }

    protected JButton getPreviousQuestionButton() {
        return previousQuestionButton;
    }

    protected JButton getNextQuestionButton() {
        return nextQuestionButton;
    }

    protected JButton getLastQuestionButton() {
        return lastQuestionButton;
    }

    protected JComboBox getNavigateToQuestionComboBox() {
        return navigateToQuestionComboBox;
    }

    protected JButton getFindNextIncorrectAnswerButton() {
        return findNextIncorrectAnswerButton;
    }

    protected JButton getFindNextMarkedButton() {
        return findNextMarkedButton;
    }

    protected JButton getFindNextNextUnansweredButton() {
        return findNextUnansweredButton;
    }
    protected JButton getPauseButton() {
        return pauseButton;
    }

    protected JCheckBox getMarkedForReviewBox() {
        return markedForReviewBox;
    }
 
    protected JProgressBar getAnsweredProgressBar() {
        return progressBar;
    }
    
    protected JTextField getTimeRemainingTextField() {
        return timeRemainingTextField;
    }
    
    protected JLabel getTimeRemainingLabel() {
        return timeRemainingLabel;
    }
    
    protected JPanel getQuestionPanelHolderPanel() {
        return questionPanelHolderPanel;
    }
    
    protected JCheckBox getPinExplanationPanelCheckBox() {
        return pinExplanationPanelBox;
    }
    
    protected JButton getOverviewButton() {
        return overviewButton;
    }
    
    protected JMenuItem getExitQuizMenuItem() {
        return exitQuizMenuItem;
    }
    
    protected JMenuItem getAboutMenuItem() {
        return aboutMenuItem;
    }
    protected JMenuItem getSaveQuizMenuItem() {
        return saveQuizMenuItem;
    }
    
}
