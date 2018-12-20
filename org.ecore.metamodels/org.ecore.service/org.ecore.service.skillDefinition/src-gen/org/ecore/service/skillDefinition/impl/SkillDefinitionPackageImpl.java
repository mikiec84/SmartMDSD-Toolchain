/**
 */
package org.ecore.service.skillDefinition.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ecore.base.basicAttributes.BasicAttributesPackage;

import org.ecore.service.skillDefinition.SkillDefinition;
import org.ecore.service.skillDefinition.SkillDefinitionFactory;
import org.ecore.service.skillDefinition.SkillDefinitionModel;
import org.ecore.service.skillDefinition.SkillDefinitionPackage;
import org.ecore.service.skillDefinition.SkillDefinitionRepository;
import org.ecore.service.skillDefinition.SkillDefinitionSet;
import org.ecore.service.skillDefinition.SkillResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SkillDefinitionPackageImpl extends EPackageImpl implements SkillDefinitionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skillDefinitionModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skillDefinitionRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skillDefinitionSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skillDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skillResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum skilL_RESULT_TYPESEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.ecore.service.skillDefinition.SkillDefinitionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SkillDefinitionPackageImpl() {
		super(eNS_URI, SkillDefinitionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SkillDefinitionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SkillDefinitionPackage init() {
		if (isInited)
			return (SkillDefinitionPackage) EPackage.Registry.INSTANCE.getEPackage(SkillDefinitionPackage.eNS_URI);

		// Obtain or create and register package
		SkillDefinitionPackageImpl theSkillDefinitionPackage = (SkillDefinitionPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof SkillDefinitionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new SkillDefinitionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasicAttributesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSkillDefinitionPackage.createPackageContents();

		// Initialize created meta-data
		theSkillDefinitionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSkillDefinitionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SkillDefinitionPackage.eNS_URI, theSkillDefinitionPackage);
		return theSkillDefinitionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSkillDefinitionModel() {
		return skillDefinitionModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSkillDefinitionModel_Repository() {
		return (EReference) skillDefinitionModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSkillDefinitionRepository() {
		return skillDefinitionRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkillDefinitionRepository_Name() {
		return (EAttribute) skillDefinitionRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSkillDefinitionRepository_Sets() {
		return (EReference) skillDefinitionRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSkillDefinitionSet() {
		return skillDefinitionSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkillDefinitionSet_Name() {
		return (EAttribute) skillDefinitionSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSkillDefinitionSet_Skills() {
		return (EReference) skillDefinitionSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSkillDefinition() {
		return skillDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkillDefinition_Name() {
		return (EAttribute) skillDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSkillDefinition_InAttribute() {
		return (EReference) skillDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSkillDefinition_OutAttribute() {
		return (EReference) skillDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSkillDefinition_Results() {
		return (EReference) skillDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSkillResult() {
		return skillResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkillResult_Result() {
		return (EAttribute) skillResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkillResult_ResultValue() {
		return (EAttribute) skillResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSKILL_RESULT_TYPES() {
		return skilL_RESULT_TYPESEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkillDefinitionFactory getSkillDefinitionFactory() {
		return (SkillDefinitionFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		skillDefinitionModelEClass = createEClass(SKILL_DEFINITION_MODEL);
		createEReference(skillDefinitionModelEClass, SKILL_DEFINITION_MODEL__REPOSITORY);

		skillDefinitionRepositoryEClass = createEClass(SKILL_DEFINITION_REPOSITORY);
		createEAttribute(skillDefinitionRepositoryEClass, SKILL_DEFINITION_REPOSITORY__NAME);
		createEReference(skillDefinitionRepositoryEClass, SKILL_DEFINITION_REPOSITORY__SETS);

		skillDefinitionSetEClass = createEClass(SKILL_DEFINITION_SET);
		createEAttribute(skillDefinitionSetEClass, SKILL_DEFINITION_SET__NAME);
		createEReference(skillDefinitionSetEClass, SKILL_DEFINITION_SET__SKILLS);

		skillDefinitionEClass = createEClass(SKILL_DEFINITION);
		createEAttribute(skillDefinitionEClass, SKILL_DEFINITION__NAME);
		createEReference(skillDefinitionEClass, SKILL_DEFINITION__IN_ATTRIBUTE);
		createEReference(skillDefinitionEClass, SKILL_DEFINITION__OUT_ATTRIBUTE);
		createEReference(skillDefinitionEClass, SKILL_DEFINITION__RESULTS);

		skillResultEClass = createEClass(SKILL_RESULT);
		createEAttribute(skillResultEClass, SKILL_RESULT__RESULT);
		createEAttribute(skillResultEClass, SKILL_RESULT__RESULT_VALUE);

		// Create enums
		skilL_RESULT_TYPESEEnum = createEEnum(SKILL_RESULT_TYPES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasicAttributesPackage theBasicAttributesPackage = (BasicAttributesPackage) EPackage.Registry.INSTANCE
				.getEPackage(BasicAttributesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(skillDefinitionModelEClass, SkillDefinitionModel.class, "SkillDefinitionModel", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSkillDefinitionModel_Repository(), this.getSkillDefinitionRepository(), null, "repository",
				null, 0, 1, SkillDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skillDefinitionRepositoryEClass, SkillDefinitionRepository.class, "SkillDefinitionRepository",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSkillDefinitionRepository_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				SkillDefinitionRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSkillDefinitionRepository_Sets(), this.getSkillDefinitionSet(), null, "sets", null, 0, -1,
				SkillDefinitionRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skillDefinitionSetEClass, SkillDefinitionSet.class, "SkillDefinitionSet", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSkillDefinitionSet_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				SkillDefinitionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSkillDefinitionSet_Skills(), this.getSkillDefinition(), null, "skills", null, 0, -1,
				SkillDefinitionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skillDefinitionEClass, SkillDefinition.class, "SkillDefinition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSkillDefinition_Name(), ecorePackage.getEString(), "name", null, 1, 1, SkillDefinition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSkillDefinition_InAttribute(), theBasicAttributesPackage.getAttributeDefinition(), null,
				"inAttribute", null, 0, -1, SkillDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSkillDefinition_OutAttribute(), theBasicAttributesPackage.getAttributeDefinition(), null,
				"outAttribute", null, 0, -1, SkillDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSkillDefinition_Results(), this.getSkillResult(), null, "results", null, 1, -1,
				SkillDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skillResultEClass, SkillResult.class, "SkillResult", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSkillResult_Result(), this.getSKILL_RESULT_TYPES(), "result", null, 0, 1, SkillResult.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSkillResult_ResultValue(), ecorePackage.getEString(), "resultValue", null, 0, 1,
				SkillResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(skilL_RESULT_TYPESEEnum, org.ecore.service.skillDefinition.SKILL_RESULT_TYPES.class,
				"SKILL_RESULT_TYPES");
		addEEnumLiteral(skilL_RESULT_TYPESEEnum, org.ecore.service.skillDefinition.SKILL_RESULT_TYPES.SUCCESS);
		addEEnumLiteral(skilL_RESULT_TYPESEEnum, org.ecore.service.skillDefinition.SKILL_RESULT_TYPES.ERROR);

		// Create resource
		createResource(eNS_URI);
	}

} //SkillDefinitionPackageImpl
