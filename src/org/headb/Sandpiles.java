package org.headb;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Sandpiles.java
 *
 * Created on Feb 28, 2009, 8:12:27 PM
 */
/**
 *
 * @author headb
 */
import javax.swing.UIManager;

public class Sandpiles extends javax.swing.JFrame {

	private final int SAVE_GRAPH = 0, LOAD_GRAPH = 1, SAVE_CONFIG = 2, LOAD_CONFIG = 3;
	private int fileAction=-1;


	/** Creates new form Sandpiles */
	public Sandpiles() {
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        sandpilesInteractionPanel1 = new org.headb.SandpilesInteractionPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        saveGraphMenuItem = new javax.swing.JMenuItem();
        loadGraphMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        saveConfigMenuItem = new javax.swing.JMenuItem();
        loadConfigMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        quitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();

        fileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChooserActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setText("File");

        saveGraphMenuItem.setText("Save Graph");
        saveGraphMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveGraphMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveGraphMenuItem);

        loadGraphMenuItem.setText("Load Graph");
        loadGraphMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadGraphMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(loadGraphMenuItem);
        fileMenu.add(jSeparator2);

        saveConfigMenuItem.setText("Save Config");
        saveConfigMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveConfigMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveConfigMenuItem);

        loadConfigMenuItem.setText("Load Config");
        loadConfigMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadConfigMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(loadConfigMenuItem);
        fileMenu.add(jSeparator1);

        quitMenuItem.setText("Quit");
        quitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(quitMenuItem);

        jMenuBar1.add(fileMenu);

        editMenu.setText("Edit");
        jMenuBar1.add(editMenu);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(sandpilesInteractionPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(sandpilesInteractionPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void quitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitMenuItemActionPerformed
		System.exit(0);
	}//GEN-LAST:event_quitMenuItemActionPerformed

	private void fileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooserActionPerformed
		if(evt.getActionCommand().equals(fileChooser.APPROVE_SELECTION)){
			switch(fileAction){
				case SAVE_GRAPH:
					this.sandpilesInteractionPanel1.getSandpilePanel().saveGraph(fileChooser.getSelectedFile());
					break;
				case LOAD_GRAPH:
					this.sandpilesInteractionPanel1.getSandpilePanel().loadGraph(fileChooser.getSelectedFile());
					break;
				case SAVE_CONFIG:
					this.sandpilesInteractionPanel1.getSandpilePanel().saveConfig(fileChooser.getSelectedFile());
					break;
				case LOAD_CONFIG:
					this.sandpilesInteractionPanel1.getSandpilePanel().loadConfig(fileChooser.getSelectedFile());
					break;
			}
		}
		fileAction = -1;
}//GEN-LAST:event_fileChooserActionPerformed

	private void saveGraphMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveGraphMenuItemActionPerformed
		fileAction = SAVE_GRAPH;
		this.fileChooser.showSaveDialog(this);
	}//GEN-LAST:event_saveGraphMenuItemActionPerformed

	private void loadGraphMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadGraphMenuItemActionPerformed
		fileAction = LOAD_GRAPH;
		this.fileChooser.showOpenDialog(this);
	}//GEN-LAST:event_loadGraphMenuItemActionPerformed

	private void saveConfigMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveConfigMenuItemActionPerformed
		fileAction = SAVE_CONFIG;
		this.fileChooser.showSaveDialog(this);
	}//GEN-LAST:event_saveConfigMenuItemActionPerformed

	private void loadConfigMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadConfigMenuItemActionPerformed
		fileAction = LOAD_CONFIG;
		this.fileChooser.showOpenDialog(this);
	}//GEN-LAST:event_loadConfigMenuItemActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		try {
			// Set System L&F
			UIManager.setLookAndFeel(
					UIManager.getSystemLookAndFeelClassName());
		} catch (javax.swing.UnsupportedLookAndFeelException e) {
			// handle exception
		} catch (ClassNotFoundException e) {
			// handle exception
		} catch (InstantiationException e) {
			// handle exception
		} catch (IllegalAccessException e) {
			// handle exception
		}

		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				new Sandpiles().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu editMenu;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenuItem loadConfigMenuItem;
    private javax.swing.JMenuItem loadGraphMenuItem;
    private javax.swing.JMenuItem quitMenuItem;
    private org.headb.SandpilesInteractionPanel sandpilesInteractionPanel1;
    private javax.swing.JMenuItem saveConfigMenuItem;
    private javax.swing.JMenuItem saveGraphMenuItem;
    // End of variables declaration//GEN-END:variables
}
