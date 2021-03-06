package org.beansugar.oauth.extractors;

import org.beansugar.oauth.net.OAuthRequest;

/**
 * Simple command object that extracts a base string from a {@link org.beansugar.oauth.net.OAuthRequest}
 *
 * @author Pablo Fernandez
 */
public interface BaseStringExtractor {
	/**
	 * Extracts an url-encoded base string from the {@link org.beansugar.oauth.net.OAuthRequest}.
	 * <p>
	 * See <a href="http://oauth.net/core/1.0/#anchor14">the oauth spec</a> for more info on this.
	 *
	 * @param request the OAuthRequest
	 * @return the url-encoded base string
	 */
	String extract(OAuthRequest request);
}
