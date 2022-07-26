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

package com.adjecti.meeting.service.base;

import com.adjecti.meeting.model.Asset;
import com.adjecti.meeting.service.AssetLocalService;
import com.adjecti.meeting.service.AssetLocalServiceUtil;
import com.adjecti.meeting.service.persistence.AssetPersistence;
import com.adjecti.meeting.service.persistence.EmployeePersistence;
import com.adjecti.meeting.service.persistence.MeetingPersistence;
import com.adjecti.meeting.service.persistence.RoomPersistence;

import com.liferay.exportimport.kernel.lar.ExportImportHelperUtil;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the asset local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.adjecti.meeting.service.impl.AssetLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.adjecti.meeting.service.impl.AssetLocalServiceImpl
 * @generated
 */
public abstract class AssetLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, AssetLocalService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>AssetLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>AssetLocalServiceUtil</code>.
	 */

	/**
	 * Adds the asset to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssetLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param asset the asset
	 * @return the asset that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Asset addAsset(Asset asset) {
		asset.setNew(true);

		return assetPersistence.update(asset);
	}

	/**
	 * Creates a new asset with the primary key. Does not add the asset to the database.
	 *
	 * @param assetId the primary key for the new asset
	 * @return the new asset
	 */
	@Override
	@Transactional(enabled = false)
	public Asset createAsset(long assetId) {
		return assetPersistence.create(assetId);
	}

	/**
	 * Deletes the asset with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssetLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param assetId the primary key of the asset
	 * @return the asset that was removed
	 * @throws PortalException if a asset with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Asset deleteAsset(long assetId) throws PortalException {
		return assetPersistence.remove(assetId);
	}

	/**
	 * Deletes the asset from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssetLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param asset the asset
	 * @return the asset that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Asset deleteAsset(Asset asset) {
		return assetPersistence.remove(asset);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			Asset.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return assetPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.adjecti.meeting.model.impl.AssetModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return assetPersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.adjecti.meeting.model.impl.AssetModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return assetPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return assetPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection) {

		return assetPersistence.countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public Asset fetchAsset(long assetId) {
		return assetPersistence.fetchByPrimaryKey(assetId);
	}

	/**
	 * Returns the asset matching the UUID and group.
	 *
	 * @param uuid the asset's UUID
	 * @param groupId the primary key of the group
	 * @return the matching asset, or <code>null</code> if a matching asset could not be found
	 */
	@Override
	public Asset fetchAssetByUuidAndGroupId(String uuid, long groupId) {
		return assetPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the asset with the primary key.
	 *
	 * @param assetId the primary key of the asset
	 * @return the asset
	 * @throws PortalException if a asset with the primary key could not be found
	 */
	@Override
	public Asset getAsset(long assetId) throws PortalException {
		return assetPersistence.findByPrimaryKey(assetId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(assetLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Asset.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("assetId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(assetLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(Asset.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("assetId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(assetLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Asset.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("assetId");
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		final PortletDataContext portletDataContext) {

		final ExportActionableDynamicQuery exportActionableDynamicQuery =
			new ExportActionableDynamicQuery() {

				@Override
				public long performCount() throws PortalException {
					ManifestSummary manifestSummary =
						portletDataContext.getManifestSummary();

					StagedModelType stagedModelType = getStagedModelType();

					long modelAdditionCount = super.performCount();

					manifestSummary.addModelAdditionCount(
						stagedModelType, modelAdditionCount);

					long modelDeletionCount =
						ExportImportHelperUtil.getModelDeletionCount(
							portletDataContext, stagedModelType);

					manifestSummary.addModelDeletionCount(
						stagedModelType, modelDeletionCount);

					return modelAdditionCount;
				}

			};

		initActionableDynamicQuery(exportActionableDynamicQuery);

		exportActionableDynamicQuery.setAddCriteriaMethod(
			new ActionableDynamicQuery.AddCriteriaMethod() {

				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					portletDataContext.addDateRangeCriteria(
						dynamicQuery, "modifiedDate");
				}

			});

		exportActionableDynamicQuery.setCompanyId(
			portletDataContext.getCompanyId());

		exportActionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Asset>() {

				@Override
				public void performAction(Asset asset) throws PortalException {
					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, asset);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(Asset.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return assetPersistence.create(((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return assetLocalService.deleteAsset((Asset)persistedModel);
	}

	public BasePersistence<Asset> getBasePersistence() {
		return assetPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return assetPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the assets matching the UUID and company.
	 *
	 * @param uuid the UUID of the assets
	 * @param companyId the primary key of the company
	 * @return the matching assets, or an empty list if no matches were found
	 */
	@Override
	public List<Asset> getAssetsByUuidAndCompanyId(
		String uuid, long companyId) {

		return assetPersistence.findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of assets matching the UUID and company.
	 *
	 * @param uuid the UUID of the assets
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of assets
	 * @param end the upper bound of the range of assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching assets, or an empty list if no matches were found
	 */
	@Override
	public List<Asset> getAssetsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Asset> orderByComparator) {

		return assetPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the asset matching the UUID and group.
	 *
	 * @param uuid the asset's UUID
	 * @param groupId the primary key of the group
	 * @return the matching asset
	 * @throws PortalException if a matching asset could not be found
	 */
	@Override
	public Asset getAssetByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return assetPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the assets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.adjecti.meeting.model.impl.AssetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assets
	 * @param end the upper bound of the range of assets (not inclusive)
	 * @return the range of assets
	 */
	@Override
	public List<Asset> getAssets(int start, int end) {
		return assetPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of assets.
	 *
	 * @return the number of assets
	 */
	@Override
	public int getAssetsCount() {
		return assetPersistence.countAll();
	}

	/**
	 * Updates the asset in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssetLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param asset the asset
	 * @return the asset that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Asset updateAsset(Asset asset) {
		return assetPersistence.update(asset);
	}

	@Deactivate
	protected void deactivate() {
		_setLocalServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			AssetLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		assetLocalService = (AssetLocalService)aopProxy;

		_setLocalServiceUtilService(assetLocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return AssetLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Asset.class;
	}

	protected String getModelClassName() {
		return Asset.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = assetPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	private void _setLocalServiceUtilService(
		AssetLocalService assetLocalService) {

		try {
			Field field = AssetLocalServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, assetLocalService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	protected AssetLocalService assetLocalService;

	@Reference
	protected AssetPersistence assetPersistence;

	@Reference
	protected EmployeePersistence employeePersistence;

	@Reference
	protected MeetingPersistence meetingPersistence;

	@Reference
	protected RoomPersistence roomPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetEntryLocalService
		assetEntryLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetTagLocalService
		assetTagLocalService;

}