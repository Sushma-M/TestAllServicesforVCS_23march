/*Copyright (c) 2016-2017 vcstest4.com All Rights Reserved.
 This software is the confidential and proprietary information of vcstest4.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with vcstest4.com*/
package com.testallservicesforvcs.adventureworks2014.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.DataExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testallservicesforvcs.adventureworks2014.Table13;

/**
 * Service object for domain model class {@link Table13}.
 */
public interface Table13Service {

    /**
     * Creates a new Table13. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Table13 if any.
     *
     * @param table13 Details of the Table13 to be created; value cannot be null.
     * @return The newly created Table13.
     */
    Table13 create(@Valid Table13 table13);


	/**
     * Returns Table13 by given id if exists.
     *
     * @param table13Id The id of the Table13 to get; value cannot be null.
     * @return Table13 associated with the given table13Id.
	 * @throws EntityNotFoundException If no Table13 is found.
     */
    Table13 getById(Integer table13Id);

    /**
     * Find and return the Table13 by given id if exists, returns null otherwise.
     *
     * @param table13Id The id of the Table13 to get; value cannot be null.
     * @return Table13 associated with the given table13Id.
     */
    Table13 findById(Integer table13Id);

	/**
     * Find and return the list of Table13s by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param table13Ids The id's of the Table13 to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return Table13s associated with the given table13Ids.
     */
    List<Table13> findByMultipleIds(List<Integer> table13Ids, boolean orderedReturn);


    /**
     * Updates the details of an existing Table13. It replaces all fields of the existing Table13 with the given table13.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Table13 if any.
     *
     * @param table13 The details of the Table13 to be updated; value cannot be null.
     * @return The updated Table13.
     * @throws EntityNotFoundException if no Table13 is found with given input.
     */
    Table13 update(@Valid Table13 table13);

    /**
     * Deletes an existing Table13 with the given id.
     *
     * @param table13Id The id of the Table13 to be deleted; value cannot be null.
     * @return The deleted Table13.
     * @throws EntityNotFoundException if no Table13 found with the given id.
     */
    Table13 delete(Integer table13Id);

    /**
     * Deletes an existing Table13 with the given object.
     *
     * @param table13 The instance of the Table13 to be deleted; value cannot be null.
     */
    void delete(Table13 table13);

    /**
     * Find all Table13s matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Table13s.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<Table13> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all Table13s matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Table13s.
     *
     * @see Pageable
     * @see Page
     */
    Page<Table13> findAll(String query, Pageable pageable);

    /**
     * Exports all Table13s matching the given input query to the given exportType format.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param exportType The format in which to export the data; value cannot be null.
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return The Downloadable file in given export type.
     *
     * @see Pageable
     * @see ExportType
     * @see Downloadable
     */
    Downloadable export(ExportType exportType, String query, Pageable pageable);

    /**
     * Exports all Table13s matching the given input query to the given exportType format.
     *
     * @param options The export options provided by the user; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @param outputStream The output stream of the file for the exported data to be written to.
     *
     * @see DataExportOptions
     * @see Pageable
     * @see OutputStream
     */
    void export(DataExportOptions options, Pageable pageable, OutputStream outputStream);

    /**
     * Retrieve the count of the Table13s in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the Table13.
     */
    long count(String query);

    /**
     * Retrieve aggregated values with matching aggregation info.
     *
     * @param aggregationInfo info related to aggregations.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return Paginated data with included fields.
     *
     * @see AggregationInfo
     * @see Pageable
     * @see Page
	 */
    Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable);


}