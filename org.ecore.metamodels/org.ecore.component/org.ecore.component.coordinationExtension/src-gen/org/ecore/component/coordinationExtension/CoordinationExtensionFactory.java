/**
 */
package org.ecore.component.coordinationExtension;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ecore.component.coordinationExtension.CoordinationExtensionPackage
 * @generated
 */
public interface CoordinationExtensionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoordinationExtensionFactory eINSTANCE = org.ecore.component.coordinationExtension.impl.CoordinationExtensionFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Public Operation Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Public Operation Mode</em>'.
	 * @generated
	 */
	PublicOperationMode createPublicOperationMode();

	/**
	 * Returns a new object of class '<em>Private Operation Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Private Operation Mode</em>'.
	 * @generated
	 */
	PrivateOperationMode createPrivateOperationMode();

	/**
	 * Returns a new object of class '<em>Coordination Slave Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordination Slave Port</em>'.
	 * @generated
	 */
	CoordinationSlavePort createCoordinationSlavePort();

	/**
	 * Returns a new object of class '<em>Coordination Master Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordination Master Port</em>'.
	 * @generated
	 */
	CoordinationMasterPort createCoordinationMasterPort();

	/**
	 * Returns a new object of class '<em>Operation Mode Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Mode Binding</em>'.
	 * @generated
	 */
	OperationModeBinding createOperationModeBinding();

	/**
	 * Returns a new object of class '<em>Communication Service Usage Realization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Service Usage Realization</em>'.
	 * @generated
	 */
	CommunicationServiceUsageRealization createCommunicationServiceUsageRealization();

	/**
	 * Returns a new object of class '<em>Skill Realizations Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skill Realizations Ref</em>'.
	 * @generated
	 */
	SkillRealizationsRef createSkillRealizationsRef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CoordinationExtensionPackage getCoordinationExtensionPackage();

} //CoordinationExtensionFactory
