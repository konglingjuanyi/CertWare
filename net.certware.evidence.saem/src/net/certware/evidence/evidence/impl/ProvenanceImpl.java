/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  
 */

package net.certware.evidence.evidence.impl;

import net.certware.evidence.evidence.EvidencePackage;
import net.certware.evidence.evidence.Provenance;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provenance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ProvenanceImpl extends EvidencePropertyImpl implements Provenance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvenanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.PROVENANCE;
	}

} //ProvenanceImpl
