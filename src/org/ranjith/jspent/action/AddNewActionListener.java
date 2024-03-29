/**
 * 
 */
package org.ranjith.jspent.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import org.ranjith.jspent.ui.JSpent;

/**
 * Handler to add new action performed on the toolbar.
 * @author ranjith
 *
 */
public class AddNewActionListener implements ActionListener {
	JSpent application;
	public AddNewActionListener(JSpent application) {
		this.application = application;
	}

	/**
	 * Check what is the current context and based on it, show the 'add new'
	 * form.
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(application.getCurrentContext().equals(JSpent.CTX_EXPENSES)) {
		    application.addNewRow();
			//application.showExpenseForm();
		}else if(application.getCurrentContext().equals(JSpent.CTX_INCOMES)) {
			JOptionPane.showMessageDialog(application, "Not implemented yet");
		}else if(application.getCurrentContext().equals(JSpent.CTX_SAVINGS)) {
			application.showAddSavings();
		}else if(application.getCurrentContext().equals(JSpent.CTX_LIABILITIES)) {
			JOptionPane.showMessageDialog(application, "Not implemented yet");
		}else if(application.getCurrentContext().equals(JSpent.CTX_SUMMARY)) {
			JOptionPane.showMessageDialog(application, "Not implemented yet");
		}
	}

}
