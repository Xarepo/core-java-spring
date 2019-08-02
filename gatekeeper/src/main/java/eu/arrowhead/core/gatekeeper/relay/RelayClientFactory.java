package eu.arrowhead.core.gatekeeper.relay;

import java.security.PrivateKey;
import java.security.PublicKey;

import eu.arrowhead.core.gatekeeper.relay.activemq.ActiveMQGatekeeperRelayClient;

public class RelayClientFactory {
	
	//=================================================================================================
	// methods
	
	//-------------------------------------------------------------------------------------------------
	public static GatekeeperRelayClient createGatekeeperRelayClient(final String serverCommonName, final PublicKey publicKey, final PrivateKey privateKey, final long timeout) {
		return new ActiveMQGatekeeperRelayClient(serverCommonName, publicKey, privateKey, timeout);
	}

	//=================================================================================================
	// assistant methods
	
	//-------------------------------------------------------------------------------------------------
	private RelayClientFactory() {
		throw new UnsupportedOperationException();
	}
}