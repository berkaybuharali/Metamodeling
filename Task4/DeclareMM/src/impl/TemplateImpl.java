/**
 */
package .impl;

import .Template;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link .impl.TemplateImpl#getName <em>Name</em>}</li>
 *   <li>{@link .impl.TemplateImpl#getLtlExpression <em>Ltl Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateImpl extends MinimalEObjectImpl.Container implements Template {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLtlExpression() <em>Ltl Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLtlExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String LTL_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLtlExpression() <em>Ltl Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLtlExpression()
	 * @generated
	 * @ordered
	 */
	protected String ltlExpression = LTL_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return .Package.Literals.TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, .Package.TEMPLATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLtlExpression() {
		return ltlExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLtlExpression(String newLtlExpression) {
		String oldLtlExpression = ltlExpression;
		ltlExpression = newLtlExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, .Package.TEMPLATE__LTL_EXPRESSION, oldLtlExpression, ltlExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case .Package.TEMPLATE__NAME:
				return getName();
			case .Package.TEMPLATE__LTL_EXPRESSION:
				return getLtlExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case .Package.TEMPLATE__NAME:
				setName((String)newValue);
				return;
			case .Package.TEMPLATE__LTL_EXPRESSION:
				setLtlExpression((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case .Package.TEMPLATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case .Package.TEMPLATE__LTL_EXPRESSION:
				setLtlExpression(LTL_EXPRESSION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case .Package.TEMPLATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case .Package.TEMPLATE__LTL_EXPRESSION:
				return LTL_EXPRESSION_EDEFAULT == null ? ltlExpression != null : !LTL_EXPRESSION_EDEFAULT.equals(ltlExpression);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", ltlExpression: ");
		result.append(ltlExpression);
		result.append(')');
		return result.toString();
	}

} //TemplateImpl
