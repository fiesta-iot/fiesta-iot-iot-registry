/*******************************************************************************
 * Copyright (c) 2018 Jorge Lanza, 
 *                    David Gomez, 
 *                    Luis Sanchez,
 *                    Juan Ramon Santana
 *
 * For the full copyright and license information, please view the LICENSE
 * file that is distributed with this source code.
 *******************************************************************************/
package eu.fiesta_iot.platform.iot_registry.idmapper.hashid;

public class HashidObservationIdMappers
        extends HashidEntityIdMappers<HashidObservationIdMapper> {

	public HashidObservationIdMappers() {
		super(HashidObservationIdMapper.class);
	}

	@Override
	public HashidObservationIdMapper get(String hash) {
		HashidObservationIdMapper mapper = new HashidObservationIdMapper();
		mapper.setHash(hash);

		return mapper;
	}
}
