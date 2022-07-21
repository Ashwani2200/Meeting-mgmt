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

package com.adjecti.meeting.service.impl;

import com.adjecti.meeting.model.Asset;
import com.adjecti.meeting.service.base.AssetServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the asset remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.adjecti.meeting.service.AssetService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=meeting",
		"json.web.service.context.path=Asset"
	},
	service = AopService.class
)
public class AssetServiceImpl extends AssetServiceBaseImpl {

	public Asset addAsset(String name, String assetModel, String purchaseDate, String serialNo, boolean status,
			boolean roomAssigned, ServiceContext serviceContext) {
		return assetLocalService.addAsset(name, assetModel, purchaseDate, serialNo, status, roomAssigned, serviceContext);
	}

	public Asset updateAsset(long assetId, String name, String assetModel, String purchaseDate, String serialNo,
			boolean status, boolean roomAssigned, ServiceContext serviceContext) throws PortalException {
		return assetLocalService.updateAsset(assetId, name, assetModel, purchaseDate, serialNo, status, roomAssigned, serviceContext);

	}

	public Asset deleteContact(long assetId) throws PortalException {
		return assetLocalService.deleteAsset(assetId);
	}

	public Asset getByAssetId(long assetId) throws PortalException {
		return assetLocalService.getByAssetId(assetId);
	}

	public List<Asset> getAllAsset() throws PortalException {
		return assetLocalService.getAllAsset();
	}
}