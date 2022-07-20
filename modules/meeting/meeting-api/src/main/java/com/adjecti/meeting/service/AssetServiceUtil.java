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

import com.adjecti.meeting.model.Asset;

import com.liferay.portal.kernel.exception.PortalException;

import java.util.List;

/**
 * Provides the remote service utility for Asset. This utility wraps
 * <code>com.adjecti.meeting.service.impl.AssetServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AssetService
 * @generated
 */
public class AssetServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.adjecti.meeting.service.impl.AssetServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Asset addAsset(
		String name, String assetModel, String purchaseDate, String serialNo,
		boolean status, boolean roomAssigned,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return getService().addAsset(
			name, assetModel, purchaseDate, serialNo, status, roomAssigned,
			serviceContext);
	}

	public static Asset deleteContact(long assetId) throws PortalException {
		return getService().deleteContact(assetId);
	}

	public static List<Asset> getAllAsset() throws PortalException {
		return getService().getAllAsset();
	}

	public static Asset getByAssetId(long assetId) throws PortalException {
		return getService().getByAssetId(assetId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static Asset updateAsset(
			long assetId, String name, String assetModel, String purchaseDate,
			String serialNo, boolean status, boolean roomAssigned,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateAsset(
			assetId, name, assetModel, purchaseDate, serialNo, status,
			roomAssigned, serviceContext);
	}

	public static AssetService getService() {
		return _service;
	}

	private static volatile AssetService _service;

}