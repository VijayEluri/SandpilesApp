/*
Copyright (c) 2008-2009 Bryan Head
All Rights Reserved

[This software is released under the "MIT License"]

Permission is hereby granted, free of charge, to any person
obtaining a copy of this software and associated
documentation files (the "Software"), to deal in the
Software without restriction, including without limitation
the rights to use, copy, modify, merge, publish, distribute,
sublicense, and/or sell copies of the Software, and to
permit persons to whom the Software is furnished to do so,
subject to the following conditions:

The above copyright notice and this permission notice shall
be included in all copies or substantial portions of the
Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY
KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR
OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/

package org.headb;


import javax.swing.UIManager;
import javax.swing.filechooser.FileFilter;
import java.io.File;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import java.io.IOException;

public class Sandpiles extends javax.swing.JFrame {

	private final int SAVE_PROJECT = 0, LOAD_PROJECT = 1, SAVE_CONFIG = 2, LOAD_CONFIG = 3;
	private int fileAction=-1;


	/** Creates new form Sandpiles */
	public Sandpiles() {
		initComponents();
		this.setTitle("Sandpiles - Untitled");
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        projectFileChooser = new javax.swing.JFileChooser();
        imageFileChooser = new javax.swing.JFileChooser(new File(System.getProperty("user.home")));
        sandpilesIP = new org.headb.SandpilesInteractionPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        saveProjectAsMenuItem = new javax.swing.JMenuItem();
        saveProjectMenuItem = new javax.swing.JMenuItem();
        openProjectMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuItem1 = new javax.swing.JMenuItem();
        quitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        undoMenuItem = new javax.swing.JMenuItem();
        redoMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        copyMenuItem = new javax.swing.JMenuItem();
        cutMenuItem2 = new javax.swing.JMenuItem();
        pasteMenuItem3 = new javax.swing.JMenuItem();

        projectFileChooser.setAcceptAllFileFilterUsed(false);
        projectFileChooser.setDialogType(javax.swing.JFileChooser.CUSTOM_DIALOG);
        projectFileChooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        projectFileChooser.setFileFilter(new FileFilter(){
            public boolean accept(File file) {
                if(file!=null && file.isDirectory()){
                    for(String s : file.list()){
                        if(s.equals("graph.sg"))
                        return true;
                    }
                }
                return false;
            }
            public String getDescription(){
                return "Accepts directories that contain a graph.sg file.";
            }
        });
        projectFileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectFileChooserActionPerformed(evt);
            }
        });

        imageFileChooser.setDialogTitle("Save Image");
        imageFileChooser.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        imageFileChooser.setFileFilter(new FileFilter() {
            @Override public boolean accept(File f){
                return f.getName().endsWith(".png");
            }
            @Override public String getDescription(){
                return "PNG Image";
            }
        });
        imageFileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageFileChooserActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setText("File");

        saveProjectAsMenuItem.setText("Save Project as");
        saveProjectAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveProjectAsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveProjectAsMenuItem);

        saveProjectMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S,java.awt.Toolkit.getDefaultToolkit().getMenuShortcutKeyMask() ));
        saveProjectMenuItem.setText("Save Project");
        saveProjectMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveProjectMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveProjectMenuItem);

        openProjectMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O,java.awt.Toolkit.getDefaultToolkit().getMenuShortcutKeyMask() ));
        openProjectMenuItem.setText("Open Project");
        openProjectMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openProjectMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openProjectMenuItem);
        fileMenu.add(jSeparator1);

        jMenuItem1.setText("Save as Image");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem1);

        quitMenuItem.setText("Quit");
        quitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(quitMenuItem);

        jMenuBar1.add(fileMenu);

        editMenu.setText("Edit");

        undoMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z,java.awt.Toolkit.getDefaultToolkit().getMenuShortcutKeyMask() ));
        undoMenuItem.setText("Undo");
        undoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(undoMenuItem);

        redoMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y,java.awt.Toolkit.getDefaultToolkit().getMenuShortcutKeyMask() ));
        redoMenuItem.setText("Redo");
        redoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redoMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(redoMenuItem);
        editMenu.add(jSeparator2);

        copyMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C,java.awt.Toolkit.getDefaultToolkit().getMenuShortcutKeyMask() ));
        copyMenuItem.setText("Copy");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(copyMenuItem);

        cutMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X,java.awt.Toolkit.getDefaultToolkit().getMenuShortcutKeyMask() ));
        cutMenuItem2.setMnemonic(KeyEvent.VK_X);
        cutMenuItem2.setText("Cut");
        cutMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItem2ActionPerformed(evt);
            }
        });
        editMenu.add(cutMenuItem2);

        pasteMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V,java.awt.Toolkit.getDefaultToolkit().getMenuShortcutKeyMask() ));
        pasteMenuItem3.setMnemonic(KeyEvent.VK_V);
        pasteMenuItem3.setText("Paste");
        pasteMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteMenuItem3ActionPerformed(evt);
            }
        });
        editMenu.add(pasteMenuItem3);

        jMenuBar1.add(editMenu);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(sandpilesIP, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(sandpilesIP, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void quitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitMenuItemActionPerformed
		System.exit(0);
	}//GEN-LAST:event_quitMenuItemActionPerformed

	private void projectFileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectFileChooserActionPerformed

		if(evt.getActionCommand().equals(projectFileChooser.APPROVE_SELECTION)){
			boolean success=true;
			switch(fileAction){
				case SAVE_PROJECT:
					this.sandpilesIP.getSandpileController().saveGraphProject(projectFileChooser.getSelectedFile());
					break;
				case LOAD_PROJECT:
					success=this.sandpilesIP.getSandpileController().loadGraphProject(projectFileChooser.getSelectedFile());
					break;
				case SAVE_CONFIG:
					this.sandpilesIP.getSandpileController().saveConfig(projectFileChooser.getSelectedFile());
					break;
				case LOAD_CONFIG:
					this.sandpilesIP.getSandpileController().loadCurrentConfig(projectFileChooser.getSelectedFile());
					break;
			}
			if(!success)
				javax.swing.JOptionPane.showMessageDialog(this,
						"That's not a valid Sandpiles project. Sandpiles project directories must contain a graph.sg file.",
						"Invalid Project Directory", javax.swing.JOptionPane.ERROR_MESSAGE);
		}
		fileAction = -1;
		this.setTitle("Sandpiles - "+sandpilesIP.getSandpileController().getProjectTitle());
}//GEN-LAST:event_projectFileChooserActionPerformed

	private void saveProjectAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveProjectAsMenuItemActionPerformed
		fileAction = SAVE_PROJECT;
		this.projectFileChooser.showSaveDialog(this);
		this.sandpilesIP.updateConfigSelectList();
}//GEN-LAST:event_saveProjectAsMenuItemActionPerformed

	private void openProjectMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openProjectMenuItemActionPerformed
		fileAction = LOAD_PROJECT;
		this.projectFileChooser.showOpenDialog(this);
		this.sandpilesIP.updateConfigSelectList();
}//GEN-LAST:event_openProjectMenuItemActionPerformed

	private void saveProjectMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveProjectMenuItemActionPerformed
		if(this.sandpilesIP.getSandpileController().hasProjectFile()){
			this.sandpilesIP.getSandpileController().saveGraphProject();
		}else{
			saveProjectAsMenuItemActionPerformed(evt);
		}
		this.sandpilesIP.updateConfigSelectList();
	}//GEN-LAST:event_saveProjectMenuItemActionPerformed

	private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
		sandpilesIP.copySelectedToClipboard();
	}//GEN-LAST:event_copyMenuItemActionPerformed

	private void cutMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItem2ActionPerformed
		sandpilesIP.cutSelectedToClipBoard();
	}//GEN-LAST:event_cutMenuItem2ActionPerformed

	private void pasteMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteMenuItem3ActionPerformed
		sandpilesIP.pasteVertexDataFromClipboard();
	}//GEN-LAST:event_pasteMenuItem3ActionPerformed

	private void undoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoMenuItemActionPerformed
		try{
			sandpilesIP.getSandpileController().undoManager.undo();
		}catch(javax.swing.undo.CannotUndoException e){
			java.awt.Toolkit.getDefaultToolkit().beep();
		}
	}//GEN-LAST:event_undoMenuItemActionPerformed

	private void redoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redoMenuItemActionPerformed
		try{
			sandpilesIP.getSandpileController().undoManager.redo();
		}catch(javax.swing.undo.CannotRedoException e){
			java.awt.Toolkit.getDefaultToolkit().beep();
		}
	}//GEN-LAST:event_redoMenuItemActionPerformed

	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
		imageFileChooser.showSaveDialog(this);
	}//GEN-LAST:event_jMenuItem1ActionPerformed

	private void imageFileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageFileChooserActionPerformed
		if(evt.getActionCommand().equals(imageFileChooser.APPROVE_SELECTION)){
			BufferedImage image = sandpilesIP.getCanvasShot();
			File file = imageFileChooser.getSelectedFile();
			try{
				ImageIO.write(image, "png", file);
			}catch(IOException e){
				JOptionPane.showMessageDialog(this, "Unable to write image: "+e.getMessage());
			}
		}
	}//GEN-LAST:event_imageFileChooserActionPerformed

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
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem2;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JFileChooser imageFileChooser;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenuItem openProjectMenuItem;
    private javax.swing.JMenuItem pasteMenuItem3;
    private javax.swing.JFileChooser projectFileChooser;
    private javax.swing.JMenuItem quitMenuItem;
    private javax.swing.JMenuItem redoMenuItem;
    private org.headb.SandpilesInteractionPanel sandpilesIP;
    private javax.swing.JMenuItem saveProjectAsMenuItem;
    private javax.swing.JMenuItem saveProjectMenuItem;
    private javax.swing.JMenuItem undoMenuItem;
    // End of variables declaration//GEN-END:variables
}
