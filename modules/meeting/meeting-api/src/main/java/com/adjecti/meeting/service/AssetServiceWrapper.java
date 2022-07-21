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
 * Provides a wrapper for {@link AssetService}.
 *
 * @author Brian Wing Shun Chan
 * @see AssetService
 * @generated
 */
public class AssetServiceWrapper
	implements AssetService, ServiceWrapper<AssetService> {

	public AssetServiceWrapper(AssetService assetService) {
		_assetService = assetService;
	}

	@Override
	public com.adjecti.meeting.model.Asset addAsset(
		String name, String assetModel, String purchaseDate, String serialNo,
		boolean status, boolean roomAssigned,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return _assetService.addAsset(
			name, assetModel, purchaseDate, serialNo, status, roomAssigned,
			serviceContext);
	}

	@Override
	public com.adjecti.meeting.model.Asset deleteContact(long assetId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assetService.deleteContact(assetId);
	}

	@Override
	public java.util.List<com.adjecti.meeting.model.Asset> getAllAsset()
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assetService.getAllAsset();
	}

	@Override
	public com.adjecti.meeting.model.Asset getByAssetId(long assetId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assetService.getByAssetId(assetId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _assetService.getOSGiServiceIdentifier();
	}

	@Override
	public com.adjecti.meeting.model.Asset updateAsset(
			long assetId, String name, String assetModel, String purchaseDate,
			String serialNo, boolean status, boolean roomAssigned,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assetService.updateAsset(
			assetId, name, assetModel, purchaseDate, serialNo, status,
			roomAssigned, serviceContext);
	}

	@Override
	public AssetService getWrappedService() {
		return _assetService;
	}

	@Override
	public void setWrappedService(AssetService assetService) {
		_assetService = assetService;
	}

	private AssetService _assetService;

}