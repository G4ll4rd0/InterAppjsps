/*
 * This source file was generated to EnWeb Soluciones
 * 
 * For more information please visit http://www.solucionesenjambre.com
 * Author: RG
 */

package com.solucionesenjambre.interapp.fs.dao;

import com.solucionesenjambre.interapp.fs.dto.*;
import com.solucionesenjambre.interapp.fs.exceptions.*;

public interface BranchesDao
{
	/** 
	 * Inserts a new row in the branches table.
	 */
	public BranchesPk insert(Branches dto) throws BranchesDaoException;

	/** 
	 * Updates a single row in the branches table.
	 */
	public void update(BranchesPk pk, Branches dto) throws BranchesDaoException;

	/** 
	 * Deletes a single row in the branches table.
	 */
	public void delete(BranchesPk pk) throws BranchesDaoException;

	/** 
	 * Returns the rows from the branches table that matches the specified primary-key value.
	 */
	public Branches findByPrimaryKey(BranchesPk pk) throws BranchesDaoException;

	/** 
	 * Returns all rows from the branches table that match the criteria 'branch_id = :branchId'.
	 */
	public Branches findByPrimaryKey(int branchId) throws BranchesDaoException;

	/** 
	 * Returns all rows from the branches table that match the criteria ''.
	 */
	public Branches[] findAll() throws BranchesDaoException;

	/** 
	 * Returns all rows from the branches table that match the criteria 'branch_id = :branchId'.
	 */
	public Branches[] findWhereBranchIdEquals(int branchId) throws BranchesDaoException;

	/** 
	 * Returns all rows from the branches table that match the criteria 'description = :description'.
	 */
	public Branches[] findWhereDescriptionEquals(String description) throws BranchesDaoException;

	/** 
	 * Returns all rows from the branches table that match the criteria 'code = :code'.
	 */
	public Branches[] findWhereCodeEquals(String code) throws BranchesDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the branches table that match the specified arbitrary SQL statement
	 */
	public Branches[] findByDynamicSelect(String sql, Object[] sqlParams) throws BranchesDaoException;

	/** 
	 * Returns all rows from the branches table that match the specified arbitrary SQL statement
	 */
	public Branches[] findByDynamicWhere(String sql, Object[] sqlParams) throws BranchesDaoException;

}
