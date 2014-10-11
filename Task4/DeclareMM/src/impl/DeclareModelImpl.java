/**
 */
package .impl;

import .Activity;
import .Connection;
import .DeclareModel;
import .Template;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declare Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link .impl.DeclareModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link .impl.DeclareModelImpl#getContainsActivity <em>Contains Activity</em>}</li>
 *   <li>{@link .impl.DeclareModelImpl#getContainsTemplate <em>Contains Template</em>}</li>
 *   <li>{@link .impl.DeclareModelImpl#getContainsConnection <em>Contains Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeclareModelImpl extends MinimalEObjectImpl.Container implements DeclareModel {
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
	 * The cached value of the '{@link #getContainsActivity() <em>Contains Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> containsActivity;

	/**
	 * The cached value of the '{@link #getContainsTemplate() <em>Contains Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<Template> containsTemplate;

	/**
	 * The cached value of the '{@link #getContainsConnection() <em>Contains Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> containsConnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclareModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return .Package.Literals.DECLARE_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, .Package.DECLARE_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getContainsActivity() {
		if (containsActivity == null) {
			containsActivity = new EObjectContainmentEList<Activity>(Activity.class, this, .Package.DECLARE_MODEL__CONTAINS_ACTIVITY);
		}
		return containsActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Template> getContainsTemplate() {
		if (containsTemplate == null) {
			containsTemplate = new EObjectContainmentEList<Template>(Template.class, this, .Package.DECLARE_MODEL__CONTAINS_TEMPLATE);
		}
		return containsTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getContainsConnection() {
		if (containsConnection == null) {
			containsConnection = new EObjectContainmentEList<Connection>(Connection.class, this, .Package.DECLARE_MODEL__CONTAINS_CONNECTION);
		}
		return containsConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case .Package.DECLARE_MODEL__CONTAINS_ACTIVITY:
				return ((InternalEList<?>)getContainsActivity()).basicRemove(otherEnd, msgs);
			case .Package.DECLARE_MODEL__CONTAINS_TEMPLATE:
				return ((InternalEList<?>)getContainsTemplate()).basicRemove(otherEnd, msgs);
			case .Package.DECLARE_MODEL__CONTAINS_CONNECTION:
				return ((InternalEList<?>)getContainsConnection()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case .Package.DECLARE_MODEL__NAME:
				return getName();
			case .Package.DECLARE_MODEL__CONTAINS_ACTIVITY:
				return getContainsActivity();
			case .Package.DECLARE_MODEL__CONTAINS_TEMPLATE:
				return getContainsTemplate();
			case .Package.DECLARE_MODEL__CONTAINS_CONNECTION:
				return getContainsConnection();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case .Package.DECLARE_MODEL__NAME:
				setName((String)newValue);
				return;
			case .Package.DECLARE_MODEL__CONTAINS_ACTIVITY:
				getContainsActivity().clear();
				getContainsActivity().addAll((Collection<? extends Activity>)newValue);
				return;
			case .Package.DECLARE_MODEL__CONTAINS_TEMPLATE:
				getContainsTemplate().clear();
				getContainsTemplate().addAll((Collection<? extends Template>)newValue);
				return;
			case .Package.DECLARE_MODEL__CONTAINS_CONNECTION:
				getContainsConnection().clear();
				getContainsConnection().addAll((Collection<? extends Connection>)newValue);
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
			case .Package.DECLARE_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case .Package.DECLARE_MODEL__CONTAINS_ACTIVITY:
				getContainsActivity().clear();
				return;
			case .Package.DECLARE_MODEL__CONTAINS_TEMPLATE:
				getContainsTemplate().clear();
				return;
			case .Package.DECLARE_MODEL__CONTAINS_CONNECTION:
				getContainsConnection().clear();
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
			case .Package.DECLARE_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case .Package.DECLARE_MODEL__CONTAINS_ACTIVITY:
				return containsActivity != null && !containsActivity.isEmpty();
			case .Package.DECLARE_MODEL__CONTAINS_TEMPLATE:
				return containsTemplate != null && !containsTemplate.isEmpty();
			case .Package.DECLARE_MODEL__CONTAINS_CONNECTION:
				return containsConnection != null && !containsConnection.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //DeclareModelImpl
