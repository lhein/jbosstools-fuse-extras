/*******************************************************************************
* Copyright (c) 2014 Red Hat, Inc.
* Distributed under license by Red Hat, Inc. All rights reserved.
* This program is made available under the terms of the
* Eclipse Public License v1.0 which accompanies this distribution,
* and is available at http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
* Red Hat, Inc. - initial API and implementation
* William Collins punkhornsw@gmail.com
******************************************************************************/ 
package org.fusesource.ide.sap.ui.properties;

import org.fusesource.ide.sap.ui.properties.uicreator.IServerDataUICreator;
import org.fusesource.ide.sap.ui.properties.uicreator.SncServerDataUICreator;

public class SncServerPropertySection extends ServerDataPropertySection {

	@Override
	protected IServerDataUICreator createUICreator() {
		return new SncServerDataUICreator();
	}	

}
