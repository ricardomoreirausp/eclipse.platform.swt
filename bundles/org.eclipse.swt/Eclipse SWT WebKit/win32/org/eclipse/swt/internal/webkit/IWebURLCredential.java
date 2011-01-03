/*******************************************************************************
 * Copyright (c) 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.internal.webkit;


import org.eclipse.swt.internal.ole.win32.*;

public class IWebURLCredential extends IUnknown {

public IWebURLCredential (int /*long*/ address) {
	super (address);
}

public int hasPassword (int[] result) {
	return COM.VtblCall (3, getAddress (), result);
}

public int initWithUser (int /*long*/ user, int /*long*/ password, int /*long*/ persistence) {
	return COM.VtblCall (4, getAddress (), user, password, persistence);
}

public int password (int /*long*/[] password) {
	return COM.VtblCall (5, getAddress (), password);
}

public int user (int /*long*/[] result) {
	return COM.VtblCall (7, getAddress (), result);
}

}
