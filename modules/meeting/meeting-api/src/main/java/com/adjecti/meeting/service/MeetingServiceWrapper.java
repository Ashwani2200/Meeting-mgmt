/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.adjecti.meeting.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MeetingService}.
 *
 * @author Brian Wing Shun Chan
 * @see MeetingService
 * @generated
 */
public class MeetingServiceWrapper
	implements MeetingService, ServiceWrapper<MeetingService> {

	public MeetingServiceWrapper(MeetingService meetingService) {
		_meetingService = meetingService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _meetingService.getOSGiServiceIdentifier();
	}

	@Override
	public MeetingService getWrappedService() {
		return _meetingService;
	}

	@Override
	public void setWrappedService(MeetingService meetingService) {
		_meetingService = meetingService;
	}

	private MeetingService _meetingService;

}