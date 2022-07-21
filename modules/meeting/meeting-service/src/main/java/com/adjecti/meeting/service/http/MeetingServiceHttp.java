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

package com.adjecti.meeting.service.http;

import com.adjecti.meeting.service.MeetingServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>MeetingServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MeetingServiceSoap
 * @generated
 */
public class MeetingServiceHttp {

	public static com.adjecti.meeting.model.Meeting addMeeting(
		HttpPrincipal httpPrincipal, String title, String dateAndTime,
		String location, String agenda, String description, String createdBy,
		String hostedBy, String meetingType, String meetingRoom,
		String meetingLink, String assetsName, String internalGuest,
		String externalGuest) {

		try {
			MethodKey methodKey = new MethodKey(
				MeetingServiceUtil.class, "addMeeting",
				_addMeetingParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, title, dateAndTime, location, agenda, description,
				createdBy, hostedBy, meetingType, meetingRoom, meetingLink,
				assetsName, internalGuest, externalGuest);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.adjecti.meeting.model.Meeting)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.adjecti.meeting.model.Meeting updateMeeting(
		HttpPrincipal httpPrincipal, String title, String dateAndTime,
		String location, String agenda, String description, String createdBy,
		String hostedBy, String meetingType, String meetingRoom,
		String meetingLink, String assetsName, String internalGuest,
		String externalGuest) {

		try {
			MethodKey methodKey = new MethodKey(
				MeetingServiceUtil.class, "updateMeeting",
				_updateMeetingParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, title, dateAndTime, location, agenda, description,
				createdBy, hostedBy, meetingType, meetingRoom, meetingLink,
				assetsName, internalGuest, externalGuest);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.adjecti.meeting.model.Meeting)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.adjecti.meeting.model.Meeting>
		getAllMeeting(HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				MeetingServiceUtil.class, "getAllMeeting",
				_getAllMeetingParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.adjecti.meeting.model.Meeting>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.adjecti.meeting.model.Meeting deleteById(
			HttpPrincipal httpPrincipal, long meetingId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				MeetingServiceUtil.class, "deleteById",
				_deleteByIdParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, meetingId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.adjecti.meeting.model.Meeting)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.adjecti.meeting.model.Meeting getMeetingById(
			HttpPrincipal httpPrincipal, long meetingId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				MeetingServiceUtil.class, "getMeetingById",
				_getMeetingByIdParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, meetingId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.adjecti.meeting.model.Meeting)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.adjecti.meeting.model.Meeting>
		getMeetingCreatedBy(HttpPrincipal httpPrincipal, String createdBy) {

		try {
			MethodKey methodKey = new MethodKey(
				MeetingServiceUtil.class, "getMeetingCreatedBy",
				_getMeetingCreatedByParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, createdBy);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.adjecti.meeting.model.Meeting>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.adjecti.meeting.model.Meeting>
		getMeetingHostedBy(HttpPrincipal httpPrincipal, String hostedBy) {

		try {
			MethodKey methodKey = new MethodKey(
				MeetingServiceUtil.class, "getMeetingHostedBy",
				_getMeetingHostedByParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, hostedBy);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.adjecti.meeting.model.Meeting>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.adjecti.meeting.model.Meeting>
		getMeetingLocation(HttpPrincipal httpPrincipal, String location) {

		try {
			MethodKey methodKey = new MethodKey(
				MeetingServiceUtil.class, "getMeetingLocation",
				_getMeetingLocationParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, location);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.adjecti.meeting.model.Meeting>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(MeetingServiceHttp.class);

	private static final Class<?>[] _addMeetingParameterTypes0 = new Class[] {
		String.class, String.class, String.class, String.class, String.class,
		String.class, String.class, String.class, String.class, String.class,
		String.class, String.class, String.class
	};
	private static final Class<?>[] _updateMeetingParameterTypes1 =
		new Class[] {
			String.class, String.class, String.class, String.class,
			String.class, String.class, String.class, String.class,
			String.class, String.class, String.class, String.class, String.class
		};
	private static final Class<?>[] _getAllMeetingParameterTypes2 =
		new Class[] {};
	private static final Class<?>[] _deleteByIdParameterTypes3 = new Class[] {
		long.class
	};
	private static final Class<?>[] _getMeetingByIdParameterTypes4 =
		new Class[] {long.class};
	private static final Class<?>[] _getMeetingCreatedByParameterTypes5 =
		new Class[] {String.class};
	private static final Class<?>[] _getMeetingHostedByParameterTypes6 =
		new Class[] {String.class};
	private static final Class<?>[] _getMeetingLocationParameterTypes7 =
		new Class[] {String.class};

}