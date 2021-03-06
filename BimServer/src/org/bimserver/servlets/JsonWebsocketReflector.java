package org.bimserver.servlets;

/******************************************************************************
 * Copyright (C) 2009-2015  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

import org.bimserver.shared.StreamingSocketInterface;
import org.bimserver.shared.json.JsonReflector;
import org.bimserver.shared.meta.SServicesMap;
import org.slf4j.LoggerFactory;

import com.google.gson.JsonObject;

public class JsonWebsocketReflector extends JsonReflector {

	private StreamingSocketInterface streamingSocket;

	public JsonWebsocketReflector(SServicesMap servicesMap, StreamingSocketInterface streamingSocket) {
		super(servicesMap);
		this.streamingSocket = streamingSocket;
	}

	@Override
	public JsonObject call(JsonObject request) {
		LoggerFactory.getLogger(JsonWebsocketReflector.class).debug("WS: " + request);
		streamingSocket.send(request);
		return new JsonObject();
	}

	@Override
	protected boolean isOneWay() {
		return true;
	}
}