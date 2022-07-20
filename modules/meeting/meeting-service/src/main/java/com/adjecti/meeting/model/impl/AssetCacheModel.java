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

package com.adjecti.meeting.model.impl;

import com.adjecti.meeting.model.Asset;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Asset in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AssetCacheModel implements CacheModel<Asset>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AssetCacheModel)) {
			return false;
		}

		AssetCacheModel assetCacheModel = (AssetCacheModel)object;

		if (assetId == assetCacheModel.assetId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, assetId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", assetId=");
		sb.append(assetId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", assetModel=");
		sb.append(assetModel);
		sb.append(", purchaseDate=");
		sb.append(purchaseDate);
		sb.append(", serialNo=");
		sb.append(serialNo);
		sb.append(", status=");
		sb.append(status);
		sb.append(", roomAssigned=");
		sb.append(roomAssigned);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Asset toEntityModel() {
		AssetImpl assetImpl = new AssetImpl();

		if (uuid == null) {
			assetImpl.setUuid("");
		}
		else {
			assetImpl.setUuid(uuid);
		}

		assetImpl.setAssetId(assetId);
		assetImpl.setGroupId(groupId);
		assetImpl.setCompanyId(companyId);
		assetImpl.setUserId(userId);

		if (userName == null) {
			assetImpl.setUserName("");
		}
		else {
			assetImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			assetImpl.setCreateDate(null);
		}
		else {
			assetImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			assetImpl.setModifiedDate(null);
		}
		else {
			assetImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			assetImpl.setName("");
		}
		else {
			assetImpl.setName(name);
		}

		if (assetModel == null) {
			assetImpl.setAssetModel("");
		}
		else {
			assetImpl.setAssetModel(assetModel);
		}

		if (purchaseDate == null) {
			assetImpl.setPurchaseDate("");
		}
		else {
			assetImpl.setPurchaseDate(purchaseDate);
		}

		if (serialNo == null) {
			assetImpl.setSerialNo("");
		}
		else {
			assetImpl.setSerialNo(serialNo);
		}

		assetImpl.setStatus(status);
		assetImpl.setRoomAssigned(roomAssigned);

		assetImpl.resetOriginalValues();

		return assetImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		assetId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		assetModel = objectInput.readUTF();
		purchaseDate = objectInput.readUTF();
		serialNo = objectInput.readUTF();

		status = objectInput.readBoolean();

		roomAssigned = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(assetId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (assetModel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assetModel);
		}

		if (purchaseDate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(purchaseDate);
		}

		if (serialNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(serialNo);
		}

		objectOutput.writeBoolean(status);

		objectOutput.writeBoolean(roomAssigned);
	}

	public String uuid;
	public long assetId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String assetModel;
	public String purchaseDate;
	public String serialNo;
	public boolean status;
	public boolean roomAssigned;

}