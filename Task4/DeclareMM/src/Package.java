/**
 */
package ;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see .Factory
 * @model kind="package"
 * @generated
 */
public interface Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "null";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "null";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Package eINSTANCE = .impl.PackageImpl.init();

	/**
	 * The meta object id for the '{@link .impl.DeclareModelImpl <em>Declare Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.DeclareModelImpl
	 * @see .impl.PackageImpl#getDeclareModel()
	 * @generated
	 */
	int DECLARE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contains Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_MODEL__CONTAINS_ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Contains Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_MODEL__CONTAINS_TEMPLATE = 2;

	/**
	 * The feature id for the '<em><b>Contains Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_MODEL__CONTAINS_CONNECTION = 3;

	/**
	 * The number of structural features of the '<em>Declare Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Declare Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.ActivityImpl
	 * @see .impl.PackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.TemplateImpl <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.TemplateImpl
	 * @see .impl.PackageImpl#getTemplate()
	 * @generated
	 */
	int TEMPLATE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ltl Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__LTL_EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.ChoiceTemplateImpl <em>Choice Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.ChoiceTemplateImpl
	 * @see .impl.PackageImpl#getChoiceTemplate()
	 * @generated
	 */
	int CHOICE_TEMPLATE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_TEMPLATE__NAME = ACTIVITY__NAME;

	/**
	 * The number of structural features of the '<em>Choice Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_TEMPLATE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Choice Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_TEMPLATE_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link .impl.NegationTemplateImpl <em>Negation Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.NegationTemplateImpl
	 * @see .impl.PackageImpl#getNegationTemplate()
	 * @generated
	 */
	int NEGATION_TEMPLATE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION_TEMPLATE__NAME = ACTIVITY__NAME;

	/**
	 * The number of structural features of the '<em>Negation Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION_TEMPLATE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Negation Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION_TEMPLATE_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link .impl.RelationTemplateImpl <em>Relation Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.RelationTemplateImpl
	 * @see .impl.PackageImpl#getRelationTemplate()
	 * @generated
	 */
	int RELATION_TEMPLATE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TEMPLATE__NAME = ACTIVITY__NAME;

	/**
	 * The number of structural features of the '<em>Relation Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TEMPLATE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Relation Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TEMPLATE_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link .impl.ExistenceTemplateImpl <em>Existence Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.ExistenceTemplateImpl
	 * @see .impl.PackageImpl#getExistenceTemplate()
	 * @generated
	 */
	int EXISTENCE_TEMPLATE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_TEMPLATE__NAME = ACTIVITY__NAME;

	/**
	 * The number of structural features of the '<em>Existence Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_TEMPLATE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Existence Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_TEMPLATE_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link .impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.ConnectionImpl
	 * @see .impl.PackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 7;

	/**
	 * The feature id for the '<em><b>Template Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TEMPLATE_CONNECTION = 0;

	/**
	 * The feature id for the '<em><b>Activity Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ACTIVITY_CONNECTION = 1;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link .DeclareModel <em>Declare Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declare Model</em>'.
	 * @see .DeclareModel
	 * @generated
	 */
	EClass getDeclareModel();

	/**
	 * Returns the meta object for the attribute '{@link .DeclareModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see .DeclareModel#getName()
	 * @see #getDeclareModel()
	 * @generated
	 */
	EAttribute getDeclareModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link .DeclareModel#getContainsActivity <em>Contains Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Activity</em>'.
	 * @see .DeclareModel#getContainsActivity()
	 * @see #getDeclareModel()
	 * @generated
	 */
	EReference getDeclareModel_ContainsActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link .DeclareModel#getContainsTemplate <em>Contains Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Template</em>'.
	 * @see .DeclareModel#getContainsTemplate()
	 * @see #getDeclareModel()
	 * @generated
	 */
	EReference getDeclareModel_ContainsTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link .DeclareModel#getContainsConnection <em>Contains Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Connection</em>'.
	 * @see .DeclareModel#getContainsConnection()
	 * @see #getDeclareModel()
	 * @generated
	 */
	EReference getDeclareModel_ContainsConnection();

	/**
	 * Returns the meta object for class '{@link .Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see .Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link .Activity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see .Activity#getName()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Name();

	/**
	 * Returns the meta object for class '{@link .Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template</em>'.
	 * @see .Template
	 * @generated
	 */
	EClass getTemplate();

	/**
	 * Returns the meta object for the attribute '{@link .Template#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see .Template#getName()
	 * @see #getTemplate()
	 * @generated
	 */
	EAttribute getTemplate_Name();

	/**
	 * Returns the meta object for the attribute '{@link .Template#getLtlExpression <em>Ltl Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ltl Expression</em>'.
	 * @see .Template#getLtlExpression()
	 * @see #getTemplate()
	 * @generated
	 */
	EAttribute getTemplate_LtlExpression();

	/**
	 * Returns the meta object for class '{@link .ChoiceTemplate <em>Choice Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice Template</em>'.
	 * @see .ChoiceTemplate
	 * @generated
	 */
	EClass getChoiceTemplate();

	/**
	 * Returns the meta object for class '{@link .NegationTemplate <em>Negation Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negation Template</em>'.
	 * @see .NegationTemplate
	 * @generated
	 */
	EClass getNegationTemplate();

	/**
	 * Returns the meta object for class '{@link .RelationTemplate <em>Relation Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Template</em>'.
	 * @see .RelationTemplate
	 * @generated
	 */
	EClass getRelationTemplate();

	/**
	 * Returns the meta object for class '{@link .ExistenceTemplate <em>Existence Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Existence Template</em>'.
	 * @see .ExistenceTemplate
	 * @generated
	 */
	EClass getExistenceTemplate();

	/**
	 * Returns the meta object for class '{@link .Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see .Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link .Connection#getTemplateConnection <em>Template Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template Connection</em>'.
	 * @see .Connection#getTemplateConnection()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_TemplateConnection();

	/**
	 * Returns the meta object for the reference '{@link .Connection#getActivityConnection <em>Activity Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity Connection</em>'.
	 * @see .Connection#getActivityConnection()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_ActivityConnection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Factory getFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link .impl.DeclareModelImpl <em>Declare Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.DeclareModelImpl
		 * @see .impl.PackageImpl#getDeclareModel()
		 * @generated
		 */
		EClass DECLARE_MODEL = eINSTANCE.getDeclareModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARE_MODEL__NAME = eINSTANCE.getDeclareModel_Name();

		/**
		 * The meta object literal for the '<em><b>Contains Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARE_MODEL__CONTAINS_ACTIVITY = eINSTANCE.getDeclareModel_ContainsActivity();

		/**
		 * The meta object literal for the '<em><b>Contains Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARE_MODEL__CONTAINS_TEMPLATE = eINSTANCE.getDeclareModel_ContainsTemplate();

		/**
		 * The meta object literal for the '<em><b>Contains Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARE_MODEL__CONTAINS_CONNECTION = eINSTANCE.getDeclareModel_ContainsConnection();

		/**
		 * The meta object literal for the '{@link .impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.ActivityImpl
		 * @see .impl.PackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__NAME = eINSTANCE.getActivity_Name();

		/**
		 * The meta object literal for the '{@link .impl.TemplateImpl <em>Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.TemplateImpl
		 * @see .impl.PackageImpl#getTemplate()
		 * @generated
		 */
		EClass TEMPLATE = eINSTANCE.getTemplate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE__NAME = eINSTANCE.getTemplate_Name();

		/**
		 * The meta object literal for the '<em><b>Ltl Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE__LTL_EXPRESSION = eINSTANCE.getTemplate_LtlExpression();

		/**
		 * The meta object literal for the '{@link .impl.ChoiceTemplateImpl <em>Choice Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.ChoiceTemplateImpl
		 * @see .impl.PackageImpl#getChoiceTemplate()
		 * @generated
		 */
		EClass CHOICE_TEMPLATE = eINSTANCE.getChoiceTemplate();

		/**
		 * The meta object literal for the '{@link .impl.NegationTemplateImpl <em>Negation Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.NegationTemplateImpl
		 * @see .impl.PackageImpl#getNegationTemplate()
		 * @generated
		 */
		EClass NEGATION_TEMPLATE = eINSTANCE.getNegationTemplate();

		/**
		 * The meta object literal for the '{@link .impl.RelationTemplateImpl <em>Relation Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.RelationTemplateImpl
		 * @see .impl.PackageImpl#getRelationTemplate()
		 * @generated
		 */
		EClass RELATION_TEMPLATE = eINSTANCE.getRelationTemplate();

		/**
		 * The meta object literal for the '{@link .impl.ExistenceTemplateImpl <em>Existence Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.ExistenceTemplateImpl
		 * @see .impl.PackageImpl#getExistenceTemplate()
		 * @generated
		 */
		EClass EXISTENCE_TEMPLATE = eINSTANCE.getExistenceTemplate();

		/**
		 * The meta object literal for the '{@link .impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.ConnectionImpl
		 * @see .impl.PackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Template Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TEMPLATE_CONNECTION = eINSTANCE.getConnection_TemplateConnection();

		/**
		 * The meta object literal for the '<em><b>Activity Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__ACTIVITY_CONNECTION = eINSTANCE.getConnection_ActivityConnection();

	}

} //Package
