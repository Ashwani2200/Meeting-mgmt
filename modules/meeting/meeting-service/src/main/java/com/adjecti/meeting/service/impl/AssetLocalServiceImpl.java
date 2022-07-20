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
import com.adjecti.meeting.service.base.AssetLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the asset local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>com.adjecti.meeting.service.AssetLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetLocalServiceBaseImpl
 */
@Component(property = "model.class.name=com.adjecti.meeting.model.Asset", service = AopService.class)
public class AssetLocalServiceImpl extends AssetLocalServiceBaseImpl {

	public Asset addAsset(String name, String assetModel, String purchaseDate, String serialNo, boolean status,
			boolean roomAssigned, ServiceContext serviceContext) {
		long assetId = counterLocalService.increment(Asset.class.getName());

		Asset asset = createAsset(assetId);
		asset.setName(name);
		asset.setAssetModel(assetModel);
		asset.setPurchaseDate(purchaseDate);
		asset.setSerialNo(serialNo);
		asset.setStatus(status);
		asset.setRoomAssigned(roomAssigned);

		return super.addAsset(asset);
	}

	public Asset updateAsset(long assetId, String name, String assetModel, String purchaseDate, String serialNo,
			boolean status, boolean roomAssigned, ServiceContext serviceContext) throws PortalException {

		Asset asset = getAsset(assetId);
		asset.setName(name);
		asset.setAssetModel(assetModel);
		asset.setPurchaseDate(purchaseDate);
		asset.setSerialNo(serialNo);
		asset.setStatus(status);
		asset.setRoomAssigned(roomAssigned);

		return super.updateAsset(asset);
	}

	public Asset deleteContact(long assetId) throws PortalException {
		return assetLocalService.deleteAsset(assetId);

	}

	public Asset getByAssetId(long assetId) throws PortalException {
		return assetLocalService.getAsset(assetId);
	}

	public List<Asset> getAllAsset() throws PortalException {
		return assetLocalService.getAssets(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

}