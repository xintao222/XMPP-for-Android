/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.harmony.security.x509;

import java.security.PublicKey;

public class X509PublicKey implements PublicKey {

	private final String algorithm;

	private final byte[] encoded;

	public X509PublicKey(String algorithm, byte[] encoded, byte[] keyBytes) {
		this.algorithm = algorithm;
		this.encoded = encoded;
	}

	@Override
	public String getAlgorithm() {
		return algorithm;
	}

	@Override
	public byte[] getEncoded() {
		return encoded;
	}

	@Override
	public String getFormat() {
		return "X.509"; // $NON-NLS-1$
	}

	@Override
	public String toString() {
		final StringBuilder buf = new StringBuilder("algorithm = "); // $NON-NLS-1$
		buf.append(algorithm);
		buf.append(", params unparsed, unparsed keybits = \n"); // $NON-NLS-1$
		// TODO: implement compatible toString method()
		// buf.append(Arrays.toString(keyBytes));

		return buf.toString();
	}
}
