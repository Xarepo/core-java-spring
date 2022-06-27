/********************************************************************************
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Arrowhead Consortia - conceptualization
 ********************************************************************************/

package eu.arrowhead.core.ditto;

import eu.arrowhead.common.CommonConstants;

public class Constants {

	//=================================================================================================
	// members

	public static final String DITTO_HTTP_ADDRESS = "ditto_http_address";
	public static final String $DITTO_HTTP_ADDRESS_WD = "${" + DITTO_HTTP_ADDRESS + "}";

	public static final String DITTO_WS_ADDRESS = "ditto_ws_address";
	public static final String $DITTO_WS_ADDRESS_WD = "${" + DITTO_WS_ADDRESS + "}";

	public static final String DITTO_USERNAME = "ditto_username";
	public static final String $DITTO_USERNAME = "${" + DITTO_USERNAME + "}";

	public static final String DITTO_PASSWORD = "ditto_password";
	public static final String $DITTO_PASSWORD = "${" + DITTO_PASSWORD + "}";

	public static final String SERVICE_URI_TEMPLATE = CommonConstants.DITTO_URI + "/things/%s/features/%s";
	public static final String SERVICE_DEFINITIONS = "serviceDefinitions";
	public static final String ENTITY_ID = "entityId";

	public static final String DITTO_POLICY_ID = "eu.arrowhead:ah-ditto";

	//=================================================================================================
	// assistant methods

	//-------------------------------------------------------------------------------------------------
	private Constants() {
		throw new UnsupportedOperationException();
	}
}
