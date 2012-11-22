/** 21/Nov/2012 - miniprojecto2 - ist.ln.mp2.KnownWordNode **/
package ist.ln.mp2;

import ist.ln.mp2.NormalizerSimple;

/**
 * The Class KnownWordNode.
 */
public class KnownWordNode {
	
	/** The original string. */
	private String originalString;
	
	/** The normalized string. */
	private String normalizedString;

	/**
	 * Instantiates a new known word node.
	 *
	 * @param originalString the original string
	 */
	public KnownWordNode(String originalString) {
		this.setString(originalString);
	}

	/**
	 * Gets the original string.
	 *
	 * @return the original string
	 */
	public final String getOriginalString() {
		return originalString;
	}

	/**
	 * Gets the normalized string.
	 *
	 * @return the normalized string
	 */
	public final String getNormalizedString() {
		return normalizedString;
	}

	/**
	 * Sets the string.
	 *
	 * @param inputString the new string
	 */
	public final void setString(String inputString) {
		this.originalString = inputString;
		//this.normalizedString = NormalizerSimple.normPunctLCaseDMarks(inputString);
		this.normalizedString = NormalizerSimple.normPunctLCase(inputString);
	}
}
