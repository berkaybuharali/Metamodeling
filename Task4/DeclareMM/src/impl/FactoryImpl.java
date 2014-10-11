/**
 */
package .impl;

import .*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FactoryImpl extends EFactoryImpl implements Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Factory init() {
		try {
			Factory theFactory = (Factory)EPackage.Registry.INSTANCE.getEFactory(Package.eNS_URI);
			if (theFactory != null) {
				return theFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Package.DECLARE_MODEL: return createDeclareModel();
			case Package.ACTIVITY: return createActivity();
			case Package.TEMPLATE: return createTemplate();
			case Package.CHOICE_TEMPLATE: return createChoiceTemplate();
			case Package.NEGATION_TEMPLATE: return createNegationTemplate();
			case Package.RELATION_TEMPLATE: return createRelationTemplate();
			case Package.EXISTENCE_TEMPLATE: return createExistenceTemplate();
			case Package.CONNECTION: return createConnection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclareModel createDeclareModel() {
		DeclareModelImpl declareModel = new DeclareModelImpl();
		return declareModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template createTemplate() {
		TemplateImpl template = new TemplateImpl();
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceTemplate createChoiceTemplate() {
		ChoiceTemplateImpl choiceTemplate = new ChoiceTemplateImpl();
		return choiceTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegationTemplate createNegationTemplate() {
		NegationTemplateImpl negationTemplate = new NegationTemplateImpl();
		return negationTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationTemplate createRelationTemplate() {
		RelationTemplateImpl relationTemplate = new RelationTemplateImpl();
		return relationTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistenceTemplate createExistenceTemplate() {
		ExistenceTemplateImpl existenceTemplate = new ExistenceTemplateImpl();
		return existenceTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Package getPackage() {
		return (Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Package getPackage() {
		return Package.eINSTANCE;
	}

} //FactoryImpl
